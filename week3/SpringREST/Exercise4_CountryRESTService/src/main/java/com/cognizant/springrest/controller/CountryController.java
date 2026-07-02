package com.cognizant.springrest.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springrest.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = context.getBean("country", Country.class);

        context.close();

        return country;
    }

}