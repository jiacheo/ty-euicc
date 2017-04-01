
package com.whty.efs.webservice.es.message;

import javax.xml.ws.Endpoint;

import com.whty.efs.webservice.es.SmSrES7PortImpl;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-12T13:37:17.417+08:00
 * Generated source version: 3.1.7
 * 
 */
 
public class ES7SmSr_SmSrES7Port_Server{

    protected ES7SmSr_SmSrES7Port_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new SmSrES7PortImpl();
        String address = "http://gsma.org/esim-messaging/3/ES7/ES7SmSrService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new ES7SmSr_SmSrES7Port_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
