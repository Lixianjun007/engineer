package lxj.engineering.demos.web.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;
import com.google.common.base.Strings;
import lxj.engineering.demos.web.dto.FoodSearchRequestDto;
import lxj.engineering.demos.web.dto.FoodSearchResponseDto;
import lxj.engineering.demos.web.entity.MobileFoodFacilityPermit;
import lxj.engineering.demos.web.service.BasicService;
import lxj.engineering.demos.web.util.CSVReader;
import lxj.engineering.demos.web.util.LocationUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lxj
 * @description
 * @date 2024/4/14 12:14
 */
@Service
public class BasicServiceImpl implements BasicService {


    public List<String> getStatus() {
        /**
         * "APPROVED"      已批准，
         * "REQUESTED"     已请求，
         * "EXPIRED"       过期，
         * "ISSUED"        已发布，
         * "SUSPEND"       暂停
         */
        return CSVReader.getListData().stream().map(MobileFoodFacilityPermit::getStatus).distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> getFacilityType() {
        /**
         * "Truck",    卡车
         * "Push Cart", 推车
         * ""
         */
        return CSVReader.getListData().stream().map(MobileFoodFacilityPermit::getFacilityType).distinct().collect(Collectors.toList());
    }

    @Override
    public List<FoodSearchResponseDto> searchList(FoodSearchRequestDto dto) {
        List<FoodSearchResponseDto> result = BeanUtil.copyToList(CSVReader.getListData(), FoodSearchResponseDto.class);
        Stream<FoodSearchResponseDto> stream = result.stream();
        if (StrUtil.isNotBlank(dto.getStatus())) {
            stream = stream.filter(
                    mobileFoodFacilityPermit -> dto.getStatus().equalsIgnoreCase(mobileFoodFacilityPermit.getStatus())
            );
        }
        if (StrUtil.isNotBlank(dto.getFacilityType())) {
            stream = stream.filter(
                    mobileFoodFacilityPermit -> dto.getFacilityType().equalsIgnoreCase(mobileFoodFacilityPermit.getFacilityType())
            );
        }
        if (StrUtil.isNotBlank(dto.getFoodItems())) {
            stream = stream.filter(
                    mobileFoodFacilityPermit -> StrUtil.contains(mobileFoodFacilityPermit.getFoodItems(), dto.getFoodItems())
            );
        }
        result = stream.collect(Collectors.toList());
        if(ObjUtil.isNotNull(dto.getLongitude()) && ObjUtil.isNotNull(dto.getLatitude())){
            //计算距离
            result.forEach(a->{
                double distance = LocationUtils.getDistance(dto.getLatitude(), dto.getLongitude(), a.getLatitude(), a.getLongitude());
                a.setDistance(distance);
            });
        }

        stream = result.stream();
        if (dto.getOrderByDistant()) {
            stream = stream.sorted(Comparator.comparing(FoodSearchResponseDto::getDistance));
        }
        return stream.collect(Collectors.toList());
    }

    @Override
    public FoodSearchResponseDto detailByLocationId(FoodSearchRequestDto dto) {
        FoodSearchResponseDto result = new FoodSearchResponseDto();
        Optional<MobileFoodFacilityPermit> first = CSVReader.getListData().stream().filter(a -> a.getLocationid().equals(dto.getLocationid())).findFirst();
        if(first.isPresent()){
            result = BeanUtil.toBean(first.get(), FoodSearchResponseDto.class);
            result.setDistance(LocationUtils.getDistance(dto.getLatitude(), dto.getLongitude(), result.getLatitude(), result.getLongitude()));
        }
        return result;
    }


}
