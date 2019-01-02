package cn.kingcai.dao;

import java.util.LinkedHashMap;
import java.util.List;

public interface QueryMapper {
	
	List<LinkedHashMap<String, Object>> executeQuery(String sql);
	int executeInsert(String sql);  
    int executeUpdate(String sql);  
    int executeDelete(String sql);  
}
