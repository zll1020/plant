package cust.plant.manager.interfaces;

import java.util.List;

import cust.plant.common.pojo.EasyUITreeNode;

public interface PlantTypeService {
	public List<EasyUITreeNode> getPlantTypeList(long parentID);

}
