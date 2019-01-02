package cn.kingcai.dao;

import cn.kingcai.entity.TSecXtusermap;
import cn.kingcai.entity.TSecXtusermapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSecXtusermapMapper {
    int countByExample(TSecXtusermapExample example);

    int deleteByExample(TSecXtusermapExample example);

    int insert(TSecXtusermap record);

    int insertSelective(TSecXtusermap record);

    List<TSecXtusermap> selectByExample(TSecXtusermapExample example);

    int updateByExampleSelective(@Param("record") TSecXtusermap record, @Param("example") TSecXtusermapExample example);

    int updateByExample(@Param("record") TSecXtusermap record, @Param("example") TSecXtusermapExample example);
}