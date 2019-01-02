package cn.kingcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.BipTPoweraffairs;
import cn.kingcai.entity.BipTPoweraffairsExample;
import cn.kingcai.entity.Poweraffairs;

public interface BipTPoweraffairsMapper {
	/**
	 * 查找相关项
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Poweraffairs> findPoweraffairs();


	//逆向生成
    int countByExample(BipTPoweraffairsExample example);

    int deleteByExample(BipTPoweraffairsExample example);

	/**
	 * 添加事权单位档案
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
    int insert(BipTPoweraffairs record);

    int insertSelective(BipTPoweraffairs record);


    List<BipTPoweraffairs> selectByExample(BipTPoweraffairsExample example);

    int updateByExampleSelective(@Param("record") BipTPoweraffairs record, @Param("example") BipTPoweraffairsExample example);

    int updateByExample(@Param("record") BipTPoweraffairs record, @Param("example") BipTPoweraffairsExample example);
}