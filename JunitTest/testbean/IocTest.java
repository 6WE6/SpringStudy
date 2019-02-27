package testbean;

import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.CollTest;
import com.briup.bean.StaticFactory;
import com.briup.bean.Student;
import com.briup.bean.UserService;

public class IocTest {
	@Test
	public void ioc_test(){
		//启动Spring容器，加载配置文件(spring容器启动时就创建对象)
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/ioc.xml");
		//getBean()方法从容器中获取对象
		//默认情况下，spring构建的都是单例对象
		UserService us1 = (UserService) cp.getBean("userService");
		UserService us2 = cp.getBean(UserService.class);
		UserService us3 = cp.getBean("userService",UserService.class);
		//isPrototype判断us对象是否时非单例对象
		System.out.println(cp.isPrototype("us"));//true
		System.out.println(cp.isSingleton("ud"));//true
//		System.out.println(us3);
	}
	
	@Test
	public void setter_test(){
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/setter.xml");
		System.out.println(cp.getBean("student"));
	}
	
	@Test
	public void rel_test(){
		try{
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/ref.xml");
		System.out.println(cp.getBean("us"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void coll_test(){
		try{
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/coll.xml");
		CollTest col = (CollTest) cp.getBean("coll");
//		String[] arr = col.getArray();
//		System.out.println(Arrays.toString(arr));
//		List<String> list = col.getList();
//		System.out.println(list);
////	System.out.println(list.getClass());
//		Set<String> set = col.getSet();
//		System.out.println(set);
//		System.out.println(set.getClass());
		Map<String,String> map = col.getMap();
		System.out.println(map.getClass());
		System.out.println(map);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void definecoll_test(){
		try{
			/**
			 * Spring可以加载多个路径ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/definecoll.xml","com/briup/ioc/definecoll.xml");
			 */
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/definecoll.xml");
		CollTest col = (CollTest) cp.getBean("de_coll");
		Properties pros = col.getPro();
		System.out.println(pros.getClass());
		System.out.println(pros);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void construct_test(){
		try{
			/**
			 * Spring可以加载多个路径ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/definecoll.xml","com/briup/ioc/definecoll.xml");
			 */
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/construct.xml");
		Student stu = (Student) cp.getBean("student3");
		System.out.println(stu.getClass());
		System.out.println(stu);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void auto_test(){
		try{
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/auto.xml");
		UserService us = (UserService) cp.getBean("us");
		System.out.println(us.getClass());
		System.out.println(us);
		System.out.println(us.getDao());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void extends_test(){
		try{
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/extends.xml");
		Student stu1 = (Student) cp.getBean("stu1");
		Student stu2 = (Student) cp.getBean("stu2");
		Student stu3 = (Student) cp.getBean("stu3");
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void staticF_test(){
		try{
			ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/staticF.xml");
			System.out.println(cp.getBean("us"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void springF_test(){
		//PreferencesPlaceholderConfigurer f = new PreferencesPlaceholderConfigurer();
		try{
			ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/springF.xml");
			System.out.println(cp.getBean("conn"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void instanceF_test(){
		try{
			ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/instanceF.xml");
			System.out.println(cp.getBean("ud"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void life_test(){
		try{
			ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/life.xml");
			System.out.println(cp.getBean("life"));
			cp.destroy();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editor_test(){
		try{
			ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/editor.xml");
			System.out.println(cp.getBean("user"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void annotion_test(){
		try{
			ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/annotion.xml");
			System.out.println(cp.getBean("dest"));
			cp.destroy();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
