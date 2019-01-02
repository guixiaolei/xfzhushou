package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

public interface BipTProvincesynchroMapper {

	/**
	 * 查询列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> list();

	/**
	 * 修改时根据单据单号查询信息
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showData(String fbillno);

	/* int countByExample(BipTProvincesynchroExample example);
	
	int deleteByExample(BipTProvincesynchroExample example);
	
	int insert(BipTProvincesynchroWithBLOBs record);
	
	int insertSelective(BipTProvincesynchroWithBLOBs record);
	
	List<BipTProvincesynchroWithBLOBs> selectByExampleWithBLOBs(BipTProvincesynchroExample example);
	
	List<BipTProvincesynchro> selectByExample(BipTProvincesynchroExample example);
	
	int updateByExampleSelective(@Param("record") BipTProvincesynchroWithBLOBs record, @Param("example") BipTProvincesynchroExample example);
	
	int updateByExampleWithBLOBs(@Param("record") BipTProvincesynchroWithBLOBs record, @Param("example") BipTProvincesynchroExample example);
	
	int updateByExample(@Param("record") BipTProvincesynchro record, @Param("example") BipTProvincesynchroExample example);*/
}