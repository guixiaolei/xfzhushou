package cn.kingcai.dao;

import cn.kingcai.entity.BipTCustUnitadvices;
import cn.kingcai.entity.BipTCustUnitadvicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTCustUnitadvicesMapper {
    int countByExample(BipTCustUnitadvicesExample example);

    int deleteByExample(BipTCustUnitadvicesExample example);

    int insert(BipTCustUnitadvices record);

    int insertSelective(BipTCustUnitadvices record);

    List<BipTCustUnitadvices> selectByExample(BipTCustUnitadvicesExample example);

    int updateByExampleSelective(@Param("record") BipTCustUnitadvices record, @Param("example") BipTCustUnitadvicesExample example);

    int updateByExample(@Param("record") BipTCustUnitadvices record, @Param("example") BipTCustUnitadvicesExample example);
}