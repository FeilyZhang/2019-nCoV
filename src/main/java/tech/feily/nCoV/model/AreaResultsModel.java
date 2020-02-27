package tech.feily.nCoV.model;

import java.sql.Timestamp;
import java.util.List;

public class AreaResultsModel {

    private long updateTime;
    private String provinceName;
    private String provinceShortName;
    private int currentConfirmedCount;
    private int confirmedCount;
    private int suspectedCount;
    private int curedCount;
    private int deadCount;
    private String comment;
    private int locationId;
    private String statisticsData;
    private List<AreaCitiesModel> cities;
    private String countryName;
    private String countryEnglishName;
    private String continentName;
    private String continentEnglishName;
    private String provinceEnglishName;
    public long getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public String getProvinceShortName() {
        return provinceShortName;
    }
    public void setProvinceShortName(String provinceShortName) {
        this.provinceShortName = provinceShortName;
    }
    public int getCurrentConfirmedCount() {
        return currentConfirmedCount;
    }
    public void setCurrentConfirmedCount(int currentConfirmedCount) {
        this.currentConfirmedCount = currentConfirmedCount;
    }
    public int getConfirmedCount() {
        return confirmedCount;
    }
    public void setConfirmedCount(int confirmedCount) {
        this.confirmedCount = confirmedCount;
    }
    public int getSuspectedCount() {
        return suspectedCount;
    }
    public void setSuspectedCount(int suspectedCount) {
        this.suspectedCount = suspectedCount;
    }
    public int getCuredCount() {
        return curedCount;
    }
    public void setCuredCount(int curedCount) {
        this.curedCount = curedCount;
    }
    public int getDeadCount() {
        return deadCount;
    }
    public void setDeadCount(int deadCount) {
        this.deadCount = deadCount;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public int getLocationId() {
        return locationId;
    }
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
    public String getStatisticsData() {
        return statisticsData;
    }
    public void setStatisticsData(String statisticsData) {
        this.statisticsData = statisticsData;
    }
    public List<AreaCitiesModel> getCities() {
        return cities;
    }
    public void setCities(List<AreaCitiesModel> cities) {
        this.cities = cities;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryEnglishName() {
        return countryEnglishName;
    }
    public void setCountryEnglishName(String countryEnglishName) {
        this.countryEnglishName = countryEnglishName;
    }
    public String getContinentName() {
        return continentName;
    }
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
    public String getContinentEnglishName() {
        return continentEnglishName;
    }
    public void setContinentEnglishName(String continentEnglishName) {
        this.continentEnglishName = continentEnglishName;
    }
    public String getProvinceEnglishName() {
        return provinceEnglishName;
    }
    public void setProvinceEnglishName(String provinceEnglishName) {
        this.provinceEnglishName = provinceEnglishName;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new Timestamp(updateTime) + ", ");
        sb.append(provinceName + ", ");
        sb.append(provinceShortName + ", ");
        sb.append(currentConfirmedCount + ", ");
        sb.append(confirmedCount + ", ");
        sb.append(suspectedCount + ", ");
        sb.append(curedCount + ", ");
        sb.append(deadCount + ", ");
        sb.append(comment + ", ");
        sb.append(locationId + ", ");
        sb.append(statisticsData + ", ");
        sb.append(cities.toString() + ", ");
        sb.append(countryName + ", ");
        sb.append(countryEnglishName + ", ");
        sb.append(continentName + ", ");
        sb.append(continentEnglishName + ", ");
        sb.append(provinceEnglishName + "\n");
        return sb.toString();
    }
    
    public String toStringWithoutCities() {
        StringBuilder sb = new StringBuilder();
        sb.append(new Timestamp(updateTime) + ", ");
        sb.append(provinceName + ", ");
        sb.append(provinceShortName + ", ");
        sb.append(currentConfirmedCount + ", ");
        sb.append(confirmedCount + ", ");
        sb.append(suspectedCount + ", ");
        sb.append(curedCount + ", ");
        sb.append(deadCount + ", ");
        sb.append(comment + ", ");
        sb.append(locationId + ", ");
        sb.append(statisticsData + ", ");
        sb.append(countryName + ", ");
        sb.append(countryEnglishName + ", ");
        sb.append(continentName + ", ");
        sb.append(continentEnglishName + ", ");
        sb.append(provinceEnglishName + "\n");
        return sb.toString();
    }
    
}