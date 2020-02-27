package tech.feily.nCoV.utils;

public class CSVUtils {

    static private String csvOverallTitle = "updateTime, currentConfirmedCount, confirmedCount, suspectedCount"
            + ", curedCount, deadCount, seriousCount, generalRemark, abroadRemark, remark1, remark2"
            + ", remark3, remark4, remark5, note1, note2, note3";
    static private String csvAreaTitle ="updateTime, provinceName, provinceShortName, currentConfirmedCount,"
            + "confirmedCount, suspectedCount, curedCount, deadCount, comment, locationId, statisticsData, "
            + "countryName, countryEnglishName, continentName, continentEnglishName, provinceEnglishName";
    
    public static String getCSVOverallTitle() {
        return csvOverallTitle;
    }
    
    public static String getCSVAreaTitle() {
        return csvAreaTitle;
    }
    
}