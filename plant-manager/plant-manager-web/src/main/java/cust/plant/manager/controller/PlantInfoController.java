package cust.plant.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cust.plant.manager.interfaces.PlantInfoService;
import cust.plant.manager.pojo.Plantinfo;

@Controller
public class PlantInfoController {
	@Autowired
	private PlantInfoService plantInfoService;
	
	@RequestMapping("/user/plantinfo/{plantID}")
	public String getPlantInfo(@PathVariable Integer plantID,Model model){
		List<Plantinfo> plantInfoList = plantInfoService.selectByPrimaryKey(plantID);
		model.addAttribute("plantInfoList", plantInfoList);
		return "plantInfoList";
	}
}
