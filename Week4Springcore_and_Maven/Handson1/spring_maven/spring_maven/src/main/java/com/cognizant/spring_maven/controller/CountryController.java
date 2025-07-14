package com.cognizant.spring_maven.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    // Fetch a default country from XML config
    @GetMapping("/default")
    public Country fetchDefaultCountry() {
        LOGGER.info("START - fetchDefaultCountry");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        LOGGER.info("END - fetchDefaultCountry");
        return country;
    }

    // Fetch a country based on country code from the service layer
    @GetMapping("/{code}")
    public Country fetchCountryByCode(@PathVariable String code) {
        LOGGER.info("START - fetchCountryByCode: {}", code);

        Country country = countryService.getCountry(code);

        LOGGER.info("END - fetchCountryByCode");
        return country;
    }
}