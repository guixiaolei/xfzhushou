package cn.kingcai.dao;

import cn.kingcai.entity.BipTPostponerecord;
import cn.kingcai.entity.BipTPostponerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTPostponerecordMapper {
    int countByExample(BipTPostponerecordExample example);

    int deleteByExample(BipTPostponerecordExample example);

    int insert(BipTPostponerecord record);

    int insertSelective(BipTPostponerecord record);

    List<BipTPostponerecord> selectByExample(BipTPostponerecordExample example);

    int updateByExampleSelective(@Param("record") BipTPostponerecord record, @Param("example") BipTPostponerecordExample example);

    int updateByExample(@Param("record") BipTPostponerecord record, @Param("example") BipTPostponerecordExample example);
}