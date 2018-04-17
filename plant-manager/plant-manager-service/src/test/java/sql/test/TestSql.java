package sql.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cust.plant.manager.service.PlantServiceImpl;

public class TestSql {
	
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
		PlantServiceImpl plantServiceImpl = (PlantServiceImpl)context.getBean("cust.plant.manager.service.PlantServiceImpl");
		plantServiceImpl.selectByPrimaryKey(1);
	}

}
