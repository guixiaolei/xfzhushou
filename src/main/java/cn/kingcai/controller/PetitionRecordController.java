package cn.kingcai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.service.PetitionRecordService;

/**
 * 信访记录
 * @author volcano
 *
 */
@RestController
@RequestMapping("/petitionRecord")
public class PetitionRecordController {

	@Autowired
	private PetitionRecordService recordServcie;

	/**
	 * 查询信访记录详情
	 * @param fBipUserid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/record")
	public List<Map> record(String fBipUserid) {
		return recordServcie.record(fBipUserid);
	}
}
