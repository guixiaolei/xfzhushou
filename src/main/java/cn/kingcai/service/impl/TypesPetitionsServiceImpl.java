package cn.kingcai.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.BipTTypespetitionsMapper;
import cn.kingcai.entity.BipTTypespetitions;
import cn.kingcai.service.TypesPetitionsService;

@Service
public class TypesPetitionsServiceImpl implements TypesPetitionsService {

	@Autowired
	private BipTTypespetitionsMapper typespetitionsMapper;

	@Override
	public int insert(BipTTypespetitions record) {
		int count = typespetitionsMapper.insert(record);
		return count;
	}

	@Override
	public List<Map> selectTypes() {
		List<Map> typesList = typespetitionsMapper.selectTypes();
		return typesList;
	}

	/**
	 * 删除上访类型
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	@Override
	public void delete(String fNumber) {
		typespetitionsMapper.delete(fNumber);
	}

	@Override
	public void update(BipTTypespetitions typespetition) {
		typespetitionsMapper.update(typespetition);
	}

}
