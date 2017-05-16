package com.benji.spring;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
    //spring mvc will run setAsText functionn of this class -->
    //before performing data binding task for studentName property
    
    @Override
    public void setAsText(String studentName)throws IllegalArgumentException{
        
        if(studentName.contains("Mr.")||studentName.contains("Ms.")){
            
            setValue(studentName);
            
        }else{
            
            studentName = "Ms. "+studentName;
            setValue(studentName);
        }
    }
}
