package cn.kingcai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.BipTLetterbureauMapper;
import cn.kingcai.entity.Letterbureau;
import cn.kingcai.service.LetterbureauService;

@Service
public class LetterbureauServiceImpl implements LetterbureauService {
	@Autowired
	private BipTLetterbureauMapper letterbureauMapper;

	@Override
	public List<Letterbureau> selectBureauList() {
		List<Letterbureau> bureauList = letterbureauMapper.selectBureauList();
		return bureauList;
	}

}
