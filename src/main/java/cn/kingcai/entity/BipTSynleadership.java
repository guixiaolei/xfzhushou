package cn.kingcai.entity;

import java.util.Date;

public class BipTSynleadership {
    private Long fid;

    private Long fentryid;

    private Integer fseq;

    private Date fBipDatetime;

    private String fBipLeadershipadvice;

    private Integer fBipLeader;

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

    public Date getfBipDatetime() {
        return fBipDatetime;
    }

    public void setfBipDatetime(Date fBipDatetime) {
        this.fBipDatetime = fBipDatetime;
    }

    public String getfBipLeadershipadvice() {
        return fBipLeadershipadvice;
    }

    public void setfBipLeadershipadvice(String fBipLeadershipadvice) {
        this.fBipLeadershipadvice = fBipLeadershipadvice == null ? null : fBipLeadershipadvice.trim();
    }

    public Integer getfBipLeader() {
        return fBipLeader;
    }

    public void setfBipLeader(Integer fBipLeader) {
        this.fBipLeader = fBipLeader;
    }
}