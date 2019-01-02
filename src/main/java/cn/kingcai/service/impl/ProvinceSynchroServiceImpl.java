package cn.kingcai.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.BipTProvincesynchroMapper;
import cn.kingcai.service.ProvinceSynchroService;

@Service
public class ProvinceSynchroServiceImpl implements ProvinceSynchroService {

	@Autowired
	private BipTProvincesynchroMapper provincesynchro;
	/**
	 * 查询列表
	 */
	@Override
	public List<Map> list() {
		return provincesynchro.list();
	}

	/**
	 * 修改时根据单据单号查询信息
	 */
	@Override
	public List<Map> showData(String fbillno) {
		return provincesynchro.showData(fbillno);
	}

}
