package com.whty.efs.webservice.es.message;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2016-12-28T15:37:31.369+08:00
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://namespaces.gsma.org/esim-messaging/3", name = "ES7SmSr")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ES7SmSr {

    @WebMethod(operationName = "ES7-HandleSMSRChangeNotification")
    @Action(input = "http://gsma.com/ES7/eUICCManagement/ES7-HandleSMSRChangeNotification")
    @Oneway
    public void es7HandleSMSRChangeNotification(
        @WebParam(partName = "parameters", name = "ES7-HandleSMSRChangeNotification", targetNamespace = "http://namespaces.gsma.org/esim-messaging/3")
        ES7HandleSMSRChangeNotification parameters
    );
}
