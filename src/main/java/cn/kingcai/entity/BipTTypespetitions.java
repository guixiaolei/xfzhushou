package cn.kingcai.entity;

import java.util.Date;

public class BipTTypespetitions {
    private Integer fid;

    private Integer fmasterid;

    private String fdocumentstatus;

    private String fforbidstatus;

    private String fnumber;

    private Integer fcreateorgid;

    private Integer fuseorgid;

    private Integer fcreatorid;

    private Integer fmodifierid;

	//	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fcreatedate;

	//	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fmodifydate;

    private Integer fBipNumberupper;

    private Integer fBipAuditorid;

    private Integer fBipDisableid;

	//	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fBipAuditordate;

	//	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fBipDisabledate;

	private String FDescription;

    private String fname;



	public String getFDescription() {
		return FDescription;
	}

	public void setFDescription(String fDescription) {
		FDescription = fDescription;
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFmasterid() {
        return fmasterid;
    }

    public void setFmasterid(Integer fmasterid) {
        this.fmasterid = fmasterid;
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

    public Integer getFcreateorgid() {
        return fcreateorgid;
    }

    public void setFcreateorgid(Integer fcreateorgid) {
        this.fcreateorgid = fcreateorgid;
    }

    public Integer getFuseorgid() {
        return fuseorgid;
    }

    public void setFuseorgid(Integer fuseorgid) {
        this.fuseorgid = fuseorgid;
    }

    public Integer getFcreatorid() {
        return fcreatorid;
    }

    public void setFcreatorid(Integer fcreatorid) {
        this.fcreatorid = fcreatorid;
    }

    public Integer getFmodifierid() {
        return fmodifierid;
    }

    public void setFmodifierid(Integer fmodifierid) {
        this.fmodifierid = fmodifierid;
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

    public Integer getfBipNumberupper() {
        return fBipNumberupper;
    }

    public void setfBipNumberupper(Integer fBipNumberupper) {
        this.fBipNumberupper = fBipNumberupper;
    }

    public Integer getfBipAuditorid() {
        return fBipAuditorid;
    }

    public void setfBipAuditorid(Integer fBipAuditorid) {
        this.fBipAuditorid = fBipAuditorid;
    }

    public Integer getfBipDisableid() {
        return fBipDisableid;
    }

    public void setfBipDisableid(Integer fBipDisableid) {
        this.fBipDisableid = fBipDisableid;
    }

    public Date getfBipAuditordate() {
        return fBipAuditordate;
    }

    public void setfBipAuditordate(Date fBipAuditordate) {
        this.fBipAuditordate = fBipAuditordate;
    }

    public Date getfBipDisabledate() {
        return fBipDisabledate;
    }

    public void setfBipDisabledate(Date fBipDisabledate) {
        this.fBipDisabledate = fBipDisabledate;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }
}