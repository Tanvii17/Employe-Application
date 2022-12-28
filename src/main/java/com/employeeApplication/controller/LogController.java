package com.employeeApplication.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log")
    public String log(){
        logger.trace("Log Level : TRACE");
        logger.info("Log Level : INFO");
        logger.debug("Log Level : DEBUG");
        logger.debug("Log Level : ERROR");
        logger.debug("Log Level : WARN");

        return "You can check application.log in log folder.";

    }
}



