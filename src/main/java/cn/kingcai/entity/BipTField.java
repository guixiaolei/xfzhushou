package cn.kingcai.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 * 保存到现场登记的实体类
 * @author volcano
 *
 */
public class BipTField {
	private Integer fid;

    private String fbillno;

    private String fdocumentstatus;

	private String fBipPetitionername;

	private String fBipPetitionerphone;

	private String fBipComplainantsnumerid;

	private String fBipRemarks;

	private String fBipImage; //现场照片

	private MultipartFile[] image;

	private Integer fBipUserid; //审核人

    private Integer fmodifierid;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fmodifydate;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipCheckdate;

    private Integer fcreatorid;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fcreatedate;

	private String fBipFieldAddress;//现场地址

	private String fBipRegister; //是否登记

	private Integer fuseorgid;//使用组织

	private Integer fBipOrgid;//创建组织

	private Integer fBipPoweraffairs;

	private String fBipFirstclassify;

	private String fBipSecondclassify;

	private String fBipThirdclassify;

	private String fBipCreatoropenid;//发消息人

	private Integer fBipInteger;//下推次数

	private String fpashdownstatus;//下推状态

	private Integer fBipPetitionersnumber;

    private Integer fBipPetitiontype;

    private String fBipCreatepersonname;

    private String fBipSex;

    private String fBipNation;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fBipBirthdate;

    private String fBipNativeplace;

	private String fBipIsmanualentry;//手工录入

	private String fBipAddress;//居住地址

	private String fBipHeadimage;

	private MultipartFile headimage; //头像

	private String fBipRecentphotos;

	private MultipartFile recentphotos;//近照

    private String fBipPoliticaloutlook;

    private String fBipIssendmessage;

	public MultipartFile[] getImage() {
		return image;
	}

	public void setImage(MultipartFile[] image) {
		this.image = image;
	}

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

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
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

	public String getfBipPetitionername() {
		return fBipPetitionername;
	}

	public void setfBipPetitionername(String fBipPetitionername) {
		this.fBipPetitionername = fBipPetitionername;
	}

	public String getfBipPetitionerphone() {
		return fBipPetitionerphone;
	}

	public void setfBipPetitionerphone(String fBipPetitionerphone) {
		this.fBipPetitionerphone = fBipPetitionerphone;
	}

	public String getfBipComplainantsnumerid() {
		return fBipComplainantsnumerid;
	}

	public void setfBipComplainantsnumerid(String fBipComplainantsnumerid) {
		this.fBipComplainantsnumerid = fBipComplainantsnumerid;
	}

	public String getfBipRemarks() {
		return fBipRemarks;
	}

	public void setfBipRemarks(String fBipRemarks) {
		this.fBipRemarks = fBipRemarks;
	}

	public String getfBipImage() {
		return fBipImage;
	}

	public void setfBipImage(String fBipImage) {
		this.fBipImage = fBipImage;
	}

	public Integer getfBipUserid() {
		return fBipUserid;
	}

	public void setfBipUserid(Integer fBipUserid) {
		this.fBipUserid = fBipUserid;
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

	public Date getfBipCheckdate() {
		return fBipCheckdate;
	}

	public void setfBipCheckdate(Date fBipCheckdate) {
		this.fBipCheckdate = fBipCheckdate;
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

	public String getfBipAddress() {
		return fBipAddress;
	}

	public void setfBipAddress(String fBipAddress) {
		this.fBipAddress = fBipAddress;
	}

	public String getfBipRegister() {
		return fBipRegister;
	}

	public void setfBipRegister(String fBipRegister) {
		this.fBipRegister = fBipRegister;
	}

	public Integer getFuseorgid() {
		return fuseorgid;
	}

	public void setFuseorgid(Integer fuseorgid) {
		this.fuseorgid = fuseorgid;
	}

	public Integer getfBipOrgid() {
		return fBipOrgid;
	}

	public void setfBipOrgid(Integer fBipOrgid) {
		this.fBipOrgid = fBipOrgid;
	}

	public Integer getfBipPoweraffairs() {
		return fBipPoweraffairs;
	}

	public void setfBipPoweraffairs(Integer fBipPoweraffairs) {
		this.fBipPoweraffairs = fBipPoweraffairs;
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

	public String getfBipCreatoropenid() {
		return fBipCreatoropenid;
	}

	public void setfBipCreatoropenid(String fBipCreatoropenid) {
		this.fBipCreatoropenid = fBipCreatoropenid;
	}

	public Integer getfBipInteger() {
		return fBipInteger;
	}

	public void setfBipInteger(Integer fBipInteger) {
		this.fBipInteger = fBipInteger;
	}

	public String getFpashdownstatus() {
		return fpashdownstatus;
	}

	public void setFpashdownstatus(String fpashdownstatus) {
		this.fpashdownstatus = fpashdownstatus;
	}

	public Integer getfBipPetitionersnumber() {
		return fBipPetitionersnumber;
	}

	public void setfBipPetitionersnumber(Integer fBipPetitionersnumber) {
		this.fBipPetitionersnumber = fBipPetitionersnumber;
	}

	public Integer getfBipPetitiontype() {
		return fBipPetitiontype;
	}

	public void setfBipPetitiontype(Integer fBipPetitiontype) {
		this.fBipPetitiontype = fBipPetitiontype;
	}

	public String getfBipCreatepersonname() {
		return fBipCreatepersonname;
	}

	public void setfBipCreatepersonname(String fBipCreatepersonname) {
		this.fBipCreatepersonname = fBipCreatepersonname;
	}

	public String getfBipSex() {
		return fBipSex;
	}

	public void setfBipSex(String fBipSex) {
		this.fBipSex = fBipSex;
	}

	public String getfBipNation() {
		return fBipNation;
	}

	public void setfBipNation(String fBipNation) {
		this.fBipNation = fBipNation;
	}

	public Date getfBipBirthdate() {
		return fBipBirthdate;
	}

	public void setfBipBirthdate(Date fBipBirthdate) {
		this.fBipBirthdate = fBipBirthdate;
	}

	public String getfBipNativeplace() {
		return fBipNativeplace;
	}

	public void setfBipNativeplace(String fBipNativeplace) {
		this.fBipNativeplace = fBipNativeplace;
	}

	public String getfBipIsmanualentry() {
		return fBipIsmanualentry;
	}

	public void setfBipIsmanualentry(String fBipIsmanualentry) {
		this.fBipIsmanualentry = fBipIsmanualentry;
	}

	public String getfBipFieldAddress() {
		return fBipFieldAddress;
	}

	public void setfBipFieldAddress(String fBipFieldAddress) {
		this.fBipFieldAddress = fBipFieldAddress;
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

	public String getfBipPoliticaloutlook() {
		return fBipPoliticaloutlook;
	}

	public void setfBipPoliticaloutlook(String fBipPoliticaloutlook) {
		this.fBipPoliticaloutlook = fBipPoliticaloutlook;
	}

	public String getfBipIssendmessage() {
		return fBipIssendmessage;
	}

	public void setfBipIssendmessage(String fBipIssendmessage) {
		this.fBipIssendmessage = fBipIssendmessage;
	}


}