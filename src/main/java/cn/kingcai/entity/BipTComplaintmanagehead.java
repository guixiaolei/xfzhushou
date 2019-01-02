package cn.kingcai.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BipTComplaintmanagehead {
    private Long fid;

    private String fbillno;

    private String fdocumentstatus;

	private Integer fBipPetitionersnumber;

	private Integer fBipPoweraffairs;

    private String fBipThirdclassify;

    private String fBipFirstclassify;

	private String fBipRemark;//事件概述

	private String fBipComplainantsnumerid;//身份证号

	private String fBipPetitionerphone;//联系电话

    private Integer fBipPetitiontype;

    private String fBipSecondclassify;

	private String fBipPetitionername;//信访联系人

    private String fBipLocation;

	private String fBipHandledresult;//现场处理结果

	private String fBipEventhandledresult;//时间处理结果

	private Integer fcreatorid;//创建人id

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipCheckdate;//审核日期

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fcreatedate;//创建日期

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fmodifydate;//修改日期

	private Integer fmodifierid;//修改人id

	private Integer fBipUserid;//审核人

    private String fBipSourceid;

	private Integer fBipAwareofperson;//知悉人

	private Integer fBipFieldhandler;//现场处理人

	private Integer fBipFieldconfirmer;//现场完成确认人

	private Integer fBipEventhandler;//事件处理人

    private Integer fBipEventconfirmer;

	//	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date fBipAwareoftime;//知悉时间

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipArrivaltime;//抵达现场时间

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipFieldhandledtime;//现场处理完成时间

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipEventhandledtime;//事件处理完成时间

    private String fBipIschanged;

    private Integer fBipInteger;

    private Integer fBipSoursedown;

    private Integer fBipAccept;

    private String fbillstatus;

	private Integer fBipOrgid;//创建单位

    private String fBipAssistant;

    private Integer fBipInteger1;

	private Integer fBipArrivecheker;//到达确认人

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipArrivechecktime;//到达确认时间

	private Integer fBipDealoverperson;//处理完成人

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipOverchecktime;//时间确认时间

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipFieldchecktime;//现场确认时间

	private String fBipResultdiscription;//结果描述

	private String fBipFiledresultdiscription;//现场结果描述

    private String fBipIsregister;

    private String fBipUpfieldnum;

    private String fBipIsoverregister;

    private String fBipPoliticaloutlook;

    private String fBipIsfirstsendmessage;

    private String fBipIschangesendmessage;

    private Integer fBipSynchrointeger;

	private String FBIPRemarks;//事件详情

	public Long getFid() {
		return fid;
	}
	public void setFid(Long fid) {
		this.fid = fid;
	}
	public String getFbillno() {
		return fbillno;
	}
	public void setFbillno(String fbillno) {
		this.fbillno = fbillno;
	}
	public String getFdocumentstatus() {
		return fdocumentstatus;
	}
	public void setFdocumentstatus(String fdocumentstatus) {
		this.fdocumentstatus = fdocumentstatus;
	}
	public Integer getfBipPetitionersnumber() {
		return fBipPetitionersnumber;
	}
	public void setfBipPetitionersnumber(Integer fBipPetitionersnumber) {
		this.fBipPetitionersnumber = fBipPetitionersnumber;
	}
	public Integer getfBipPoweraffairs() {
		return fBipPoweraffairs;
	}
	public void setfBipPoweraffairs(Integer fBipPoweraffairs) {
		this.fBipPoweraffairs = fBipPoweraffairs;
	}
	public String getfBipThirdclassify() {
		return fBipThirdclassify;
	}
	public void setfBipThirdclassify(String fBipThirdclassify) {
		this.fBipThirdclassify = fBipThirdclassify;
	}
	public String getfBipFirstclassify() {
		return fBipFirstclassify;
	}
	public void setfBipFirstclassify(String fBipFirstclassify) {
		this.fBipFirstclassify = fBipFirstclassify;
	}
	public String getfBipRemark() {
		return fBipRemark;
	}
	public void setfBipRemark(String fBipRemark) {
		this.fBipRemark = fBipRemark;
	}
	public String getfBipComplainantsnumerid() {
		return fBipComplainantsnumerid;
	}
	public void setfBipComplainantsnumerid(String fBipComplainantsnumerid) {
		this.fBipComplainantsnumerid = fBipComplainantsnumerid;
	}
	public String getfBipPetitionerphone() {
		return fBipPetitionerphone;
	}
	public void setfBipPetitionerphone(String fBipPetitionerphone) {
		this.fBipPetitionerphone = fBipPetitionerphone;
	}
	public Integer getfBipPetitiontype() {
		return fBipPetitiontype;
	}
	public void setfBipPetitiontype(Integer fBipPetitiontype) {
		this.fBipPetitiontype = fBipPetitiontype;
	}
	public String getfBipSecondclassify() {
		return fBipSecondclassify;
	}
	public void setfBipSecondclassify(String fBipSecondclassify) {
		this.fBipSecondclassify = fBipSecondclassify;
	}
	public String getfBipPetitionername() {
		return fBipPetitionername;
	}
	public void setfBipPetitionername(String fBipPetitionername) {
		this.fBipPetitionername = fBipPetitionername;
	}
	public String getfBipLocation() {
		return fBipLocation;
	}
	public void setfBipLocation(String fBipLocation) {
		this.fBipLocation = fBipLocation;
	}
	public String getfBipHandledresult() {
		return fBipHandledresult;
	}
	public void setfBipHandledresult(String fBipHandledresult) {
		this.fBipHandledresult = fBipHandledresult;
	}
	public String getfBipEventhandledresult() {
		return fBipEventhandledresult;
	}
	public void setfBipEventhandledresult(String fBipEventhandledresult) {
		this.fBipEventhandledresult = fBipEventhandledresult;
	}

	public Integer getFcreatorid() {
		return fcreatorid;
	}

	public void setFcreatorid(Integer fcreatorid) {
		this.fcreatorid = fcreatorid;
	}
	public Date getfBipCheckdate() {
		return fBipCheckdate;
	}
	public void setfBipCheckdate(Date fBipCheckdate) {
		this.fBipCheckdate = fBipCheckdate;
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

	public Integer getFmodifierid() {
		return fmodifierid;
	}

	public void setFmodifierid(Integer fmodifierid) {
		this.fmodifierid = fmodifierid;
	}

	public Integer getfBipUserid() {
		return fBipUserid;
	}

	public void setfBipUserid(Integer fBipUserid) {
		this.fBipUserid = fBipUserid;
	}
	public String getfBipSourceid() {
		return fBipSourceid;
	}
	public void setfBipSourceid(String fBipSourceid) {
		this.fBipSourceid = fBipSourceid;
	}
	public Integer getfBipAwareofperson() {
		return fBipAwareofperson;
	}
	public void setfBipAwareofperson(Integer fBipAwareofperson) {
		this.fBipAwareofperson = fBipAwareofperson;
	}
	public Integer getfBipFieldhandler() {
		return fBipFieldhandler;
	}
	public void setfBipFieldhandler(Integer fBipFieldhandler) {
		this.fBipFieldhandler = fBipFieldhandler;
	}
	public Integer getfBipFieldconfirmer() {
		return fBipFieldconfirmer;
	}
	public void setfBipFieldconfirmer(Integer fBipFieldconfirmer) {
		this.fBipFieldconfirmer = fBipFieldconfirmer;
	}
	public Integer getfBipEventhandler() {
		return fBipEventhandler;
	}
	public void setfBipEventhandler(Integer fBipEventhandler) {
		this.fBipEventhandler = fBipEventhandler;
	}
	public Integer getfBipEventconfirmer() {
		return fBipEventconfirmer;
	}
	public void setfBipEventconfirmer(Integer fBipEventconfirmer) {
		this.fBipEventconfirmer = fBipEventconfirmer;
	}
	public Date getfBipAwareoftime() {
		return fBipAwareoftime;
	}
	public void setfBipAwareoftime(Date fBipAwareoftime) {
		this.fBipAwareoftime = fBipAwareoftime;
	}
	public Date getfBipArrivaltime() {
		return fBipArrivaltime;
	}
	public void setfBipArrivaltime(Date fBipArrivaltime) {
		this.fBipArrivaltime = fBipArrivaltime;
	}
	public Date getfBipFieldhandledtime() {
		return fBipFieldhandledtime;
	}
	public void setfBipFieldhandledtime(Date fBipFieldhandledtime) {
		this.fBipFieldhandledtime = fBipFieldhandledtime;
	}
	public Date getfBipEventhandledtime() {
		return fBipEventhandledtime;
	}
	public void setfBipEventhandledtime(Date fBipEventhandledtime) {
		this.fBipEventhandledtime = fBipEventhandledtime;
	}
	public String getfBipIschanged() {
		return fBipIschanged;
	}
	public void setfBipIschanged(String fBipIschanged) {
		this.fBipIschanged = fBipIschanged;
	}
	public Integer getfBipInteger() {
		return fBipInteger;
	}
	public void setfBipInteger(Integer fBipInteger) {
		this.fBipInteger = fBipInteger;
	}
	public Integer getfBipSoursedown() {
		return fBipSoursedown;
	}
	public void setfBipSoursedown(Integer fBipSoursedown) {
		this.fBipSoursedown = fBipSoursedown;
	}
	public Integer getfBipAccept() {
		return fBipAccept;
	}
	public void setfBipAccept(Integer fBipAccept) {
		this.fBipAccept = fBipAccept;
	}
	public String getFbillstatus() {
		return fbillstatus;
	}
	public void setFbillstatus(String fbillstatus) {
		this.fbillstatus = fbillstatus;
	}
	public Integer getfBipOrgid() {
		return fBipOrgid;
	}
	public void setfBipOrgid(Integer fBipOrgid) {
		this.fBipOrgid = fBipOrgid;
	}
	public String getfBipAssistant() {
		return fBipAssistant;
	}
	public void setfBipAssistant(String fBipAssistant) {
		this.fBipAssistant = fBipAssistant;
	}
	public Integer getfBipInteger1() {
		return fBipInteger1;
	}
	public void setfBipInteger1(Integer fBipInteger1) {
		this.fBipInteger1 = fBipInteger1;
	}
	public Integer getfBipArrivecheker() {
		return fBipArrivecheker;
	}
	public void setfBipArrivecheker(Integer fBipArrivecheker) {
		this.fBipArrivecheker = fBipArrivecheker;
	}
	public Date getfBipArrivechecktime() {
		return fBipArrivechecktime;
	}
	public void setfBipArrivechecktime(Date fBipArrivechecktime) {
		this.fBipArrivechecktime = fBipArrivechecktime;
	}
	public Integer getfBipDealoverperson() {
		return fBipDealoverperson;
	}
	public void setfBipDealoverperson(Integer fBipDealoverperson) {
		this.fBipDealoverperson = fBipDealoverperson;
	}
	public Date getfBipOverchecktime() {
		return fBipOverchecktime;
	}
	public void setfBipOverchecktime(Date fBipOverchecktime) {
		this.fBipOverchecktime = fBipOverchecktime;
	}
	public Date getfBipFieldchecktime() {
		return fBipFieldchecktime;
	}
	public void setfBipFieldchecktime(Date fBipFieldchecktime) {
		this.fBipFieldchecktime = fBipFieldchecktime;
	}
	public String getfBipResultdiscription() {
		return fBipResultdiscription;
	}
	public void setfBipResultdiscription(String fBipResultdiscription) {
		this.fBipResultdiscription = fBipResultdiscription;
	}
	public String getfBipFiledresultdiscription() {
		return fBipFiledresultdiscription;
	}
	public void setfBipFiledresultdiscription(String fBipFiledresultdiscription) {
		this.fBipFiledresultdiscription = fBipFiledresultdiscription;
	}
	public String getfBipIsregister() {
		return fBipIsregister;
	}
	public void setfBipIsregister(String fBipIsregister) {
		this.fBipIsregister = fBipIsregister;
	}
	public String getfBipUpfieldnum() {
		return fBipUpfieldnum;
	}
	public void setfBipUpfieldnum(String fBipUpfieldnum) {
		this.fBipUpfieldnum = fBipUpfieldnum;
	}
	public String getfBipIsoverregister() {
		return fBipIsoverregister;
	}
	public void setfBipIsoverregister(String fBipIsoverregister) {
		this.fBipIsoverregister = fBipIsoverregister;
	}
	public String getfBipPoliticaloutlook() {
		return fBipPoliticaloutlook;
	}
	public void setfBipPoliticaloutlook(String fBipPoliticaloutlook) {
		this.fBipPoliticaloutlook = fBipPoliticaloutlook;
	}
	public String getfBipIsfirstsendmessage() {
		return fBipIsfirstsendmessage;
	}
	public void setfBipIsfirstsendmessage(String fBipIsfirstsendmessage) {
		this.fBipIsfirstsendmessage = fBipIsfirstsendmessage;
	}
	public String getfBipIschangesendmessage() {
		return fBipIschangesendmessage;
	}
	public void setfBipIschangesendmessage(String fBipIschangesendmessage) {
		this.fBipIschangesendmessage = fBipIschangesendmessage;
	}
	public Integer getfBipSynchrointeger() {
		return fBipSynchrointeger;
	}
	public void setfBipSynchrointeger(Integer fBipSynchrointeger) {
		this.fBipSynchrointeger = fBipSynchrointeger;
	}
	public String getFBIPRemarks() {
		return FBIPRemarks;
	}
	public void setFBIPRemarks(String fBIPRemarks) {
		FBIPRemarks = fBIPRemarks;
	}



}