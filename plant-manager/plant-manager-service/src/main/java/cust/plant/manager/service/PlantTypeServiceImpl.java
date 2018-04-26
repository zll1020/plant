package cust.plant.manager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cust.plant.common.pojo.EasyUITreeNode;
import cust.plant.interfaces.mapper.PlanttypeMapper;
import cust.plant.manager.interfaces.PlantTypeService;
import cust.plant.manager.pojo.Planttype;
import cust.plant.manager.pojo.PlanttypeExample;

@Service
public class PlantTypeServiceImpl implements PlantTypeService {
	@Autowired
	public PlanttypeMapper plantTypeMapper;

	@Override
	public List<EasyUITreeNode> getPlantTypeList(long parentID) {
		PlanttypeExample example = new PlanttypeExample();
		List<Planttype> typeList = plantTypeMapper.selectByExample(example);
		List<EasyUITreeNode> resultList = new ArrayList<EasyUITreeNode>(); 
		for(Planttype type : typeList){
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(type.getTypeid());
			node.setText(type.getType());
			node.setState("open");
			resultList.add(node);
		}
		return resultList;
	}

}
