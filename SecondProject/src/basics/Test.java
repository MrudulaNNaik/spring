package basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//import com.sun.tools.classfile.Attribute.Factory;

import constructor.injection.Employee;

public class Test {
	public static void main(String[] args) {
		//System.out.println("hellow world");
		/*Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student mrudula = (Student) beanFactory.getBean("studentbean");
		mrudula.displayInfo();*/
		
		 Resource res=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(res);  

	        Employee e=(Employee)factory.getBean("employee");  
	        e.show(); 
		
	}

}
