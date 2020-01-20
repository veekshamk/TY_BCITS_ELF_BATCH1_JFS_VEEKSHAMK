package org.bcits;
import java.util.*;
public class RegistrationServiceClient 
{  
    public static void main(String[] args) 
    {
        RegistrationService service = new RegistrationService();
        try {
            service.validateEmail("abc@gmail.com");
        } catch (EmailNotUniqueException e) {
            // logging and handling the situation
        }
    }

}
