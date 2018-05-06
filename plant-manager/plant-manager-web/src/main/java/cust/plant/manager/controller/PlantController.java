package cust.plant.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cust.plant.common.pojo.PlantResult;
import cust.plant.manager.interfaces.PlantService;
import cust.plant.manager.pojo.EasyUIDataGridResult;
import cust.plant.manager.pojo.Plant;

@Controller
public class PlantController {

	@Autowired
	private PlantService plantService;

	/**
	 * 根据ID查询植物
	 * 
	 * @param plantID
	 * @return
	 */
	@RequestMapping("/plant/{plantID}")
	@ResponseBody
	public Plant getPlantById(@PathVariable Integer plantID) {
		System.out.println("controller");
		return plantService.selectByPrimaryKey(plantID);
	}

	/**
	 * 查询植物列表
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/plant/list")
	@ResponseBody
	public EasyUIDataGridResult getPlantList(Integer page, Integer rows) {
		return plantService.getPlantList(page, rows);
	}

	/**
	 * 添加植物
	 * 
	 * @param plant
	 * @return
	 */
	@RequestMapping("/plant/save")
	@ResponseBody
	public PlantResult addPlant(Plant plant) {

		return plantService.addPlant(plant);
	}
	
	/**
	 * 修改植物信息
	 * @param plant
	 * @return
	 */
	@RequestMapping("/plant/update")	
	@ResponseBody
	public PlantResult updatePlant(@RequestParam("plantid") Integer plantid,@RequestParam("typeid") Integer typeid,@RequestParam("plantname") String plantname){		
		Plant plant = plantService.selectByPrimaryKey(plantid);
		plant.setTypeid(typeid);
		plant.setPlantname(plantname);
		return plantService.updatePlant( plant);
	}
	
	/**
	 * 删除植物信息
	 * @param ids
	 * @return
	 */
	@RequestMapping("/plant/delete")
	@ResponseBody
	public PlantResult deletePlant(@RequestParam(value="ids") Integer ids){
		System.out.println(ids);
		return plantService.deletePlant(ids);
	}
}
