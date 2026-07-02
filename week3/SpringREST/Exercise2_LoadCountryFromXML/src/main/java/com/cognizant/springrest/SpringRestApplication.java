package com.cognizant.springrest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springrest.model.Country;

public class SpringRestApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = context.getBean("country", Country.class);

        System.out.println(country);

    }
}