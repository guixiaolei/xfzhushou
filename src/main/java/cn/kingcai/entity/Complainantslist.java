package cn.kingcai.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 * 信访登记存取信访人列表的实体类
 * @author volcano
 *
 */
public class Complainantslist {
	private String fid;

    private Long fentryid;

    private Integer fseq;

	private String fBipPetitionername; //信访人姓名

	private String fBipComplainantsnumerid; //身份证号

	private MultipartFile headimage; //头像

	private String fBipHeadimage; //数据库头像(前端不写)

	private String fBipIscontacts; //是否联系人

	private String fBipSex; //性别

	private String fBipNation; //民族

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fBipBirthdate; //出生日期          

	private String fBipAddress; //居住地址

	private MultipartFile recentphotos; //近照

	private String fBipRecentphotos; //数据库近照信息(前端不写)

	private String fBipPetitionerphone; //联系电话

	private String fBipNativeplace; //籍贯

	private String fBipPoliticaloutlook; //政治面貌


	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public Long getFentryid() {
        return fentryid;
    }

    public void setFentryid(Long fentryid) {
        this.fentryid = fentryid;
    }

    public Integer getFseq() {
        return fseq;
    }

    public void setFseq(Integer fseq) {
        this.fseq = fseq;
    }

    public String getfBipPetitionername() {
        return fBipPetitionername;
    }

    public void setfBipPetitionername(String fBipPetitionername) {
        this.fBipPetitionername = fBipPetitionername == null ? null : fBipPetitionername.trim();
    }

    public String getfBipComplainantsnumerid() {
        return fBipComplainantsnumerid;
    }

    public void setfBipComplainantsnumerid(String fBipComplainantsnumerid) {
        this.fBipComplainantsnumerid = fBipComplainantsnumerid == null ? null : fBipComplainantsnumerid.trim();
    }


    public String getfBipIscontacts() {
        return fBipIscontacts;
    }

    public void setfBipIscontacts(String fBipIscontacts) {
        this.fBipIscontacts = fBipIscontacts == null ? null : fBipIscontacts.trim();
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

	public String getfBipNativeplace() {
		return fBipNativeplace;
	}

	public void setfBipNativeplace(String fBipNativeplace) {
		this.fBipNativeplace = fBipNativeplace;
	}

	public String getfBipPoliticaloutlook() {
		return fBipPoliticaloutlook;
	}

	public void setfBipPoliticaloutlook(String fBipPoliticaloutlook) {
		this.fBipPoliticaloutlook = fBipPoliticaloutlook;
	}

	public MultipartFile getHeadimage() {
		return headimage;
	}

	public void setHeadimage(MultipartFile headimage) {
		this.headimage = headimage;
	}

	public String getfBipHeadimage() {
		return fBipHeadimage;
	}

	public void setfBipHeadimage(String fBipHeadimage) {
		this.fBipHeadimage = fBipHeadimage;
	}

	public MultipartFile getRecentphotos() {
		return recentphotos;
	}

	public void setRecentphotos(MultipartFile recentphotos) {
		this.recentphotos = recentphotos;
	}

	public String getfBipRecentphotos() {
		return fBipRecentphotos;
	}

	public void setfBipRecentphotos(String fBipRecentphotos) {
		this.fBipRecentphotos = fBipRecentphotos;
	}

}