package com.nowconder.community;

import com.nowconder.community.dao.AlphaDao;
import com.nowconder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) //以main下的类为配置文件

//得到容器 实现接口ApplicationContextAware就可以
class CommunityApplicationTests implements ApplicationContextAware {


	private ApplicationContext applicationContext; //ApplicationContext就是容器

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;

	}

	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);//证明容器存在且可见 接下来看如何用容器管理bean
		AlphaDao alphaDao=applicationContext.getBean(AlphaDao.class);//从容器中获取AlphaDao的bean
		//如果这个接口有两个实现，那么此时不知道该取哪一个作为bean所以需要注解@Primary
		System.out.println(alphaDao.select());
		alphaDao=applicationContext.getBean("alphaHibernate",AlphaDao.class);
		System.out.println(alphaDao.select());
	}
	@Test
	public void testBeanManagement(){
		AlphaService alphaService=applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}
	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat=applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	@Autowired
	@Qualifier("alphaHibernate")//想要另外一个bean
	private AlphaDao alphaDao;
	//依赖注入 把容器中的AlphaDao这个bean注入到变量alphaDao
	private SimpleDateFormat simpleDateFormat;

	@Test
	public void testDI(){
		System.out.println("-----");
		System.out.println(alphaDao);
		System.out.println();
		System.out.println(simpleDateFormat);
	}



}
