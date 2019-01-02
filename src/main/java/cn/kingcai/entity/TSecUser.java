package cn.kingcai.entity;

import java.util.Date;

public class TSecUser {
    private Integer fuserid;

    private String fname;

    private Integer fprimarygroup;

    private String fdescription;

    private Integer fempid;

    private String ftype;

    private String fpassword;

    private String fislock;

    private Date funlocktime;

    private Date fpwdvaliddate;

    private Date fpwdmodifyvaliddate;

    private String fissystemgen;

    private Integer flogincount;

    private Integer ferrorcount;

    private String fsid;

    private String fforbidstatus;

    private Integer fcreateorg;

    private Date fcreatedate;

    private Integer fcreatorid;

    private Integer flinkobject;

    private String fmemo;

    private String fmbaccont;

    private String faccesstoken;

    private String ftokensecret;

    private String fweibouserid;

    private String fregstate;

    private String fuseraccount;

    private String fphone;

    private String fdomainuser;

    private String fusertype;

    private String femail;

    private Integer fdynamicpasswordid;

    private String fsocialid;

    private Integer fenableuserid;

    private Date fenabletime;

    private Integer fdisableuserid;

    private Date fdisabletime;

    private String fappgroup;

    private String fkdpassportid;

    private String fsex;

    private String fsignetpath;

    private String ffaceuid;

    private String fislockterminal;

    public Integer getFuserid() {
        return fuserid;
    }

