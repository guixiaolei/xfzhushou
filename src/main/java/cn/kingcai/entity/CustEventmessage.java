package cn.kingcai.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 * 接受乡镇登记单据头的实体
 * @author volcano
 *
 */
public class CustEventmessage {
	private String fid;

	private String fbillno;//单据编号

	private String fdocumentstatus;//数据状态

	private Integer fcreatorid;//创建人

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fcreatedate;//创建日期

	private Integer fmodifierid;//修改人

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fmodifydate;//修改日期

	private Integer fBipUserid;//审核人

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipCheckdate;//审核日期

	private String fBipPetitionername;//姓名

	private String fBipComplainantsnumerid;//身份证号

	private String fBipNation;//民族

	private String fBipSex;//性别

	private String fBipPetitionerphone;//联系电话

	private String fBipPoliticaloutlook;//政治面貌

	private String fBipNativeplace;//籍贯

	private String fBipAddress;//居住地址

	private String fBipIsmanualentry;//手工录入

	private String fBipHeadimage;//头像(数据库)

	private MultipartFile headimage;//头像

	private String fBipRecentphotos;//近照(数据库)

	private MultipartFile recentphotos;//近照

	private Integer fBipPetitiontype;//信访类型

	private String fBipFirstclassify;//一级分类

	private String fBipSecondclassify;//二级分类

	private String fBipThirdclassify;//三级分类

	private Integer fBipPetitionersnumber;//上访人数

	private Integer fBipPoweraffairs;//事权单位

	private String fBipRemarks;//事件详情

	private String fBipRemark;//处理结果描述

	private Integer fBipOrgid;//创建单位1

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipBirthdate;//出生日期

	private String fBipRecepterduty;//接访人职务

	private String fBipDutyman;//接访人

	private String fBipDealstatus;//处理状态

	private String fBipReceptertel;//接访人电话

	public MultipartFile getHeadimage() {
		return headimage;
	}

	public void setHeadimage(MultipartFile headimage) {
		this.headimage = headimage;
	}

	public MultipartFile getRecentphotos() {
		return recentphotos;
	}

	public void setRecentphotos(MultipartFile recentphotos) {
		this.recentphotos = recentphotos;
	}

