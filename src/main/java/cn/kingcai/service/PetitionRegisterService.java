package cn.kingcai.service;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.BipTPetitionregister;
import cn.kingcai.entity.Complainantslist;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.PetitionerfileSave;

public interface PetitionRegisterService {

	/**
	 * 保存信访登记的信息
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	int insert(BipTPetitionregister record);

	/**
	 * 选择一级分类
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> selectFirstclass();

	/**
	 * 根据一级分类查询二级分类
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> findByParentId1(String fBipFirstclassify);

	/**
	 * 根据二级分类查询三级分类
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> findByParentId2(String fBipSecondclassify);

	/**
	 * 查询政治面貌
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> findOutlook();

	/**
	 * 保存到信访人列表
	 * @param complainantslist
	 * @author volcano
	 * @version 1.0
	 */
	void saveToList(Complainantslist complainantslist);

	/**
	 * 根据entryId删除信访人
	 * @param parseInt
	 * @author volcano
	 * @version 1.0
	 */
	void deleteListByEntryid(long parseInt);

	/**
	 * 查询信访登记列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	PageResult selectRegisterList(int pageNum, int pageSize);

	/**
	 * 显示信访人信息
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showPetitionList(String fid);

	/**
	 * 保存到信访人档案
	 * @param file
	 * @author volcano
	 * @version 1.0
	 */
	void saveToPetitionerFile(PetitionerfileSave file);

	/**
	 * 修改时回显联系人数据
	 * @param fid
	 * @author volcano
	 * @version 1.0
	 * @return 
	 */
	List<Map> showDataList(String fid);

	/**
	 * 更新信访联系人
	 * @param register
	 * @author volcano
	 * @version 1.0
	 */
	void updateDataList(BipTPetitionregister register);


}
