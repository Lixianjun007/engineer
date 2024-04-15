package lxj.engineering.demos.web.service;

import lxj.engineering.demos.web.dto.FoodSearchRequestDto;
import lxj.engineering.demos.web.dto.FoodSearchResponseDto;

import java.util.List;

/**
 * @author lxj
 * @description
 * @date 2024/4/14 12:14
 */
public interface BasicService {

    List<String> getStatus();
    List<String> getFacilityType();

    List<FoodSearchResponseDto> searchList(FoodSearchRequestDto dto);

    FoodSearchResponseDto detailByLocationId(FoodSearchRequestDto dto);
}
