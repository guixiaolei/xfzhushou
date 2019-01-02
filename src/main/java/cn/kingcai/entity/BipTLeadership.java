package cn.kingcai.entity;

import java.util.Date;

public class BipTLeadership {
    private Integer fid;

    private Integer fentryid;

    private Integer fseq;

    private String fBipTel;

    private Integer fBipName;

    private String fBipCheckbox;

    private Integer fBipLeader;

    private String fBipLeadershipadvice;

    private Date fBipDate;

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

    public String getfBipTel() {
        return fBipTel;
    }

    public void setfBipTel(String fBipTel) {
        this.fBipTel = fBipTel == null ? null : fBipTel.trim();
    }

    public Integer getfBipName() {
        return fBipName;
    }

    public void setfBipName(Integer fBipName) {
        this.fBipName = fBipName;
    }

    public String getfBipCheckbox() {
        return fBipCheckbox;
    }

    public void setfBipCheckbox(String fBipCheckbox) {
        this.fBipCheckbox = fBipCheckbox == null ? null : fBipCheckbox.trim();
    }

    public Integer getfBipLeader() {
        return fBipLeader;
    }

    public void setfBipLeader(Integer fBipLeader) {
        this.fBipLeader = fBipLeader;
    }

    public String getfBipLeadershipadvice() {
        return fBipLeadershipadvice;
    }

    public void setfBipLeadershipadvice(String fBipLeadershipadvice) {
        this.fBipLeadershipadvice = fBipLeadershipadvice == null ? null : fBipLeadershipadvice.trim();
    }

    public Date getfBipDate() {
        return fBipDate;
    }

    public void setfBipDate(Date fBipDate) {
        this.fBipDate = fBipDate;
    }
}