    public void setFuserid(Integer fuserid) {
        this.fuserid = fuserid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFprimarygroup() {
        return fprimarygroup;
    }

    public void setFprimarygroup(Integer fprimarygroup) {
        this.fprimarygroup = fprimarygroup;
    }

    public String getFdescription() {
        return fdescription;
    }

    public void setFdescription(String fdescription) {
        this.fdescription = fdescription == null ? null : fdescription.trim();
    }

    public Integer getFempid() {
        return fempid;
    }

    public void setFempid(Integer fempid) {
        this.fempid = fempid;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFpassword() {
        return fpassword;
    }

    public void setFpassword(String fpassword) {
        this.fpassword = fpassword == null ? null : fpassword.trim();
    }

    public String getFislock() {
        return fislock;
    }

    public void setFislock(String fislock) {
        this.fislock = fislock == null ? null : fislock.trim();
    }

    public Date getFunlocktime() {
        return funlocktime;
    }

    public void setFunlocktime(Date funlocktime) {
        this.funlocktime = funlocktime;
    }

    public Date getFpwdvaliddate() {
        return fpwdvaliddate;
    }

    public void setFpwdvaliddate(Date fpwdvaliddate) {
        this.fpwdvaliddate = fpwdvaliddate;
    }

    public Date getFpwdmodifyvaliddate() {
        return fpwdmodifyvaliddate;
    }

    public void setFpwdmodifyvaliddate(Date fpwdmodifyvaliddate) {
        this.fpwdmodifyvaliddate = fpwdmodifyvaliddate;
    }

    public String getFissystemgen() {
        return fissystemgen;
    }

    public void setFissystemgen(String fissystemgen) {
        this.fissystemgen = fissystemgen == null ? null : fissystemgen.trim();
    }

    public Integer getFlogincount() {
        return flogincount;
    }

    public void setFlogincount(Integer flogincount) {
        this.flogincount = flogincount;
    }

    public Integer getFerrorcount() {
        return ferrorcount;
    }

    public void setFerrorcount(Integer ferrorcount) {
        this.ferrorcount = ferrorcount;
    }

    public String getFsid() {
        return fsid;
    }

    public void setFsid(String fsid) {
        this.fsid = fsid == null ? null : fsid.trim();
    }

    public String getFforbidstatus() {
        return fforbidstatus;
    }

    public void setFforbidstatus(String fforbidstatus) {
        this.fforbidstatus = fforbidstatus == null ? null : fforbidstatus.trim();
    }

    public Integer getFcreateorg() {
        return fcreateorg;
    }

    public void setFcreateorg(Integer fcreateorg) {
        this.fcreateorg = fcreateorg;
    }

    public Date getFcreatedate() {
        return fcreatedate;
    }

    public void setFcreatedate(Date fcreatedate) {
        this.fcreatedate = fcreatedate;
    }

    public Integer getFcreatorid() {
        return fcreatorid;
    }

    public void setFcreatorid(Integer fcreatorid) {
        this.fcreatorid = fcreatorid;
    }

    public Integer getFlinkobject() {
        return flinkobject;
    }

    public void setFlinkobject(Integer flinkobject) {
        this.flinkobject = flinkobject;
    }

    public String getFmemo() {
        return fmemo;
    }

    public void setFmemo(String fmemo) {
        this.fmemo = fmemo == null ? null : fmemo.trim();
    }

    public String getFmbaccont() {
        return fmbaccont;
    }

    public void setFmbaccont(String fmbaccont) {
        this.fmbaccont = fmbaccont == null ? null : fmbaccont.trim();
    }

    public String getFaccesstoken() {
        return faccesstoken;
    }

    public void setFaccesstoken(String faccesstoken) {
        this.faccesstoken = faccesstoken == null ? null : faccesstoken.trim();
    }

    public String getFtokensecret() {
        return ftokensecret;
    }

    public void setFtokensecret(String ftokensecret) {
        this.ftokensecret = ftokensecret == null ? null : ftokensecret.trim();
    }

    public String getFweibouserid() {
        return fweibouserid;
    }

    public void setFweibouserid(String fweibouserid) {
        this.fweibouserid = fweibouserid == null ? null : fweibouserid.trim();
    }

    public String getFregstate() {
        return fregstate;
    }

    public void setFregstate(String fregstate) {
        this.fregstate = fregstate == null ? null : fregstate.trim();
    }

    public String getFuseraccount() {
        return fuseraccount;
    }

    public void setFuseraccount(String fuseraccount) {
        this.fuseraccount = fuseraccount == null ? null : fuseraccount.trim();
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone == null ? null : fphone.trim();
    }

    public String getFdomainuser() {
        return fdomainuser;
    }

    public void setFdomainuser(String fdomainuser) {
        this.fdomainuser = fdomainuser == null ? null : fdomainuser.trim();
    }

    public String getFusertype() {
        return fusertype;
    }

    public void setFusertype(String fusertype) {
        this.fusertype = fusertype == null ? null : fusertype.trim();
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail == null ? null : femail.trim();
    }

    public Integer getFdynamicpasswordid() {
        return fdynamicpasswordid;
    }

    public void setFdynamicpasswordid(Integer fdynamicpasswordid) {
        this.fdynamicpasswordid = fdynamicpasswordid;
    }

    public String getFsocialid() {
        return fsocialid;
    }

    public void setFsocialid(String fsocialid) {
        this.fsocialid = fsocialid == null ? null : fsocialid.trim();
    }

    public Integer getFenableuserid() {
        return fenableuserid;
    }

    public void setFenableuserid(Integer fenableuserid) {
        this.fenableuserid = fenableuserid;
    }

    public Date getFenabletime() {
        return fenabletime;
    }

    public void setFenabletime(Date fenabletime) {
        this.fenabletime = fenabletime;
    }

    public Integer getFdisableuserid() {
        return fdisableuserid;
    }

    public void setFdisableuserid(Integer fdisableuserid) {
        this.fdisableuserid = fdisableuserid;
    }

    public Date getFdisabletime() {
        return fdisabletime;
    }

    public void setFdisabletime(Date fdisabletime) {
        this.fdisabletime = fdisabletime;
    }

    public String getFappgroup() {
        return fappgroup;
    }

    public void setFappgroup(String fappgroup) {
        this.fappgroup = fappgroup == null ? null : fappgroup.trim();
    }

    public String getFkdpassportid() {
        return fkdpassportid;
    }

    public void setFkdpassportid(String fkdpassportid) {
        this.fkdpassportid = fkdpassportid == null ? null : fkdpassportid.trim();
    }

    public String getFsex() {
        return fsex;
    }

    public void setFsex(String fsex) {
        this.fsex = fsex == null ? null : fsex.trim();
    }

    public String getFsignetpath() {
        return fsignetpath;
    }

    public void setFsignetpath(String fsignetpath) {
        this.fsignetpath = fsignetpath == null ? null : fsignetpath.trim();
    }

    public String getFfaceuid() {
        return ffaceuid;
    }

    public void setFfaceuid(String ffaceuid) {
        this.ffaceuid = ffaceuid == null ? null : ffaceuid.trim();
    }

    public String getFislockterminal() {
        return fislockterminal;
    }

    public void setFislockterminal(String fislockterminal) {
        this.fislockterminal = fislockterminal == null ? null : fislockterminal.trim();
    }
}