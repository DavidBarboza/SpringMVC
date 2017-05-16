package com.benji.spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController{

    @RequestMapping("/welcome/{countryName}/{userName}")
    public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {
            
        String name = pathVars.get("userName");
        String country = pathVars.get("countryName");
        
        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("msg", "Hello "+name+ " from "+country);
		
        return model;
    }
    
    @RequestMapping("/hi")
    public ModelAndView hiWorld(){
        
        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("msg", "hi world penyejo");
        
        return model;
    }
}
