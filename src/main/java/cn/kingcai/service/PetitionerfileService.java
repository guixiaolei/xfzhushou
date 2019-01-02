package cn.kingcai.service;

import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.Petitionerfile;
import cn.kingcai.entity.Result;

public interface PetitionerfileService {
	/**
	 * 查询信访人档案列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	PageResult selectPetitionerList(Integer pageNum, Integer pageSize);

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
}
