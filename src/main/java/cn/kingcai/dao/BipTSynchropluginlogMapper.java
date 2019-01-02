package cn.kingcai.dao;

import cn.kingcai.entity.BipTSynchropluginlog;
import cn.kingcai.entity.BipTSynchropluginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTSynchropluginlogMapper {
    int countByExample(BipTSynchropluginlogExample example);

    int deleteByExample(BipTSynchropluginlogExample example);

    int insert(BipTSynchropluginlog record);

    int insertSelective(BipTSynchropluginlog record);

    List<BipTSynchropluginlog> selectByExampleWithBLOBs(BipTSynchropluginlogExample example);

    List<BipTSynchropluginlog> selectByExample(BipTSynchropluginlogExample example);

    int updateByExampleSelective(@Param("record") BipTSynchropluginlog record, @Param("example") BipTSynchropluginlogExample example);

    int updateByExampleWithBLOBs(@Param("record") BipTSynchropluginlog record, @Param("example") BipTSynchropluginlogExample example);

    int updateByExample(@Param("record") BipTSynchropluginlog record, @Param("example") BipTSynchropluginlogExample example);
}