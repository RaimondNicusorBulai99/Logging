package Servizi.Logging.controllers;

import Servizi.Logging.services.Servis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Servis service;

    Logger logg = LoggerFactory.getLogger(Servis.class);

    /*
       Return a hello message in app and log it
     */
    @GetMapping("/")
    public void sayWelcome(){
        logg.info("Welcome to the App");
    }

    /*
       take 2 value and use calculateExp Service
     */
    @GetMapping("/exp")
    public String getEXp(@RequestParam Integer int1,@RequestParam Integer int2 ){
        logg.info("Start getExp");
        return service.calculateExp(int1,int2);
    }

    /*
    Throws a new error
     */
    @GetMapping("/getErrors")
    public void getError(){
        Error error = new Error("New Custom Error");
        logg.error("This is a ERROR logging",error);
    }
}
