package tech.feily.nCoV.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class OverallResultsModel implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -4175857790972760893L;
    
    private int currentConfirmedCount;
    private int confirmedCount;
    private int suspectedCount;
    private int curedCount;
    private int deadCount;
    private int seriousCount;
    private String generalRemark;
    private String abroadRemark;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String note1;
    private String note2;
    private String note3;
    private Long updateTime;
    
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
    
    public int getSeriousCount() {
        return seriousCount;
    }
    public void setSeriousCount(int seriousCount) {
        this.seriousCount = seriousCount;
    }
    
    public String getGeneralRemark() {
        return generalRemark;
    }
    public void setGeneralRemark(String generalRemark) {
        this.generalRemark = generalRemark;
    }
    
    public String getAbroadRemark() {
        return abroadRemark;
    }
    public void setAbroadRemark(String abroadRemark) {
        this.abroadRemark = abroadRemark;
    }
    
    public String getRemark1() {
        return remark1;
    }
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }
    
    public String getRemark2() {
        return remark2;
    }
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
    
    public String getRemark3() {
        return remark3;
    }
    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }
    
    public String getRemark4() {
        return remark4;
    }
    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }
    
    public String getRemark5() {
        return remark5;
    }
    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }
    
    public String getNote1() {
        return note1;
    }
    public void setNote1(String note1) {
        this.note1 = note1;
    }
    
    public String getNote2() {
        return note2;
    }
    public void setNote2(String note2) {
        this.note2 = note2;
    }
    
    public String getNote3() {
        return note3;
    }
    public void setNote3(String note3) {
        this.note3 = note3;
    }
    
    public Long getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new Timestamp(updateTime) + ", ");
        sb.append(currentConfirmedCount + ", ");
        sb.append(confirmedCount + ", ");
        sb.append(suspectedCount + ", ");
        sb.append(curedCount + ", ");
        sb.append(deadCount + ", ");
        sb.append(seriousCount + ", ");
        sb.append(generalRemark + ", ");
        sb.append(abroadRemark + ", ");
        sb.append(remark1 + ", ");
        sb.append(remark2 + ", ");
        sb.append(remark3 + ", ");
        sb.append(remark4 + ", ");
        sb.append(remark5 + ", ");
        sb.append(remark3 + ", ");
        sb.append(remark4 + ", ");
        sb.append(remark5 + "\n");
        return sb.toString();
    }
}