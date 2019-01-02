package cn.kingcai.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.QueryMapper;
import cn.kingcai.service.QueryService;


@Service
public class QueryServiceImpl implements QueryService {
	
	@Autowired
	QueryMapper queryMapper;

	@Override
	public List<LinkedHashMap<String, Object>> executeQuery(String sql) {
		// TODO Auto-generated method stub		
		return queryMapper.executeQuery(sql);
	}

	@Override
	public int executeInsert(String sql) {
		// TODO Auto-generated method stub
		return queryMapper.executeInsert(sql);
	}

	@Override
	public int executeUpdate(String sql) {
		// TODO Auto-generated method stub
		return queryMapper.executeUpdate(sql);
	}

	@Override
	public int executeDelete(String sql) {
		// TODO Auto-generated method stub
		return queryMapper.executeDelete(sql);
	}

}
