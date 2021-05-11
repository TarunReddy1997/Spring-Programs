package com.ojas.app.SpringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.app.SpringXmlConfiguration.model.Sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sample sample = (Sample) context.getBean("sampleObj");
        sample.display();
    }
}
