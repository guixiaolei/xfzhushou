package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.BipTTypespetitions;
import cn.kingcai.entity.BipTTypespetitionsExample;

public interface BipTTypespetitionsMapper {
	/**
	 * 查询上访类型
	 */
	List<Map> selectTypes();

	/**
	 * 删除上访类型
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	void delete(String fnumber);

	/**
	 * 更新上访类型
	 * @param typespetition
	 * @author volcano
	 * @version 1.0
	 */
	void update(BipTTypespetitions typespetition);

	//逆向生成
    int countByExample(BipTTypespetitionsExample example);

    int deleteByExample(BipTTypespetitionsExample example);

	/**
	 * 保存上访类型
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
    int insert(BipTTypespetitions record);

    int insertSelective(BipTTypespetitions record);

    List<BipTTypespetitions> selectByExample(BipTTypespetitionsExample example);

    int updateByExampleSelective(@Param("record") BipTTypespetitions record, @Param("example") BipTTypespetitionsExample example);

    int updateByExample(@Param("record") BipTTypespetitions record, @Param("example") BipTTypespetitionsExample example);

}