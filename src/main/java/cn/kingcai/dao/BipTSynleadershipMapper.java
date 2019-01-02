package cn.kingcai.dao;

import cn.kingcai.entity.BipTSynleadership;
import cn.kingcai.entity.BipTSynleadershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTSynleadershipMapper {
    int countByExample(BipTSynleadershipExample example);

    int deleteByExample(BipTSynleadershipExample example);

    int insert(BipTSynleadership record);

    int insertSelective(BipTSynleadership record);

    List<BipTSynleadership> selectByExample(BipTSynleadershipExample example);

    int updateByExampleSelective(@Param("record") BipTSynleadership record, @Param("example") BipTSynleadershipExample example);

    int updateByExample(@Param("record") BipTSynleadership record, @Param("example") BipTSynleadershipExample example);
}