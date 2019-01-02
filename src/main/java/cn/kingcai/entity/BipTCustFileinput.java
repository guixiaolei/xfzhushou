package cn.kingcai.entity;

import java.util.Date;

public class BipTCustFileinput {
    private Long fid;

    private String fbillno;

    private String fdocumentstatus;

    private String fBipFiletype;

    private String fBipFilename;

    private Date fBipInputtime;

    private String fBipSecret;

    private String fBipClaim;

    private String fBipImplementation;

    private String fBipLeaderadvice;

    private String fBipBigleaderadvice;

    private String fBipMoremessage;

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

    public String getfBipFiletype() {
        return fBipFiletype;
    }

    public void setfBipFiletype(String fBipFiletype) {
        this.fBipFiletype = fBipFiletype == null ? null : fBipFiletype.trim();
    }

    public String getfBipFilename() {
        return fBipFilename;
    }

    public void setfBipFilename(String fBipFilename) {
        this.fBipFilename = fBipFilename == null ? null : fBipFilename.trim();
    }

    public Date getfBipInputtime() {
        return fBipInputtime;
    }

    public void setfBipInputtime(Date fBipInputtime) {
        this.fBipInputtime = fBipInputtime;
    }

    public String getfBipSecret() {
        return fBipSecret;
    }

    public void setfBipSecret(String fBipSecret) {
        this.fBipSecret = fBipSecret == null ? null : fBipSecret.trim();
    }

    public String getfBipClaim() {
        return fBipClaim;
    }

    public void setfBipClaim(String fBipClaim) {
        this.fBipClaim = fBipClaim == null ? null : fBipClaim.trim();
    }

    public String getfBipImplementation() {
        return fBipImplementation;
    }

    public void setfBipImplementation(String fBipImplementation) {
        this.fBipImplementation = fBipImplementation == null ? null : fBipImplementation.trim();
    }

    public String getfBipLeaderadvice() {
        return fBipLeaderadvice;
    }

    public void setfBipLeaderadvice(String fBipLeaderadvice) {
        this.fBipLeaderadvice = fBipLeaderadvice == null ? null : fBipLeaderadvice.trim();
    }

    public String getfBipBigleaderadvice() {
        return fBipBigleaderadvice;
    }

    public void setfBipBigleaderadvice(String fBipBigleaderadvice) {
        this.fBipBigleaderadvice = fBipBigleaderadvice == null ? null : fBipBigleaderadvice.trim();
    }

    public String getfBipMoremessage() {
        return fBipMoremessage;
    }

    public void setfBipMoremessage(String fBipMoremessage) {
        this.fBipMoremessage = fBipMoremessage == null ? null : fBipMoremessage.trim();
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