package cn.kingcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.BipTLetterbureau;
import cn.kingcai.entity.BipTLetterbureauExample;
import cn.kingcai.entity.Letterbureau;

public interface BipTLetterbureauMapper {
	/**
	 * 查询信访局成员列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Letterbureau> selectBureauList();
	//逆向生成
    int countByExample(BipTLetterbureauExample example);

    int deleteByExample(BipTLetterbureauExample example);

    int insert(BipTLetterbureau record);

    int insertSelective(BipTLetterbureau record);

    List<BipTLetterbureau> selectByExample(BipTLetterbureauExample example);

    int updateByExampleSelective(@Param("record") BipTLetterbureau record, @Param("example") BipTLetterbureauExample example);

    int updateByExample(@Param("record") BipTLetterbureau record, @Param("example") BipTLetterbureauExample example);
}