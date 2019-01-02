package cn.kingcai.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 * 大厅登记保存到信访人的实体类(大厅登记的字段名和信访人的字段名不一致导致,重新设计表字段名相同时可去掉)
 * @author volcano
 *
 */
public class PetitionerfileSave {
	private Integer fid;

	private Integer fmasterid;

	private String fdocumentstatus;//数据状态

	private String fforbidstatus; //禁用状态

	private String fnumber; //编码

	private Integer fcreateorgid;//创建组织

	private Integer fuseorgid; //使用组织(可为空)

	private Integer fcreatorid; //创建人


	//隐藏字段
	private Integer fmodifierid;//修改人


	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fcreatedate;//创建日期

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fmodifydate;//修改日期

	private String fBipNation;//民族

	private String fBipNativeplace;//籍贯

	private String fBipAddress;//居住地址

	private String fBipPetitionerphone;//联系电话

	private String fBipRecentphotos;//用户照片

	private MultipartFile recentphotos;//用户照片文件

	private String fBipImageface;//身份证正面

	private MultipartFile imageface;//身份证正面文件

	private String fBipImageback;//身份证背面

	private MultipartFile imageback;//身份证背面文件

	//隐藏字段
	private Integer fBipUserid; //审核人

	private String fBipAuditorName;//审核人姓名

	//隐藏字段
	private Integer fBipDisableid;//禁用人

	private String fBipDisableName;//禁用人姓名

	private String fBipSex;//性别

	private String fBipComplainantsnumerid;//身份证号

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipBirthdate;//出生日期

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipCheckdate; //审核日期

	private Date fforbiddate; //禁用日期

	private String fBipIsregisterfacedemo;//是否注册人脸识别样本

	private String fBipUuid;//UUID

	private String fBipUsername;//姓名

	private String fBipHeadimage;//头像

	private MultipartFile headimage;//头像文件

	private String fBipPoliticaloutlook;//政治面貌

	private String fBipPetitionername;//信访人姓名

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
		this.fdocumentstatus = fdocumentstatus;
	}

	public String getFforbidstatus() {
		return fforbidstatus;
	}

	public void setFforbidstatus(String fforbidstatus) {
		this.fforbidstatus = fforbidstatus;
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
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

	public String getfBipNation() {
		return fBipNation;
	}

	public void setfBipNation(String fBipNation) {
		this.fBipNation = fBipNation;
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

	public String getfBipPetitionerphone() {
		return fBipPetitionerphone;
	}

	public void setfBipPetitionerphone(String fBipPetitionerphone) {
		this.fBipPetitionerphone = fBipPetitionerphone;
	}

	public String getfBipRecentphotos() {
		return fBipRecentphotos;
	}

	public void setfBipRecentphotos(String fBipRecentphotos) {
		this.fBipRecentphotos = fBipRecentphotos;
	}

	public MultipartFile getRecentphotos() {
		return recentphotos;
	}

	public void setRecentphotos(MultipartFile recentphotos) {
		this.recentphotos = recentphotos;
	}

	public String getfBipImageface() {
		return fBipImageface;
	}

	public void setfBipImageface(String fBipImageface) {
		this.fBipImageface = fBipImageface;
	}

	public MultipartFile getImageface() {
		return imageface;
	}

	public void setImageface(MultipartFile imageface) {
		this.imageface = imageface;
	}

	public String getfBipImageback() {
		return fBipImageback;
	}

	public void setfBipImageback(String fBipImageback) {
		this.fBipImageback = fBipImageback;
	}

	public MultipartFile getImageback() {
		return imageback;
	}

	public void setImageback(MultipartFile imageback) {
		this.imageback = imageback;
	}

	public Integer getfBipUserid() {
		return fBipUserid;
	}

	public void setfBipUserid(Integer fBipUserid) {
		this.fBipUserid = fBipUserid;
	}

	public String getfBipAuditorName() {
		return fBipAuditorName;
	}

	public void setfBipAuditorName(String fBipAuditorName) {
		this.fBipAuditorName = fBipAuditorName;
	}

	public Integer getfBipDisableid() {
		return fBipDisableid;
	}

	public void setfBipDisableid(Integer fBipDisableid) {
		this.fBipDisableid = fBipDisableid;
	}

	public String getfBipDisableName() {
		return fBipDisableName;
	}

	public void setfBipDisableName(String fBipDisableName) {
		this.fBipDisableName = fBipDisableName;
	}

	public String getfBipSex() {
		return fBipSex;
	}

	public void setfBipSex(String fBipSex) {
		this.fBipSex = fBipSex;
	}

	public String getfBipComplainantsnumerid() {
		return fBipComplainantsnumerid;
	}

	public void setfBipComplainantsnumerid(String fBipComplainantsnumerid) {
		this.fBipComplainantsnumerid = fBipComplainantsnumerid;
	}

	public Date getfBipBirthdate() {
		return fBipBirthdate;
	}

	public void setfBipBirthdate(Date fBipBirthdate) {
		this.fBipBirthdate = fBipBirthdate;
	}

	public Date getfBipCheckdate() {
		return fBipCheckdate;
	}

	public void setfBipCheckdate(Date fBipCheckdate) {
		this.fBipCheckdate = fBipCheckdate;
	}

	public Date getFforbiddate() {
		return fforbiddate;
	}

	public void setFforbiddate(Date fforbiddate) {
		this.fforbiddate = fforbiddate;
	}

	public String getfBipIsregisterfacedemo() {
		return fBipIsregisterfacedemo;
	}

	public void setfBipIsregisterfacedemo(String fBipIsregisterfacedemo) {
		this.fBipIsregisterfacedemo = fBipIsregisterfacedemo;
	}

	public String getfBipUuid() {
		return fBipUuid;
	}

	public void setfBipUuid(String fBipUuid) {
		this.fBipUuid = fBipUuid;
	}

	public String getfBipUsername() {
		return fBipUsername;
	}

	public void setfBipUsername(String fBipUsername) {
		this.fBipUsername = fBipUsername;
	}

	public String getfBipHeadimage() {
		return fBipHeadimage;
	}

	public void setfBipHeadimage(String fBipHeadimage) {
		this.fBipHeadimage = fBipHeadimage;
	}

	public MultipartFile getHeadimage() {
		return headimage;
	}

	public void setHeadimage(MultipartFile headimage) {
		this.headimage = headimage;
	}

	public String getfBipPoliticaloutlook() {
		return fBipPoliticaloutlook;
	}

	public void setfBipPoliticaloutlook(String fBipPoliticaloutlook) {
		this.fBipPoliticaloutlook = fBipPoliticaloutlook;
	}

	public String getfBipPetitionername() {
		return fBipPetitionername;
	}

	public void setfBipPetitionername(String fBipPetitionername) {
		this.fBipPetitionername = fBipPetitionername;
	}

}
