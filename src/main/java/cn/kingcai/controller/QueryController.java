package cn.kingcai.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.kingcai.service.QueryService;


@Controller
public class QueryController {

	@Autowired
	QueryService queryService;
	
	@RequestMapping(value ="executeSql" , produces="application/json;charset=UTF-8")
	@ResponseBody
	public String executeSql(String sql) throws Exception{	
				
		List<LinkedHashMap<String, Object>> list =  queryService.executeQuery(sql);
		JSONArray ja = new JSONArray();
		for(Map<String, Object> m : list) {
			JSONObject item = new JSONObject();
			for(Entry<String, Object> s : m.entrySet()) {
				item.put(s.getKey(), s.getValue());
			}
			ja.add(item);
		}
		return ja.toString();
	}
	
	@RequestMapping(value ="executeUpdate" , produces="application/json;charset=UTF-8")
	@ResponseBody
	public Integer executeUpdate(String sql) throws Exception{					
		Integer result = 0;
		result = queryService.executeUpdate(sql);
		return result;
	}
	
}
