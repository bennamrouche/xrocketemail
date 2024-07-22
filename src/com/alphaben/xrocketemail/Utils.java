package com.alphaben.xrocketemail;
import com.alphaben.xrocketemail.Email.EmailValidator;
import java.util.HashSet;
import java.util.Set;



public class Utils 
{
  public static Set<String> StringEmailToSet(String emails)
   {
        Set<String> linesSet = new HashSet<>();
        EmailValidator validator = new EmailValidator();
        Output out = Output.getInstance();
        int invalid = 0;   
        
        if (emails == null)
             return linesSet;
         
          String lines[] = emails.split("\n");
          if (lines == null)
              return linesSet;
         for(String  line : lines)
         {
             line = line.toLowerCase().trim();
             if(line.isEmpty())
                 continue;
             if(validator.isValidEmail(line))
        
                 linesSet.add(line);     
             else
                    invalid++;
              
             
         }
    if(invalid == 0 && linesSet.size() > 0)
        out.info("All Emails Valid");
    else if(invalid != 0)
         out.warning("There are ["+  invalid+ "] invalid emails; they are removed automatically.");
    
        return linesSet;
    }   
}
