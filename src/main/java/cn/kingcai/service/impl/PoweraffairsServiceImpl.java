package cn.kingcai.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.BipTPoweraffairsMapper;
import cn.kingcai.entity.BipTPoweraffairs;
import cn.kingcai.entity.Poweraffairs;
import cn.kingcai.service.PoweraffairsService;

@Service
public class PoweraffairsServiceImpl implements PoweraffairsService {

	int number = 1;
	@Autowired
	private BipTPoweraffairsMapper poweraffairsMapper;

	/**
	 * 查找事权单位
	 */
	@Override
	public List<Poweraffairs> findPoweraffairs() {
		List<Poweraffairs> poweraffairs = poweraffairsMapper.findPoweraffairs();
		return poweraffairs;
	}

	/**
	 * 添加事权单位
	 */
	@Override
	public int insert(BipTPoweraffairs record) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String format = sdf.format(new Date());
		record.setFnumber(format + number);
		number++;
		while (number > 1000) {
			number = 1;
		}
		int i = poweraffairsMapper.insert(record);
		return i;
	}

}
