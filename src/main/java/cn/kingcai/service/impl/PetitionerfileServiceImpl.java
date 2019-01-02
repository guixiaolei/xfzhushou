package cn.kingcai.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.kingcai.dao.BipTPetitionerfileMapper;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.Petitionerfile;
import cn.kingcai.entity.Result;
import cn.kingcai.service.PetitionerfileService;

@Service
public class PetitionerfileServiceImpl implements PetitionerfileService {

	@Autowired
	private BipTPetitionerfileMapper petitionerfileMapper;

	/**
	 * 查询信访人档案列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@Override
	public PageResult selectPetitionerList(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Map> page = (Page<Map>) petitionerfileMapper.selectPetitionerList();
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 根据编码查询信访人档案
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@Override
	public Petitionerfile selectByNumber(String fNumber) {
		return petitionerfileMapper.selectByNumber(fNumber);
	}

	/**
	 * 更新信访人档案
	 * @param Bpetitionerfile
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@Override
	public Result updatePetitioner(Petitionerfile petitionerfile) {
		return petitionerfileMapper.updatePetitioner(petitionerfile);
	}

}
