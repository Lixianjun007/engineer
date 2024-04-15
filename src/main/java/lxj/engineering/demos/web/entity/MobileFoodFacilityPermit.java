package lxj.engineering.demos.web.entity;

import cn.hutool.core.annotation.Alias;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author lxj
 * @description
 * @date 2024/4/14 11:02
 */
public class MobileFoodFacilityPermit {
    private Long locationid;
    private String Applicant;
    @ApiModelProperty("设施类型")
    @Alias("FacilityType")
    private String facilityType;
    private String cnn;
    private String LocationDescription;
    private String Address;
    private String blocklot;
    private String block;
    private String lot;
    private String permit;
    @ApiModelProperty("状态")
    @Alias("Status")
    private String status;
    @Alias("FoodItems")
    private String foodItems;
    private String X;
    private String Y;
    @Alias("Latitude")
    private Double latitude;
    @Alias("Longitude")
    private Double longitude;
    private String Schedule;
    private String dayshours;
    private String NOISent;
    private String Approved;
    private String Received;
    private String PriorPermit;
    private String ExpirationDate;
    private String Location;
    @Alias("Fire Prevention Districts")
    private String FirePreventionDistricts;
    @Alias("Police Districts")
    private String PoliceDistricts;
    @Alias("Supervisor Districts")
    private String SupervisorDistricts;
    @Alias("Zip Codes")
    private String ZipCodes;
    @Alias("Neighborhoods (old)")
    private String NeighborhoodsOld;

    public MobileFoodFacilityPermit() {
    }

    public MobileFoodFacilityPermit(String[] columns) {
        this.locationid = Long.valueOf(columns[0]);
        Applicant = columns[1];
        this.facilityType = columns[2];
        this.cnn = columns[3];
        LocationDescription = columns[4];
        Address = columns[5];
        this.blocklot = columns[6];
        this.block = columns[7];
        this.lot = columns[8];
        this.permit = columns[9];
        status = columns[10];
        foodItems = columns[11];
        X = columns[12];
        Y = columns[13];
        latitude = Double.valueOf(columns[14]);
        longitude = Double.valueOf(columns[15]);
        Schedule = columns[16];
        this.dayshours = columns[17];
        this.NOISent = columns[18];
        Approved = columns[19];
        Received = columns[20];
        PriorPermit = columns[21];
        ExpirationDate = columns[22];
        Location = columns[23];
        FirePreventionDistricts = columns[24];
        PoliceDistricts = columns[25];
        SupervisorDistricts = columns[26];
        ZipCodes = columns[27];
        NeighborhoodsOld = columns[28];
    }

    public Long getLocationid() {
        return locationid;
    }

    public void setLocationid(Long locationid) {
        this.locationid = locationid;
    }

    public String getApplicant() {
        return Applicant;
    }

    public void setApplicant(String applicant) {
        Applicant = applicant;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getCnn() {
        return cnn;
    }

    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    public String getLocationDescription() {
        return LocationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        LocationDescription = locationDescription;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBlocklot() {
        return blocklot;
    }

    public void setBlocklot(String blocklot) {
        this.blocklot = blocklot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public String getY() {
        return Y;
    }

    public void setY(String y) {
        Y = y;
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

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public String getDayshours() {
        return dayshours;
    }

    public void setDayshours(String dayshours) {
        this.dayshours = dayshours;
    }

    public String getNOISent() {
        return NOISent;
    }

    public void setNOISent(String NOISent) {
        this.NOISent = NOISent;
    }

    public String getApproved() {
        return Approved;
    }

    public void setApproved(String approved) {
        Approved = approved;
    }

    public String getReceived() {
        return Received;
    }

    public void setReceived(String received) {
        Received = received;
    }

    public String getPriorPermit() {
        return PriorPermit;
    }

    public void setPriorPermit(String priorPermit) {
        PriorPermit = priorPermit;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getFirePreventionDistricts() {
        return FirePreventionDistricts;
    }

    public void setFirePreventionDistricts(String firePreventionDistricts) {
        FirePreventionDistricts = firePreventionDistricts;
    }

    public String getPoliceDistricts() {
        return PoliceDistricts;
    }

    public void setPoliceDistricts(String policeDistricts) {
        PoliceDistricts = policeDistricts;
    }

    public String getSupervisorDistricts() {
        return SupervisorDistricts;
    }

    public void setSupervisorDistricts(String supervisorDistricts) {
        SupervisorDistricts = supervisorDistricts;
    }

    public String getZipCodes() {
        return ZipCodes;
    }

    public void setZipCodes(String zipCodes) {
        ZipCodes = zipCodes;
    }

    public String getNeighborhoodsOld() {
        return NeighborhoodsOld;
    }

    public void setNeighborhoodsOld(String neighborhoodsOld) {
        NeighborhoodsOld = neighborhoodsOld;
    }
}
