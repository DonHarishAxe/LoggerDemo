package com.endurance;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by harish on 14/6/17.
 */
@SpringBootApplication
public class AppDemo {
    private static Logger log = Logger.getLogger(AppDemo.class);

    public static void main( String[] args ) {
        log.info("Logger enabled: Entering main \n\n");
        SpringApplication.run(AppDemo.class,args);
        log.info("Exiting main");
    }
    //public static void main(String args[]){
    //    SpringApplication.run(AppDemo.class,args);
    //}
}

