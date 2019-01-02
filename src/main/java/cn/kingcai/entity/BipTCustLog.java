package cn.kingcai.entity;

import java.util.Date;

public class BipTCustLog {
    private Long fid;

    private String fbillno;

    private String fdocumentstatus;

    private Date fBipLogdate;

    private String fBipMorning;

    private String fBipAfternoon;

    private String fBipNight;

    private String fBipDetails;

    private Integer fcreatorid;

    private Date fcreatedate;

    private Integer fmodifierid;

    private Date fmodifydate;

    private Integer fBipChecker;

    private Date fBipChecktime;

    private String fBipBillcreater;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getFbillno() {
        return fbillno;
    }

    public void setFbillno(String fbillno) {
        this.fbillno = fbillno == null ? null : fbillno.trim();
    }

    public String getFdocumentstatus() {
        return fdocumentstatus;
    }

    public void setFdocumentstatus(String fdocumentstatus) {
        this.fdocumentstatus = fdocumentstatus == null ? null : fdocumentstatus.trim();
    }

    public Date getfBipLogdate() {
        return fBipLogdate;
    }

    public void setfBipLogdate(Date fBipLogdate) {
        this.fBipLogdate = fBipLogdate;
    }

    public String getfBipMorning() {
        return fBipMorning;
    }

    public void setfBipMorning(String fBipMorning) {
        this.fBipMorning = fBipMorning == null ? null : fBipMorning.trim();
    }

    public String getfBipAfternoon() {
        return fBipAfternoon;
    }

    public void setfBipAfternoon(String fBipAfternoon) {
        this.fBipAfternoon = fBipAfternoon == null ? null : fBipAfternoon.trim();
    }

    public String getfBipNight() {
        return fBipNight;
    }

    public void setfBipNight(String fBipNight) {
        this.fBipNight = fBipNight == null ? null : fBipNight.trim();
    }

    public String getfBipDetails() {
        return fBipDetails;
    }

    public void setfBipDetails(String fBipDetails) {
        this.fBipDetails = fBipDetails == null ? null : fBipDetails.trim();
    }

    public Integer getFcreatorid() {
        return fcreatorid;
    }

    public void setFcreatorid(Integer fcreatorid) {
        this.fcreatorid = fcreatorid;
    }

    public Date getFcreatedate() {
        return fcreatedate;
    }

    public void setFcreatedate(Date fcreatedate) {
        this.fcreatedate = fcreatedate;
    }

    public Integer getFmodifierid() {
        return fmodifierid;
    }

    public void setFmodifierid(Integer fmodifierid) {
        this.fmodifierid = fmodifierid;
    }

    public Date getFmodifydate() {
        return fmodifydate;
    }

    public void setFmodifydate(Date fmodifydate) {
        this.fmodifydate = fmodifydate;
    }

    public Integer getfBipChecker() {
        return fBipChecker;
    }

    public void setfBipChecker(Integer fBipChecker) {
        this.fBipChecker = fBipChecker;
    }

    public Date getfBipChecktime() {
        return fBipChecktime;
    }

    public void setfBipChecktime(Date fBipChecktime) {
        this.fBipChecktime = fBipChecktime;
    }

    public String getfBipBillcreater() {
        return fBipBillcreater;
    }

    public void setfBipBillcreater(String fBipBillcreater) {
        this.fBipBillcreater = fBipBillcreater == null ? null : fBipBillcreater.trim();
    }
}