package com.example.stadiumspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class StadiumSpringApplication {

    public static void main(String[] args) {
        //SpringApplication.run(StadiumSpringApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Stadium theStadium = context.getBean("myStadium", Stadium.class);
        System.out.println(theStadium.getOwnerName());
        System.out.println(theStadium.getActualCapacity());
        context.close();

    }
}
