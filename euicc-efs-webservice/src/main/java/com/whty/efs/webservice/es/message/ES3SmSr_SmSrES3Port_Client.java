
package com.whty.efs.webservice.es.message;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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
 * 2017-01-06T15:06:23.797+08:00
 * Generated source version: 3.1.9
 * 
 */
public final class ES3SmSr_SmSrES3Port_Client {

    private static final QName SERVICE_NAME = new QName("http://namespaces.gsma.org/esim-messaging/3", "ES3SmSrService");

    private ES3SmSr_SmSrES3Port_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ES3SmSrService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ES3SmSrService ss = new ES3SmSrService(wsdlURL, SERVICE_NAME);
        ES3SmSr port = ss.getSmSrES3Port();  
        
        {
        System.out.println("Invoking es3GetEIS...");
        com.whty.efs.webservice.es.message.ES3GetEISRequest _es3GetEIS_parameters = null;
        com.whty.efs.webservice.es.message.ES3GetEISResponse _es3GetEIS__return = port.es3GetEIS(_es3GetEIS_parameters);
        System.out.println("es3GetEIS.result=" + _es3GetEIS__return);


        }
        {
        System.out.println("Invoking es3DeleteISDP...");
        com.whty.efs.webservice.es.message.ES3DeleteISDPRequest _es3DeleteISDP_parameters = null;
        com.whty.efs.webservice.es.message.ES3DeleteISDPResponse _es3DeleteISDP__return = port.es3DeleteISDP(_es3DeleteISDP_parameters);
        System.out.println("es3DeleteISDP.result=" + _es3DeleteISDP__return);


        }
        {
        System.out.println("Invoking es3UpdateSubscriptionAddress...");
        com.whty.efs.webservice.es.message.ES3UpdateSubscriptionAddressRequest _es3UpdateSubscriptionAddress_parameters = null;
        port.es3UpdateSubscriptionAddress(_es3UpdateSubscriptionAddress_parameters);


        }
        {
        System.out.println("Invoking es3CreateISDP...");
        com.whty.efs.webservice.es.message.ES3CreateISDPRequest _es3CreateISDP_parameters = null;
        com.whty.efs.webservice.es.message.ES3CreateISDPResponse _es3CreateISDP__return = port.es3CreateISDP(_es3CreateISDP_parameters);
        System.out.println("es3CreateISDP.result=" + _es3CreateISDP__return);


        }
        {
        System.out.println("Invoking es3UpdatePolicyRules...");
        com.whty.efs.webservice.es.message.ES3UpdatePolicyRulesRequest _es3UpdatePolicyRules_parameters = null;
        port.es3UpdatePolicyRules(_es3UpdatePolicyRules_parameters);


        }
        {
        System.out.println("Invoking es3ProfileDownloadCompleted...");
        com.whty.efs.webservice.es.message.ES3ProfileDownloadCompletedRequest _es3ProfileDownloadCompleted_parameters = null;
        com.whty.efs.webservice.es.message.ES3ProfileDownloadCompletedResponse _es3ProfileDownloadCompleted__return = port.es3ProfileDownloadCompleted(_es3ProfileDownloadCompleted_parameters);
        System.out.println("es3ProfileDownloadCompleted.result=" + _es3ProfileDownloadCompleted__return);


        }
        {
        System.out.println("Invoking es3UpdateConnectivityParameters...");
        com.whty.efs.webservice.es.message.ES3UpdateConnectivityParametersRequest _es3UpdateConnectivityParameters_parameters = null;
        com.whty.efs.webservice.es.message.ES3UpdateConnectivityParametersResponse _es3UpdateConnectivityParameters__return = port.es3UpdateConnectivityParameters(_es3UpdateConnectivityParameters_parameters);
        System.out.println("es3UpdateConnectivityParameters.result=" + _es3UpdateConnectivityParameters__return);


        }
        {
        System.out.println("Invoking es3AuditEIS...");
        com.whty.efs.webservice.es.message.ES3AuditEISRequest _es3AuditEIS_parameters = null;
        com.whty.efs.webservice.es.message.ES3AuditEISResponse _es3AuditEIS__return = port.es3AuditEIS(_es3AuditEIS_parameters);
        System.out.println("es3AuditEIS.result=" + _es3AuditEIS__return);


        }
        {
        System.out.println("Invoking es3SendData...");
        com.whty.efs.webservice.es.message.ES3SendDataRequest _es3SendData_parameters = null;
        com.whty.efs.webservice.es.message.ES3SendDataResponse _es3SendData__return = port.es3SendData(_es3SendData_parameters);
        System.out.println("es3SendData.result=" + _es3SendData__return);


        }
        {
        System.out.println("Invoking es3DisableProfile...");
        com.whty.efs.webservice.es.message.ES3DisableProfileRequest _es3DisableProfile_parameters = null;
        com.whty.efs.webservice.es.message.ES3DisableProfileResponse _es3DisableProfile__return = port.es3DisableProfile(_es3DisableProfile_parameters);
        System.out.println("es3DisableProfile.result=" + _es3DisableProfile__return);


        }
        {
        System.out.println("Invoking es3EnableProfile...");
        com.whty.efs.webservice.es.message.ES3EnableProfileRequest _es3EnableProfile_parameters = null;
        com.whty.efs.webservice.es.message.ES3EnableProfileResponse _es3EnableProfile__return = port.es3EnableProfile(_es3EnableProfile_parameters);
        System.out.println("es3EnableProfile.result=" + _es3EnableProfile__return);


        }

        System.exit(0);
    }

}
