package com.whty.efs.webservice.es.message;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-08T17:55:13.045+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://namespaces.gsma.org/esim-messaging/3", name = "ES1SmSr")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ES1SmSr {

    @WebMethod(operationName = "ES1-RegisterEIS")
    @Action(input = "http://gsma.com/ES1/eUICCManagement/ES1-RegisterEISRequest", output = "http://gsma.com/ES1/eUICCManagement/ES1-RegisterEISResponse")
    @WebResult(name = "ES1-RegisterEISResponse", targetNamespace = "http://namespaces.gsma.org/esim-messaging/3", partName = "parameters")
    public ES1RegisterEISResponse es1RegisterEIS(
        @WebParam(partName = "parameters", name = "ES1-RegisterEISRequest", targetNamespace = "http://namespaces.gsma.org/esim-messaging/3")
        ES1RegisterEISRequest parameters
    );
}
