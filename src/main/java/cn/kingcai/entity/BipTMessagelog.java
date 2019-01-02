package cn.kingcai.entity;

import java.util.Date;

public class BipTMessagelog {
    private Long fid;

    private String fformid;

    private String fBipMessagetype;

    private String fBipAffairsunit;

    private String fBipMessagegeter;

    private String fBipIssuccess;

    private Date fBipMessageposttime;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getFformid() {
        return fformid;
    }

    public void setFformid(String fformid) {
        this.fformid = fformid == null ? null : fformid.trim();
    }

    public String getfBipMessagetype() {
        return fBipMessagetype;
    }

    public void setfBipMessagetype(String fBipMessagetype) {
        this.fBipMessagetype = fBipMessagetype == null ? null : fBipMessagetype.trim();
    }

    public String getfBipAffairsunit() {
        return fBipAffairsunit;
    }

    public void setfBipAffairsunit(String fBipAffairsunit) {
        this.fBipAffairsunit = fBipAffairsunit == null ? null : fBipAffairsunit.trim();
    }

    public String getfBipMessagegeter() {
        return fBipMessagegeter;
    }

    public void setfBipMessagegeter(String fBipMessagegeter) {
        this.fBipMessagegeter = fBipMessagegeter == null ? null : fBipMessagegeter.trim();
    }

    public String getfBipIssuccess() {
        return fBipIssuccess;
    }

    public void setfBipIssuccess(String fBipIssuccess) {
        this.fBipIssuccess = fBipIssuccess == null ? null : fBipIssuccess.trim();
    }

    public Date getfBipMessageposttime() {
        return fBipMessageposttime;
    }

    public void setfBipMessageposttime(Date fBipMessageposttime) {
        this.fBipMessageposttime = fBipMessageposttime;
    }
}