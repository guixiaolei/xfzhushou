package cn.kingcai.dao;

import cn.kingcai.entity.BipTComplaintmanageheadLk;
import cn.kingcai.entity.BipTComplaintmanageheadLkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTComplaintmanageheadLkMapper {
    int countByExample(BipTComplaintmanageheadLkExample example);

    int deleteByExample(BipTComplaintmanageheadLkExample example);

    int insert(BipTComplaintmanageheadLk record);

    int insertSelective(BipTComplaintmanageheadLk record);

    List<BipTComplaintmanageheadLk> selectByExample(BipTComplaintmanageheadLkExample example);

    int updateByExampleSelective(@Param("record") BipTComplaintmanageheadLk record, @Param("example") BipTComplaintmanageheadLkExample example);

    int updateByExample(@Param("record") BipTComplaintmanageheadLk record, @Param("example") BipTComplaintmanageheadLkExample example);
}