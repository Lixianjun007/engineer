package lxj.engineering.demos.web.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author lxj
 * @description
 * @date 2024/4/14 12:28
 */
public class FoodSearchRequestDto {
    @ApiModelProperty("id")
    private Long locationid;
    @ApiModelProperty("状态:  \"APPROVED\"已批准，\"REQUESTED\"已请求，\"EXPIRED\"过期，\"ISSUED\"已发布，\"SUSPEND\"暂停\n")
    private String status;
    @ApiModelProperty("设施类型 ：     * \"Truck\",    卡车     \"Push Cart\", 推车")
    private String facilityType;
    @ApiModelProperty("食物类型 模糊搜索")
    private String foodItems;

    @ApiModelProperty("是否根据距离从近到远排序")
    private Boolean orderByDistant = false;
    @ApiModelProperty("坐标系")
    private Double latitude;
    @ApiModelProperty("坐标系")
    private Double longitude;

    public FoodSearchRequestDto() {
    }

    public Long getLocationid() {
        return locationid;
    }

    public void setLocationid(Long locationid) {
        this.locationid = locationid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public Boolean getOrderByDistant() {
        return orderByDistant;
    }

    public void setOrderByDistant(Boolean orderByDistant) {
        this.orderByDistant = orderByDistant;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
