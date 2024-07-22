
package com.alphaben.xrocketemail.Email;

import java.util.Set;

/**
 *
 * @author ebennamr
 */


        
public class Email 
{
    public static String TEXT_TYPE ="TEXT";
    public static String HTML_TYPE ="HTML";
    
    private String  Subject;
    private String  Content;
    private String  to;
    private String  ContentType;
    private boolean isHasAttchaments;
    private String  from;  
    private  Set<String> ListAttachament;

    public Email(String from , String to,String Subject, String Content,Set<String> ListAttachament) {
        this.Subject = Subject;
        this.Content = Content;
        this.from  = from;  
        this.to = to;
        this.ContentType = Email.TEXT_TYPE;
        this.isHasAttchaments = true;
        this.ListAttachament = ListAttachament;
    }

    public String getFrom() {
        return from;
    }
    
    
       public Email(String from, String to, String Subject, String Content) 
       {
           
        this.Subject            =   Subject;
        this.Content            =   Content;
        this.to                 =   to;
        this.ContentType        =   Email.TEXT_TYPE;
        this.ContentType        =  Email.TEXT_TYPE;
        this.from               =   from;
        this.isHasAttchaments   =   false;
    }

    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    public String getSubject() {
        return Subject;
    }

    public String getContent() {
        return Content;
    }

    public String getTo() {
        return to;
    }

    public String getContentType() {
        return ContentType;
    }

    public boolean isIsHasAttchaments() {
        return isHasAttchaments;
    }

    public Set<String> getListAttachament() {
        return ListAttachament;
    }
    
    
   
    
}
