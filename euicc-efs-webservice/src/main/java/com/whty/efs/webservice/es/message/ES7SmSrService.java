package com.whty.efs.webservice.es.message;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2016-12-28T15:37:31.375+08:00
 * Generated source version: 3.1.9
 * 
 */
@WebServiceClient(name = "ES7SmSrService", 
                  wsdlLocation = "file:WebServicesAPI1/ES7_SMSR.wsdl",
                  targetNamespace = "http://namespaces.gsma.org/esim-messaging/3") 
public class ES7SmSrService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://namespaces.gsma.org/esim-messaging/3", "ES7SmSrService");
    public final static QName ES7SmSrPort = new QName("http://namespaces.gsma.org/esim-messaging/3", "ES7SmSrPort");
    static {
        URL url = null;
        try {
            url = new URL("file:WebServicesAPI1/ES7_SMSR.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ES7SmSrService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:WebServicesAPI1/ES7_SMSR.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ES7SmSrService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ES7SmSrService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ES7SmSrService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    /**
     *
     * @return
     *     returns ES7SmSr
     */
    @WebEndpoint(name = "ES7SmSrPort")
    public ES7SmSr getES7SmSrPort() {
        return super.getPort(ES7SmSrPort, ES7SmSr.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ES7SmSr
     */
    @WebEndpoint(name = "ES7SmSrPort")
    public ES7SmSr getES7SmSrPort(WebServiceFeature... features) {
        return super.getPort(ES7SmSrPort, ES7SmSr.class, features);
    }

}
