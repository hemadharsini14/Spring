package Hibdemo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con =new ClassPathXmlApplicationContext("beansimp.xml"); 
    	//Vehicle obj = (Vehicle)con.getBean("vehicle");
    	Vehicle obj = (Vehicle)con.getBean("car");
        //System.out.println( "Hello World!" );
    	obj.drive();
    	//Vehicle obj1 = (Vehicle)con.getBean("vehicle1");
    	Vehicle obj1 = (Vehicle)con.getBean("bike");
        //System.out.println( "Hello World!" );
    	obj1.drive();
    }
}