	public String getFid() {
		return fid;
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

	public Integer getFcreatorid() {
		return fcreatorid;
	}

	public void setFcreatorid(Integer fcreatorid) {
		this.fcreatorid = fcreatorid;
	}

	public Date getFcreatedate() {
		return fcreatedate;
	}

	public void setFcreatedate(Date fcreatedate) {
		this.fcreatedate = fcreatedate;
	}

	public Integer getFmodifierid() {
		return fmodifierid;
	}

	public void setFmodifierid(Integer fmodifierid) {
		this.fmodifierid = fmodifierid;
	}

	public Date getFmodifydate() {
		return fmodifydate;
	}

	public void setFmodifydate(Date fmodifydate) {
		this.fmodifydate = fmodifydate;
	}

	public Integer getfBipUserid() {
		return fBipUserid;
	}

	public void setfBipUserid(Integer fBipUserid) {
		this.fBipUserid = fBipUserid;
	}

	public Date getfBipCheckdate() {
		return fBipCheckdate;
	}

	public void setfBipCheckdate(Date fBipCheckdate) {
		this.fBipCheckdate = fBipCheckdate;
	}

	public String getfBipPetitionername() {
		return fBipPetitionername;
	}

	public void setfBipPetitionername(String fBipPetitionername) {
		this.fBipPetitionername = fBipPetitionername;
	}

	public String getfBipComplainantsnumerid() {
		return fBipComplainantsnumerid;
	}

	public void setfBipComplainantsnumerid(String fBipComplainantsnumerid) {
		this.fBipComplainantsnumerid = fBipComplainantsnumerid;
	}

	public String getfBipNation() {
		return fBipNation;
	}

	public void setfBipNation(String fBipNation) {
		this.fBipNation = fBipNation;
	}

	public String getfBipSex() {
		return fBipSex;
	}

	public void setfBipSex(String fBipSex) {
		this.fBipSex = fBipSex;
	}

	public String getfBipPetitionerphone() {
		return fBipPetitionerphone;
	}

	public void setfBipPetitionerphone(String fBipPetitionerphone) {
		this.fBipPetitionerphone = fBipPetitionerphone;
	}

	public String getfBipPoliticaloutlook() {
		return fBipPoliticaloutlook;
	}

	public void setfBipPoliticaloutlook(String fBipPoliticaloutlook) {
		this.fBipPoliticaloutlook = fBipPoliticaloutlook;
	}

	public String getfBipNativeplace() {
		return fBipNativeplace;
	}

	public void setfBipNativeplace(String fBipNativeplace) {
		this.fBipNativeplace = fBipNativeplace;
	}

	public String getfBipAddress() {
		return fBipAddress;
	}

	public void setfBipAddress(String fBipAddress) {
		this.fBipAddress = fBipAddress;
	}

	public String getfBipIsmanualentry() {
		return fBipIsmanualentry;
	}

	public void setfBipIsmanualentry(String fBipIsmanualentry) {
		this.fBipIsmanualentry = fBipIsmanualentry;
	}

	public String getfBipHeadimage() {
		return fBipHeadimage;
	}

	public void setfBipHeadimage(String fBipHeadimage) {
		this.fBipHeadimage = fBipHeadimage;
	}

	public String getfBipRecentphotos() {
		return fBipRecentphotos;
	}

	public void setfBipRecentphotos(String fBipRecentphotos) {
		this.fBipRecentphotos = fBipRecentphotos;
	}

	public Integer getfBipPetitiontype() {
		return fBipPetitiontype;
	}

	public void setfBipPetitiontype(Integer fBipPetitiontype) {
		this.fBipPetitiontype = fBipPetitiontype;
	}

	public String getfBipFirstclassify() {
		return fBipFirstclassify;
	}

	public void setfBipFirstclassify(String fBipFirstclassify) {
		this.fBipFirstclassify = fBipFirstclassify;
	}

	public String getfBipSecondclassify() {
		return fBipSecondclassify;
	}

	public void setfBipSecondclassify(String fBipSecondclassify) {
		this.fBipSecondclassify = fBipSecondclassify;
	}

	public String getfBipThirdclassify() {
		return fBipThirdclassify;
	}

	public void setfBipThirdclassify(String fBipThirdclassify) {
		this.fBipThirdclassify = fBipThirdclassify;
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

	public String getfBipRemarks() {
		return fBipRemarks;
	}

	public void setfBipRemarks(String fBipRemarks) {
		this.fBipRemarks = fBipRemarks;
	}

	public String getfBipRemark() {
		return fBipRemark;
	}

	public void setfBipRemark(String fBipRemark) {
		this.fBipRemark = fBipRemark;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public Integer getfBipOrgid() {
		return fBipOrgid;
	}

	public void setfBipOrgid(Integer fBipOrgid) {
		this.fBipOrgid = fBipOrgid;
	}

	public Date getfBipBirthdate() {
		return fBipBirthdate;
	}

	public void setfBipBirthdate(Date fBipBirthdate) {
		this.fBipBirthdate = fBipBirthdate;
	}

	public String getfBipRecepterduty() {
		return fBipRecepterduty;
	}

	public void setfBipRecepterduty(String fBipRecepterduty) {
		this.fBipRecepterduty = fBipRecepterduty;
	}

	public String getfBipDutyman() {
		return fBipDutyman;
	}

	public void setfBipDutyman(String fBipDutyman) {
		this.fBipDutyman = fBipDutyman;
	}

	public String getfBipDealstatus() {
		return fBipDealstatus;
	}

	public void setfBipDealstatus(String fBipDealstatus) {
		this.fBipDealstatus = fBipDealstatus;
	}

	public String getfBipReceptertel() {
		return fBipReceptertel;
	}

	public void setfBipReceptertel(String fBipReceptertel) {
		this.fBipReceptertel = fBipReceptertel;
	}



}