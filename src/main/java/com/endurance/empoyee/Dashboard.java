package com.endurance.empoyee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by harish on 16/6/17.
 */
@Controller
public class Dashboard {

    @RequestMapping(value="/emplo",method= RequestMethod.GET)
    public String dashboardMain(){
    return "index";
    }
}
