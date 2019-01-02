package cn.kingcai.entity;

public class BipTLetterbureau {
    private Integer fid;

    private Integer fentryid;

    private Integer fseq;

    private Integer fBipName;

    private String fBipTel;

    private String fBipOnduty;

    private String fBipIsprincipal;

    private String fBipIsgetprovince;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFentryid() {
        return fentryid;
    }

    public void setFentryid(Integer fentryid) {
        this.fentryid = fentryid;
    }

    public Integer getFseq() {
        return fseq;
    }

    public void setFseq(Integer fseq) {
        this.fseq = fseq;
    }

    public Integer getfBipName() {
        return fBipName;
    }

    public void setfBipName(Integer fBipName) {
        this.fBipName = fBipName;
    }

    public String getfBipTel() {
        return fBipTel;
    }

    public void setfBipTel(String fBipTel) {
        this.fBipTel = fBipTel == null ? null : fBipTel.trim();
    }

    public String getfBipOnduty() {
        return fBipOnduty;
    }

    public void setfBipOnduty(String fBipOnduty) {
        this.fBipOnduty = fBipOnduty == null ? null : fBipOnduty.trim();
    }

    public String getfBipIsprincipal() {
        return fBipIsprincipal;
    }

    public void setfBipIsprincipal(String fBipIsprincipal) {
        this.fBipIsprincipal = fBipIsprincipal == null ? null : fBipIsprincipal.trim();
    }

    public String getfBipIsgetprovince() {
        return fBipIsgetprovince;
    }

    public void setfBipIsgetprovince(String fBipIsgetprovince) {
        this.fBipIsgetprovince = fBipIsgetprovince == null ? null : fBipIsgetprovince.trim();
    }
}