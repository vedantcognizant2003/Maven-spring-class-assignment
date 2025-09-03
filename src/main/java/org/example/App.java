package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {           //lets talk about constructor injection,setter inhjection and autowiring i will make a simple class of car,myVehicle and fetch its object from ioc container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        myVehicle vehicle =  context.getBean(myVehicle.class);
        vehicle.build();








    }
}
