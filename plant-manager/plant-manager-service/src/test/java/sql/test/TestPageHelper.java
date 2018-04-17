package sql.test;


import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cust.plant.interfaces.mapper.PlantMapper;
import cust.plant.manager.pojo.Plant;
import cust.plant.manager.pojo.PlantExample;

/**
 * 测试pagehelper分页
 * @author u
 *
 */
public class TestPageHelper {
	@Test
	public void testPageHelper(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		PlantMapper plantMapper = context.getBean(PlantMapper.class);
		PageHelper.startPage(1,5);
		PlantExample plantExample = new PlantExample();
		List<Plant> list = plantMapper.selectByExample(plantExample);
		System.err.println(list);
		PageInfo<Plant> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo.getTotal());
		System.out.println(pageInfo.getPages());
		System.out.println(pageInfo.getPageNum());
		System.out.println(pageInfo.getPageSize());
	}

	
}
