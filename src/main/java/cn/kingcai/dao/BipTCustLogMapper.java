package cn.kingcai.dao;

import cn.kingcai.entity.BipTCustLog;
import cn.kingcai.entity.BipTCustLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTCustLogMapper {
    int countByExample(BipTCustLogExample example);

    int deleteByExample(BipTCustLogExample example);

    int insert(BipTCustLog record);

    int insertSelective(BipTCustLog record);

    List<BipTCustLog> selectByExample(BipTCustLogExample example);

    int updateByExampleSelective(@Param("record") BipTCustLog record, @Param("example") BipTCustLogExample example);

    int updateByExample(@Param("record") BipTCustLog record, @Param("example") BipTCustLogExample example);
}