package cust.plant.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cust.plant.common.pojo.EasyUITreeNode;
import cust.plant.manager.interfaces.PlantTypeService;

@Controller
public class PlantTypeController {
	@Autowired
	public PlantTypeService plantTypeService;
	
	@RequestMapping("/plant/type/list")
	@ResponseBody
	public List<EasyUITreeNode> getPlantTypeList(@RequestParam(value="id",defaultValue="0")long parentId){
		return plantTypeService.getPlantTypeList(parentId);
		
	}

}
