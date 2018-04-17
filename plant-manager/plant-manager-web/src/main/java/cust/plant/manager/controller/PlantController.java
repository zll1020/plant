package cust.plant.manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cust.plant.manager.interfaces.PlantService;
import cust.plant.manager.pojo.EasyUIDataGridResult;
import cust.plant.manager.pojo.Plant;

@Controller
public class PlantController {
	

@Autowired
	private PlantService plantService;
	
	@RequestMapping("/plant/{plantID}")
	@ResponseBody
	public Plant getPlantById(@PathVariable Integer plantID){
		System.out.println("controller");
		return plantService.selectByPrimaryKey(plantID);
	}
	
	@RequestMapping("/plant/list")
	@ResponseBody
	public EasyUIDataGridResult getPlantList(Integer page, Integer rows){
		return plantService.getPlantList(page, rows);
	}

}
