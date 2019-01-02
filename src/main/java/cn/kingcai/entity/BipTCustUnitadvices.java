package cn.kingcai.entity;

import java.util.Date;

public class BipTCustUnitadvices {
    private Long fid;

    private Long fentryid;

    private Integer fseq;

    private Integer fBipUnitleadername;

    private Date fBipUnitadvicetime;

    private String fBipUnitdealadvice;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getFentryid() {
        return fentryid;
    }

    public void setFentryid(Long fentryid) {
        this.fentryid = fentryid;
    }

    public Integer getFseq() {
        return fseq;
    }

    public void setFseq(Integer fseq) {
        this.fseq = fseq;
    }

    public Integer getfBipUnitleadername() {
        return fBipUnitleadername;
    }

    public void setfBipUnitleadername(Integer fBipUnitleadername) {
        this.fBipUnitleadername = fBipUnitleadername;
    }

    public Date getfBipUnitadvicetime() {
        return fBipUnitadvicetime;
    }

    public void setfBipUnitadvicetime(Date fBipUnitadvicetime) {
        this.fBipUnitadvicetime = fBipUnitadvicetime;
    }

    public String getfBipUnitdealadvice() {
        return fBipUnitdealadvice;
    }

    public void setfBipUnitdealadvice(String fBipUnitdealadvice) {
        this.fBipUnitdealadvice = fBipUnitdealadvice == null ? null : fBipUnitdealadvice.trim();
    }
}