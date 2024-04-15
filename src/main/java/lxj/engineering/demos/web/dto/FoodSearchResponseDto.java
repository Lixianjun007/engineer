package lxj.engineering.demos.web.dto;

import io.swagger.annotations.ApiModelProperty;
import lxj.engineering.demos.web.entity.MobileFoodFacilityPermit;

/**
 * @author lxj
 * @description
 * @date 2024/4/14 13:09
 */
public class FoodSearchResponseDto extends MobileFoodFacilityPermit {

    //距离 单位公里
    @ApiModelProperty("是否根据距离从近到远排序")
    private Double distance;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
