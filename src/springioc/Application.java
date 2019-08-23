package springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springioc.pojo.Company;

/**
* @author 何永
* @createDate 创建时间：2019年8月22日 上午9:05:47
*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("/application.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		ApplicationContext context=new ClassPathXmlApplicationContext("/application.xml");
		Company company =(Company)bf.getBean("company");
		Company company1=(Company)context.getBean("company1"); 
		Company company2= (Company)context.getBean("company2"); 
		System.out.println(company);
		System.out.println(company1);
		System.out.println(company2);
	}

}
