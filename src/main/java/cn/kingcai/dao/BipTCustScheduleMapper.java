package cn.kingcai.dao;

import cn.kingcai.entity.BipTCustSchedule;
import cn.kingcai.entity.BipTCustScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTCustScheduleMapper {
    int countByExample(BipTCustScheduleExample example);

    int deleteByExample(BipTCustScheduleExample example);

    int insert(BipTCustSchedule record);

    int insertSelective(BipTCustSchedule record);

    List<BipTCustSchedule> selectByExample(BipTCustScheduleExample example);

    int updateByExampleSelective(@Param("record") BipTCustSchedule record, @Param("example") BipTCustScheduleExample example);

    int updateByExample(@Param("record") BipTCustSchedule record, @Param("example") BipTCustScheduleExample example);
}