package cn.kingcai.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.BipTPetitionerfileMapper;
import cn.kingcai.service.PetitionRecordService;

@Service
public class PetitionRecordServiceImpl implements PetitionRecordService {

	@Autowired
	private BipTPetitionerfileMapper petitionerfileMapper;

	@Override
	public List<Map> record(String fBipUserid) {
		return petitionerfileMapper.record(fBipUserid);
	}

}
