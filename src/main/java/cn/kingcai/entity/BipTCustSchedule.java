package cn.kingcai.entity;

import java.util.Date;

public class BipTCustSchedule {
    private Long fid;

    private String fbillno;

    private String fdocumentstatus;

    private Date fBipStartdatetime;

    private Date fBipEnddatetime;

    private Date fBipReminddatetime;

    private String fBipTheme;

    private String fBipType;

    private String fBipImportance;

    private String fBipParticipants;

    private String fBipNeedfile;

    private String fBipFinish;

    private String fBipDetails;

    private Integer fcreatorid;

    private Date fcreatedate;

    private Integer fmodifierid;

    private Date fmodifydate;

    private Integer fBipChecker;

    private Date fBipChecktime;

    private String fBipIsfirstremind;

    private String fBipIsoverremind;

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

    public Date getfBipStartdatetime() {
        return fBipStartdatetime;
    }

    public void setfBipStartdatetime(Date fBipStartdatetime) {
        this.fBipStartdatetime = fBipStartdatetime;
    }

    public Date getfBipEnddatetime() {
        return fBipEnddatetime;
    }

    public void setfBipEnddatetime(Date fBipEnddatetime) {
        this.fBipEnddatetime = fBipEnddatetime;
    }

    public Date getfBipReminddatetime() {
        return fBipReminddatetime;
    }

    public void setfBipReminddatetime(Date fBipReminddatetime) {
        this.fBipReminddatetime = fBipReminddatetime;
    }

    public String getfBipTheme() {
        return fBipTheme;
    }

    public void setfBipTheme(String fBipTheme) {
        this.fBipTheme = fBipTheme == null ? null : fBipTheme.trim();
    }

    public String getfBipType() {
        return fBipType;
    }

    public void setfBipType(String fBipType) {
        this.fBipType = fBipType == null ? null : fBipType.trim();
    }

    public String getfBipImportance() {
        return fBipImportance;
    }

    public void setfBipImportance(String fBipImportance) {
        this.fBipImportance = fBipImportance == null ? null : fBipImportance.trim();
    }

    public String getfBipParticipants() {
        return fBipParticipants;
    }

    public void setfBipParticipants(String fBipParticipants) {
        this.fBipParticipants = fBipParticipants == null ? null : fBipParticipants.trim();
    }

    public String getfBipNeedfile() {
        return fBipNeedfile;
    }

    public void setfBipNeedfile(String fBipNeedfile) {
        this.fBipNeedfile = fBipNeedfile == null ? null : fBipNeedfile.trim();
    }

    public String getfBipFinish() {
        return fBipFinish;
    }

    public void setfBipFinish(String fBipFinish) {
        this.fBipFinish = fBipFinish == null ? null : fBipFinish.trim();
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

    public String getfBipIsfirstremind() {
        return fBipIsfirstremind;
    }

    public void setfBipIsfirstremind(String fBipIsfirstremind) {
        this.fBipIsfirstremind = fBipIsfirstremind == null ? null : fBipIsfirstremind.trim();
    }

    public String getfBipIsoverremind() {
        return fBipIsoverremind;
    }

    public void setfBipIsoverremind(String fBipIsoverremind) {
        this.fBipIsoverremind = fBipIsoverremind == null ? null : fBipIsoverremind.trim();
    }

    public String getfBipBillcreater() {
        return fBipBillcreater;
    }

    public void setfBipBillcreater(String fBipBillcreater) {
        this.fBipBillcreater = fBipBillcreater == null ? null : fBipBillcreater.trim();
    }
}