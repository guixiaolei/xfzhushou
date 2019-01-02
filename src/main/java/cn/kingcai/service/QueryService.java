package cn.kingcai.service;

import java.util.LinkedHashMap;
import java.util.List;

public interface QueryService {
	
	List<LinkedHashMap<String, Object>> executeQuery(String sql);
	int executeInsert(String sql);  
    int executeUpdate(String sql);  
    int executeDelete(String sql);  

}
