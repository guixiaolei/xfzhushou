package cn.kingcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.BipTJoint;
import cn.kingcai.entity.BipTJointExample;
import cn.kingcai.entity.ManaegeUtils;

public interface BipTJointMapper {
	/**
	 * 根据成员姓名查询管理的事权单位的id
	 */
	List<Integer> selectManagedId(Integer fBipPoweraffairs);

	/**
	 * 查询管理的事权单位
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	ManaegeUtils selectManageUtils(Integer fid);

	//逆向生成
    int countByExample(BipTJointExample example);

    int deleteByExample(BipTJointExample example);

    int insert(BipTJoint record);

    int insertSelective(BipTJoint record);

    List<BipTJoint> selectByExample(BipTJointExample example);

    int updateByExampleSelective(@Param("record") BipTJoint record, @Param("example") BipTJointExample example);

    int updateByExample(@Param("record") BipTJoint record, @Param("example") BipTJointExample example);
}