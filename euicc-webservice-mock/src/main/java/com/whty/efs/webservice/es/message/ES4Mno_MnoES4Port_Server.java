
package com.whty.efs.webservice.es.message;

import javax.xml.ws.Endpoint;

import com.whty.efs.webservice.es.MnoES4PortImpl;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-01-05T16:53:40.164+08:00
 * Generated source version: 3.1.7
 * 
 */
 
public class ES4Mno_MnoES4Port_Server{

    protected ES4Mno_MnoES4Port_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new MnoES4PortImpl();
        String address = "http://gsma.org/esim-messaging/3/ES4/ES4MnoService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new ES4Mno_MnoES4Port_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
