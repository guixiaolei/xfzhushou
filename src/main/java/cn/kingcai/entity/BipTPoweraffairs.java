package cn.kingcai.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BipTPoweraffairs {
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

    private Integer fBipAuditorid;

    private Integer fBipDisableid;

    private String fBipUnittel;

    private String fBipDirectortel;

	private BigDecimal fBipTime;//处理现场时效

	private Integer fBipDirector;//主管

	//	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fapprovedate;

	//	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fforbiddate;

	private Integer fBipInteger;//积分初始值

    private String fBipUtiltype;

    private String fname;

	private String fdescription;

	public String getFdescription() {
		return fdescription;
	}

	public void setFdescription(String fdescription) {
		this.fdescription = fdescription;
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

    public String getfBipUnittel() {
        return fBipUnittel;
    }

    public void setfBipUnittel(String fBipUnittel) {
        this.fBipUnittel = fBipUnittel == null ? null : fBipUnittel.trim();
    }

    public String getfBipDirectortel() {
        return fBipDirectortel;
    }

    public void setfBipDirectortel(String fBipDirectortel) {
        this.fBipDirectortel = fBipDirectortel == null ? null : fBipDirectortel.trim();
    }

    public BigDecimal getfBipTime() {
        return fBipTime;
    }

    public void setfBipTime(BigDecimal fBipTime) {
        this.fBipTime = fBipTime;
    }

    public Integer getfBipDirector() {
        return fBipDirector;
    }

    public void setfBipDirector(Integer fBipDirector) {
        this.fBipDirector = fBipDirector;
    }

    public Date getFapprovedate() {
        return fapprovedate;
    }

    public void setFapprovedate(Date fapprovedate) {
        this.fapprovedate = fapprovedate;
    }

    public Date getFforbiddate() {
        return fforbiddate;
    }

    public void setFforbiddate(Date fforbiddate) {
        this.fforbiddate = fforbiddate;
    }

    public Integer getfBipInteger() {
        return fBipInteger;
    }

    public void setfBipInteger(Integer fBipInteger) {
        this.fBipInteger = fBipInteger;
    }

    public String getfBipUtiltype() {
        return fBipUtiltype;
    }

    public void setfBipUtiltype(String fBipUtiltype) {
        this.fBipUtiltype = fBipUtiltype == null ? null : fBipUtiltype.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }
}