package com.whty.efs.webservice.message;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.whty.efs.webservice.message.ObjectFactory;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-11-25T10:16:56.874+08:00
 * Generated source version: 2.7.12
 * 
 */
@WebService(targetNamespace = "http://www.tathing.com", name = "IEnterFrontService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IEnterFrontService {

    @WebResult(name = "AppPersonialResponse", targetNamespace = "http://www.tathing.com", partName = "AppPersonialResponse")
    @WebMethod(operationName = "AppPersonial")
    public AppPersonialResponse appPersonial(
        @WebParam(partName = "AppPersonialRequest", name = "AppPersonialRequest", targetNamespace = "http://www.tathing.com")
        AppPersonialRequest appPersonialRequest
    );


    @WebResult(name = "AppQueryResponse", targetNamespace = "http://www.tathing.com", partName = "AppQueryResponse")
    @WebMethod(operationName = "AppQuery")
    public AppQueryResponse appQuery(
        @WebParam(partName = "AppQueryRequest", name = "AppQueryRequest", targetNamespace = "http://www.tathing.com")
        AppQueryRequest AppQueryRequest
    );
}
