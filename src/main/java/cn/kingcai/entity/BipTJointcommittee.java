package cn.kingcai.entity;

public class BipTJointcommittee {
    private Integer fid;

    private Integer fentryid;

    private Integer fseq;

    private String fBipTelephone;

    private Integer fBipName;

    private String fBipIsgetmessage;

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

    public String getfBipTelephone() {
        return fBipTelephone;
    }

    public void setfBipTelephone(String fBipTelephone) {
        this.fBipTelephone = fBipTelephone == null ? null : fBipTelephone.trim();
    }

    public Integer getfBipName() {
        return fBipName;
    }

    public void setfBipName(Integer fBipName) {
        this.fBipName = fBipName;
    }

    public String getfBipIsgetmessage() {
        return fBipIsgetmessage;
    }

    public void setfBipIsgetmessage(String fBipIsgetmessage) {
        this.fBipIsgetmessage = fBipIsgetmessage == null ? null : fBipIsgetmessage.trim();
    }
}