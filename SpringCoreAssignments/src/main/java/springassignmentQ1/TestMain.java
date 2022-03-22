package springassignmentQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("address.xml");
		Customer customer=(Customer) context.getBean("customer");
		customer.getinfo();
	}

}











