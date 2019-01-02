package cn.kingcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.BipTJointcommittee;
import cn.kingcai.entity.BipTJointcommitteeExample;

public interface BipTJointcommitteeMapper {
	/**
	 * 查询联席会成员
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<BipTJointcommittee> selectJointCommittee();

	//逆向生成
    int countByExample(BipTJointcommitteeExample example);

    int deleteByExample(BipTJointcommitteeExample example);

    int insert(BipTJointcommittee record);

    int insertSelective(BipTJointcommittee record);

    List<BipTJointcommittee> selectByExample(BipTJointcommitteeExample example);

    int updateByExampleSelective(@Param("record") BipTJointcommittee record, @Param("example") BipTJointcommitteeExample example);

    int updateByExample(@Param("record") BipTJointcommittee record, @Param("example") BipTJointcommitteeExample example);
}