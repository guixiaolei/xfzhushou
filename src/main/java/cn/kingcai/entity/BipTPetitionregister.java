package cn.kingcai.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class BipTPetitionregister {
	private String fid;

	private String fbillno; //单据编号

	private String fdocumentstatus;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipBirthdate; //出生日期

	private String fBipNation;//民族

	private String fBipPetitionerphone;//联系电话

	private String fBipPetitionername; //代表者姓名

	private String fBipComplainantsnumerid;//代表者身份证号

	private String fBipSex; //性别

	private String fBipRecentphotos;//近照名,存数据库

	private MultipartFile recentphotos;//近照

    private String fBipThirdclassify;

	private Integer fBipPetitionersnumber;//上访人数

    private String fBipFirstclassify;

    private String fBipSecondclassify;

    private Integer fBipPetitiontype;

    private Integer fBipPoweraffairs;

	private String fBipRemarks; //事件详情

	private String fBipIsmanualentry;//是否手工录入

	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fcreatedate;

	private Integer fcreatorid;//创建人id

	private Integer fmodifierid;//修改人id

	@DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fmodifydate;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipCheckdate;//审核日期

	private String fBipAddress;//居住地址

	private String fBipNativeplace;//籍贯

	private Integer fBipUserid;//审核人

	private Integer fBipInteger;//下推次数

    private String fpashdownstatus;

	private Integer fBipOrgid;//创建单位

    private Integer fBipVisitcount;

	private String fBipRemark;//备注

	private String fBipHeadimage; //头像名,存数据库

	private MultipartFile headimage;//头像

	private String fBipPoliticaloutlook;//政治面貌

    private String fBipIssendmessage;

	public MultipartFile getRecentphotos() {
		return recentphotos;
	}

	public void setRecentphotos(MultipartFile recentphotos) {
		this.recentphotos = recentphotos;
	}

	public MultipartFile getHeadimage() {
		return headimage;
	}

	public void setHeadimage(MultipartFile headimage) {
		this.headimage = headimage;
	}


	public String getfBipComplainantsnumerid() {
		return fBipComplainantsnumerid;
	}

	public void setfBipComplainantsnumerid(String fBipComplainantsnumerid) {
		this.fBipComplainantsnumerid = fBipComplainantsnumerid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}


	public String getFid() {
		return fid;
	}

	public String getFbillno() {
        return fbillno;
    }

    public void setFbillno(String fbillno) {
        this.fbillno = fbillno == null ? null : fbillno.trim();
    }

    public String getFdocumentstatus() {
        return fdocumentstatus;
    }

    public void setFdocumentstatus(String fdocumentstatus) {
        this.fdocumentstatus = fdocumentstatus == null ? null : fdocumentstatus.trim();
    }

    public Date getfBipBirthdate() {
        return fBipBirthdate;
    }

    public void setfBipBirthdate(Date fBipBirthdate) {
        this.fBipBirthdate = fBipBirthdate;
    }

    public String getfBipNation() {
        return fBipNation;
    }

    public void setfBipNation(String fBipNation) {
        this.fBipNation = fBipNation == null ? null : fBipNation.trim();
    }

    public String getfBipPetitionerphone() {
        return fBipPetitionerphone;
    }

    public void setfBipPetitionerphone(String fBipPetitionerphone) {
        this.fBipPetitionerphone = fBipPetitionerphone == null ? null : fBipPetitionerphone.trim();
    }


	public String getfBipPetitionername() {
		return fBipPetitionername;
	}

	public void setfBipPetitionername(String fBipPetitionername) {
		this.fBipPetitionername = fBipPetitionername;
	}

	public String getfBipSex() {
        return fBipSex;
    }

    public void setfBipSex(String fBipSex) {
        this.fBipSex = fBipSex == null ? null : fBipSex.trim();
    }

    public String getfBipRecentphotos() {
        return fBipRecentphotos;
    }

    public void setfBipRecentphotos(String fBipRecentphotos) {
        this.fBipRecentphotos = fBipRecentphotos == null ? null : fBipRecentphotos.trim();
    }

    public String getfBipThirdclassify() {
        return fBipThirdclassify;
    }

    public void setfBipThirdclassify(String fBipThirdclassify) {
        this.fBipThirdclassify = fBipThirdclassify == null ? null : fBipThirdclassify.trim();
    }

    public Integer getfBipPetitionersnumber() {
        return fBipPetitionersnumber;
    }

    public void setfBipPetitionersnumber(Integer fBipPetitionersnumber) {
        this.fBipPetitionersnumber = fBipPetitionersnumber;
    }

    public String getfBipFirstclassify() {
        return fBipFirstclassify;
    }

    public void setfBipFirstclassify(String fBipFirstclassify) {
        this.fBipFirstclassify = fBipFirstclassify == null ? null : fBipFirstclassify.trim();
    }

    public String getfBipSecondclassify() {
        return fBipSecondclassify;
    }

    public void setfBipSecondclassify(String fBipSecondclassify) {
        this.fBipSecondclassify = fBipSecondclassify == null ? null : fBipSecondclassify.trim();
    }

    public Integer getfBipPetitiontype() {
        return fBipPetitiontype;
    }

    public void setfBipPetitiontype(Integer fBipPetitiontype) {
        this.fBipPetitiontype = fBipPetitiontype;
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
        this.fBipRemarks = fBipRemarks == null ? null : fBipRemarks.trim();
    }

    public String getfBipIsmanualentry() {
        return fBipIsmanualentry;
    }

    public void setfBipIsmanualentry(String fBipIsmanualentry) {
        this.fBipIsmanualentry = fBipIsmanualentry == null ? null : fBipIsmanualentry.trim();
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

    public String getfBipAddress() {
        return fBipAddress;
    }

    public void setfBipAddress(String fBipAddress) {
        this.fBipAddress = fBipAddress == null ? null : fBipAddress.trim();
    }

    public String getfBipNativeplace() {
        return fBipNativeplace;
    }

    public void setfBipNativeplace(String fBipNativeplace) {
        this.fBipNativeplace = fBipNativeplace == null ? null : fBipNativeplace.trim();
    }

    public Integer getfBipUserid() {
        return fBipUserid;
    }

    public void setfBipUserid(Integer fBipUserid) {
        this.fBipUserid = fBipUserid;
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
        this.fpashdownstatus = fpashdownstatus == null ? null : fpashdownstatus.trim();
    }

    public Integer getfBipOrgid() {
        return fBipOrgid;
    }

    public void setfBipOrgid(Integer fBipOrgid) {
        this.fBipOrgid = fBipOrgid;
    }

    public Integer getfBipVisitcount() {
        return fBipVisitcount;
    }

    public void setfBipVisitcount(Integer fBipVisitcount) {
        this.fBipVisitcount = fBipVisitcount;
    }

    public String getfBipRemark() {
        return fBipRemark;
    }

    public void setfBipRemark(String fBipRemark) {
        this.fBipRemark = fBipRemark == null ? null : fBipRemark.trim();
    }

    public String getfBipHeadimage() {
        return fBipHeadimage;
    }

    public void setfBipHeadimage(String fBipHeadimage) {
        this.fBipHeadimage = fBipHeadimage == null ? null : fBipHeadimage.trim();
    }

    public String getfBipPoliticaloutlook() {
        return fBipPoliticaloutlook;
    }

    public void setfBipPoliticaloutlook(String fBipPoliticaloutlook) {
        this.fBipPoliticaloutlook = fBipPoliticaloutlook == null ? null : fBipPoliticaloutlook.trim();
    }

    public String getfBipIssendmessage() {
        return fBipIssendmessage;
    }

    public void setfBipIssendmessage(String fBipIssendmessage) {
        this.fBipIssendmessage = fBipIssendmessage == null ? null : fBipIssendmessage.trim();
    }
}