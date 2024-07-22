package com.alphaben.xrocketemail.Email;


import java.util.regex.Pattern;

/**
 *
 * @author ebennamr
 */
public class EmailValidator 
{
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
    private    Pattern pattern;
 
    public EmailValidator()
    {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    
    public  boolean isValidEmail(String email)
    {   
        return pattern.matcher(email).matches();    
    }
     
  
   
}
