package cn.kingcai.entity;

import java.util.Date;

public class BipTFocusleadership {
    private Integer fid;

    private String fdocumentstatus;

    private String fforbidstatus;

    private String fnumber;

    private Date fcreatedate;

    private Date fmodifydate;

    private Date fforbiddate;

    private Integer fmodifierid;

    private Date fapprovedate;

    private Integer fcreatorid;

    private Integer fBipDisableid;

    private Integer fBipAuditorid;

    private Integer fuseorgid;

    private Integer fcreateorgid;

    private String fname;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFdocumentstatus() {
        return fdocumentstatus;
    }

    public void setFdocumentstatus(String fdocumentstatus) {
        this.fdocumentstatus = fdocumentstatus == null ? null : fdocumentstatus.trim();
    }

    public String getFforbidstatus() {
        return fforbidstatus;
    }

    public void setFforbidstatus(String fforbidstatus) {
        this.fforbidstatus = fforbidstatus == null ? null : fforbidstatus.trim();
    }

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber == null ? null : fnumber.trim();
    }

    public Date getFcreatedate() {
        return fcreatedate;
    }

    public void setFcreatedate(Date fcreatedate) {
        this.fcreatedate = fcreatedate;
    }

    public Date getFmodifydate() {
        return fmodifydate;
    }

    public void setFmodifydate(Date fmodifydate) {
        this.fmodifydate = fmodifydate;
    }

    public Date getFforbiddate() {
        return fforbiddate;
    }

    public void setFforbiddate(Date fforbiddate) {
        this.fforbiddate = fforbiddate;
    }

    public Integer getFmodifierid() {
        return fmodifierid;
    }

    public void setFmodifierid(Integer fmodifierid) {
        this.fmodifierid = fmodifierid;
    }

    public Date getFapprovedate() {
        return fapprovedate;
    }

    public void setFapprovedate(Date fapprovedate) {
        this.fapprovedate = fapprovedate;
    }

    public Integer getFcreatorid() {
        return fcreatorid;
    }

    public void setFcreatorid(Integer fcreatorid) {
        this.fcreatorid = fcreatorid;
    }

    public Integer getfBipDisableid() {
        return fBipDisableid;
    }

    public void setfBipDisableid(Integer fBipDisableid) {
        this.fBipDisableid = fBipDisableid;
    }

    public Integer getfBipAuditorid() {
        return fBipAuditorid;
    }

    public void setfBipAuditorid(Integer fBipAuditorid) {
        this.fBipAuditorid = fBipAuditorid;
    }

    public Integer getFuseorgid() {
        return fuseorgid;
    }

    public void setFuseorgid(Integer fuseorgid) {
        this.fuseorgid = fuseorgid;
    }

    public Integer getFcreateorgid() {
        return fcreateorgid;
    }

    public void setFcreateorgid(Integer fcreateorgid) {
        this.fcreateorgid = fcreateorgid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }
}