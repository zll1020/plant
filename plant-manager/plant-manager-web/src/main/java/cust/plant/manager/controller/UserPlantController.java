package cust.plant.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cust.plant.manager.interfaces.UserPlantService;
import cust.plant.manager.pojo.Plant;
@Controller
public class UserPlantController {
	@Autowired
	private UserPlantService userPlantService;
	
	@RequestMapping("/user/plant/{userID}")
	public String getPlantList(@PathVariable Integer userID,Model model){
		List<Plant> userPlantList = userPlantService.selectByPrimaryKey(userID);
		model.addAttribute("userPlantList", userPlantList);
		return "userPlantList";
	}

}
