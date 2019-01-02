package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.Petitionerfile;
import cn.kingcai.entity.PetitionerfileSave;
import cn.kingcai.entity.Result;

public interface BipTPetitionerfileMapper {
	/**
	 * 查询信访人档案列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> selectPetitionerList();

	/**
	 * 根据编码查询信访人档案
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	Petitionerfile selectByNumber(String fNumber);

	/**
	 * 更新信访人档案
	 * @param Bpetitionerfile
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	Result updatePetitioner(Petitionerfile petitionerfile);

	/**
	 * 保存到信访人档案
	 * @param file
	 * @author volcano
	 * @version 1.0
	 */
	int saveToPetitionerFile(PetitionerfileSave file);

	/**
	 * 信访记录
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> record(String fBipUserid);

}