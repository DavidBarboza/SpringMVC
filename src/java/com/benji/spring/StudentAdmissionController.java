package com.benji.spring;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
    
    @InitBinder
    public void initBinder(WebDataBinder binder){
        //binder.setDisallowedFields(new String[] {"studentMobile"});
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
        binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
    }
    
    @RequestMapping(value="admissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm(){
    
        ModelAndView model = new ModelAndView("AdmissionForm");
        
        return model;
    }
    
    @ModelAttribute
    public void addingCommonObjects(Model model){
        model.addAttribute("headerMessage", "Colegio de Cursos JAVA");
    }
    
    @RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
        
        if(result.hasErrors()){
            
            ModelAndView model1 = new ModelAndView("AdmissionForm");
            return model1;
        }
        
        ModelAndView model = new ModelAndView("AdmissionSuccess");
        
        return model;
    }
    
    /* old way sin usar Anotacion @ModelAttribute
    @RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqParams){
        
        Student student1 = new Student();
        student1.setStudentName(reqParams.get("studentName"));
        student1.setStudentHobby(reqParams.get("studentHobby"));
        
        ModelAndView model = new ModelAndView("AdmissionSuccess");
        model.addObject("headerMessage", "Colegio de Penyejadas e_e/");
        model.addObject("student1", student1);
        
        return model;
    }*/
}
