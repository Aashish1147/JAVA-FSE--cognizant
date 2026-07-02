package com.cognizant.springrest.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springrest.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = null;

        switch (code.toUpperCase()) {

            case "IN":
                country = context.getBean("countryIN", Country.class);
                break;

            case "US":
                country = context.getBean("countryUS", Country.class);
                break;

            case "JP":
                country = context.getBean("countryJP", Country.class);
                break;
        }

        context.close();

        return country;
    }

}