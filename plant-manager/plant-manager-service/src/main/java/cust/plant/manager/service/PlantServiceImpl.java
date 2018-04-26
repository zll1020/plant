package cust.plant.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cust.plant.common.pojo.PlantResult;
import cust.plant.common.utils.IDUtils;
import cust.plant.interfaces.mapper.PlantMapper;
import cust.plant.manager.interfaces.PlantService;
import cust.plant.manager.pojo.EasyUIDataGridResult;
import cust.plant.manager.pojo.Plant;
import cust.plant.manager.pojo.PlantExample;

@Service
public class PlantServiceImpl implements PlantService {

	@Autowired
	private PlantMapper plantMapper;

	/**
	 * 根据ID查找植物
	 */
	@Override
	public Plant selectByPrimaryKey(Integer plantID) {

		Plant plant = plantMapper.selectByPrimaryKey(plantID);
		System.out.println(plant.toString());
		return plant;
	}
	/**
	 * 查询植物列表
	 */
	public EasyUIDataGridResult getPlantList(Integer page,Integer rows){
		PageHelper.startPage(page,rows);
		PlantExample plantExample = new PlantExample();
		List<Plant> list = plantMapper.selectByExample(plantExample);
		PageInfo<Plant> pageInfo = new PageInfo<>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal((int)pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	/**
	 * 添加植物
	 */
	@Override
	public PlantResult addPlant(Plant plant) {
		int plantID = (int)IDUtils.genItemId();
		plant.setPlantid(plantID);
		plantMapper.insert(plant);
		return PlantResult.ok();
	}
	
	/**
	 * 修改植物信息
	 */
	@Override
	public PlantResult updatePlant(Plant plant) {		
		plantMapper.updateByPrimaryKey(plant);
		return PlantResult.ok();
	}
	/**
	 * 删除植物信息
	 */
	@Override
	public PlantResult deletePlant(Integer plantID) {
		plantMapper.deleteByPrimaryKey(plantID);
		return PlantResult.ok();
	}
}
