import java.math.BigInteger;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.junit.Test;

import com.whty.efs.common.util.DateUtil;
import com.whty.efs.webservice.es.message.CanonicalizationMethodType;
import com.whty.efs.webservice.es.message.DSAKeyValueType;
import com.whty.efs.webservice.es.message.EISType;
import com.whty.efs.webservice.es.message.ES2HandleProfileDeletedNotification;
import com.whty.efs.webservice.es.message.ES2HandleProfileDisabledNotification;
import com.whty.efs.webservice.es.message.ES2HandleProfileEnabledNotification;
import com.whty.efs.webservice.es.message.ES2HandleSMSRChangeNotification;
import com.whty.efs.webservice.es.message.ES2Mno;
import com.whty.efs.webservice.es.message.ES2MnoService;
import com.whty.efs.webservice.es.message.KeyInfoType;
import com.whty.efs.webservice.es.message.KeyValueType;
import com.whty.efs.webservice.es.message.PGPDataType;
import com.whty.efs.webservice.es.message.RSAKeyValueType;
import com.whty.efs.webservice.es.message.RetrievalMethodType;
import com.whty.efs.webservice.es.message.SDRoleType;
import com.whty.efs.webservice.es.message.SPKIDataType;
import com.whty.efs.webservice.es.message.SecurityDomainType;
import com.whty.efs.webservice.es.message.SignatureMethodType;
import com.whty.efs.webservice.es.message.SignatureType;
import com.whty.efs.webservice.es.message.SignedInfoType;
import com.whty.efs.webservice.es.message.TransformsType;
import com.whty.efs.webservice.es.message.X509DataType;
import com.whty.efs.webservice.es.message.X509IssuerSerialType;
import com.whty.efs.webservice.es.message.EISType.AdditionalProperties;
import com.whty.efs.webservice.es.message.EISType.AuditTrail;
import com.whty.efs.webservice.es.message.EISType.EumSignedInfo;
import com.whty.efs.webservice.es.message.EISType.EumSignedInfo.EuiccCapabilities;

public class MnoES2Test {
	private static final QName SERVICE_NAME = new QName("http://namespaces.gsma.org/esim-messaging/3", "ES2MnoService");
	private static final String _url = "http://localhost:8080/euicc-webservice-mock/webservice/ES2MnoService?wsdl";

	/*public static void main(String args[]) throws java.lang.Exception {
		URL wsdlURL = wsdlURL = new URL(_url);
		ES2MnoService ss = new ES2MnoService(wsdlURL, SERVICE_NAME);
		ES2Mno port = ss.getMnoES2Port();

		System.out.println("Invoking es2HandleProfileDisabledNotification...");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar processTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		ES2HandleProfileDisabledNotification _parameters = new ES2HandleProfileDisabledNotification();
		_parameters.setEid("123456".getBytes());
		_parameters.setIccid("11");
		_parameters.setCompletionTimestamp(processTime);
		port.es2HandleProfileDisabledNotification(_parameters);

	}*/
	
	@Test
	public void es2HandleSMSRChangeNotificationTest()throws java.lang.Exception {
		URL wsdlURL = new URL(_url);
		ES2MnoService ss = new ES2MnoService(wsdlURL, SERVICE_NAME);
		ES2Mno port = ss.getMnoES2Port();
		XMLGregorianCalendar call = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());

		System.out.println("Invoking es2HandleSMSRChangeNotificationTest...");
		ES2HandleSMSRChangeNotification _parameters = new ES2HandleSMSRChangeNotification();
		_parameters.setEis(setEIS());
		_parameters.setCompletionTimestamp(call);
		port.es2HandleSMSRChangeNotification(_parameters);
	}
	 
	private EISType setEIS() {
		EISType eis = new EISType();
	    EumSignedInfo eumSignedInfo = new EumSignedInfo();
	    
	    byte[] eid = "89001012012341234012345678901224".getBytes();
		eumSignedInfo.setEid(eid);
		eumSignedInfo.setEumId("1");
		eumSignedInfo.setProductionDate(DateUtil.dateToXmlDate(new Date()));
		eumSignedInfo.setPlatformType("2");
		eumSignedInfo.setPlatformVersion("1");
		eumSignedInfo.setIsdPLoadfileAid("1241545".getBytes());
		eumSignedInfo.setIsdPModuleAid("1212222".getBytes());
		
		SecurityDomainType securityDomain = new SecurityDomainType();
		securityDomain.setAid("4545455".getBytes());
		securityDomain.setSin("12345".getBytes());
		securityDomain.setSdin("585858".getBytes());
		securityDomain.setRole(SDRoleType.ECASD);
		
		eumSignedInfo.setEcasd(securityDomain);
		EuiccCapabilities capabilites = new EuiccCapabilities();
		capabilites.setCattpSupport(true);
		capabilites.setCattpVersion("01");
		capabilites.setHttpSupport(true);
		capabilites.setHttpVersion("1");
		capabilites.setRemoteProvisioningVersion("111");
		capabilites.setSecurePacketVersion("1");
		eumSignedInfo.setEuiccCapabilities(capabilites);
		eis.setEumSignedInfo(eumSignedInfo);
		
		SignatureType eumSignedNature = new SignatureType();
		
		SignedInfoType signedInfo = new SignedInfoType();
		
		CanonicalizationMethodType methodType = new CanonicalizationMethodType();
		methodType.setAlgorithm("1");
		signedInfo.setCanonicalizationMethod(methodType);
		
		SignatureMethodType signedNatureMethod = new SignatureMethodType();
		signedNatureMethod.setAlgorithm("1");
		signedNatureMethod.sethMACOutputLength("12");
		signedInfo.setSignatureMethod(signedNatureMethod);
		
		signedInfo.setId("123");
		
		eumSignedNature.setSignedInfo(signedInfo);
		eumSignedNature.setId("1245");
		KeyInfoType keyInfo = new KeyInfoType();
		keyInfo.setKeyName("1");
		KeyValueType keyValue = new KeyValueType();
		DSAKeyValueType dSAKeyValue = new DSAKeyValueType();
		dSAKeyValue.setP("795554625441".getBytes());
		dSAKeyValue.setQ("4674987121312".getBytes());
		dSAKeyValue.setG("562679773423".getBytes());
		dSAKeyValue.setY("774454842212".getBytes());
		dSAKeyValue.setJ("825268565415".getBytes());
		dSAKeyValue.setSeed("20123357858512".getBytes());
		dSAKeyValue.setPgenCounter("8945451212556".getBytes());
		keyValue.setdSAKeyValue(dSAKeyValue);
		
		RSAKeyValueType rSAKeyValue = new RSAKeyValueType();
		rSAKeyValue.setModulus("259784154845".getBytes());
		rSAKeyValue.setExponent("1654521244498".getBytes());
		keyValue.setrSAKeyValue(rSAKeyValue);
		
		keyInfo.setKeyValue(keyValue);
		RetrievalMethodType retrevalMethod = new RetrievalMethodType();
		retrevalMethod.setType("1");
		retrevalMethod.setURI("1");
		TransformsType transformType = new TransformsType();
		retrevalMethod.setTransforms(transformType);
		
		keyInfo.setRetrevalMethod(retrevalMethod);
		
		X509DataType x509DataType = new X509DataType();
		X509IssuerSerialType x509IssuerSerial = new X509IssuerSerialType();
		x509IssuerSerial.setX509IssuerName("1");
		BigInteger bigNumber = new BigInteger("123214");
		x509IssuerSerial.setX509SerialNumber(bigNumber);
		
		x509DataType.setX509IssuerSerial(x509IssuerSerial);
		x509DataType.setX509SKI("774114557441");
		x509DataType.setX509SubjectName("78784545421578");
		x509DataType.setX509Certificate("145568975248987");
		x509DataType.setX509CRL("987654654879557");
		keyInfo.setX509DataType(x509DataType);
		PGPDataType pGPData = new PGPDataType();
		pGPData.setpGPKeyID("5454122665");
		pGPData.setpGPKeyPacket("6568778942");
		
		keyInfo.setpGPData(pGPData);
		
		SPKIDataType sPKIData = new SPKIDataType();
		sPKIData.setsPKISexp("47876467");
		
		keyInfo.setsPKIData(sPKIData);
		keyInfo.setMgmtData("7545412135686");
		eumSignedNature.setKeyInfo(keyInfo);
		eis.setEumSignature(eumSignedNature);
		
		BigInteger memorySize = new BigInteger("213");
		eis.setRemainingMemory(memorySize);
		BigInteger profileMemorySize = new BigInteger("123");
		eis.setAvailableMemoryForProfiles(profileMemorySize);
		eis.setLastAuditDate(DateUtil.dateToXmlDate(new Date()));
		eis.setSmsrId("0819");
		AdditionalProperties properites = new AdditionalProperties();
		eis.setAdditionalProperties(properites);
		AuditTrail auditTrail = new AuditTrail();
		eis.setAuditTrail(auditTrail);
//		eis.setIsdR(value);
//		eis.setLastAuditDate(value);
//		eis.setEumSignature(value);
//		eis.setRemainingMemory(value);
//		eis.setAvailableMemoryForProfiles(value);
		return eis;
	}
	
	@Test
	public void es2HandleProfileDisabledNotificationTest()throws java.lang.Exception {
		URL wsdlURL = new URL(_url);
		ES2MnoService ss = new ES2MnoService(wsdlURL, SERVICE_NAME);
		ES2Mno port = ss.getMnoES2Port();
		XMLGregorianCalendar call = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());

		System.out.println("Invoking es2HandleProfileDisabledNotification...");
		ES2HandleProfileDisabledNotification _parameters = new ES2HandleProfileDisabledNotification();
		_parameters.setEid("89001012012341234012345678901224".getBytes());
		_parameters.setIccid("00");
		_parameters.setCompletionTimestamp(call);
		port.es2HandleProfileDisabledNotification(_parameters);
	}

	@Test
	public void es2HandleProfileEnabledNotificationTest()throws java.lang.Exception {
		URL wsdlURL = new URL(_url);
		ES2MnoService ss = new ES2MnoService(wsdlURL, SERVICE_NAME);
		ES2Mno port = ss.getMnoES2Port();
		XMLGregorianCalendar call = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());

		System.out.println("Invoking es2HandleProfileEnabledNotification...");
		ES2HandleProfileEnabledNotification _parameters = new ES2HandleProfileEnabledNotification();
		_parameters.setEid("89001012012341234012345678901224".getBytes());
		_parameters.setIccid("00");
		_parameters.setCompletionTimestamp(call);
		port.es2HandleProfileEnabledNotification(_parameters);
	}

	@Test
	public void es2HandleProfileDeletedNotificationTest()throws java.lang.Exception {
		URL wsdlURL = new URL(_url);
		ES2MnoService ss = new ES2MnoService(wsdlURL, SERVICE_NAME);
		ES2Mno port = ss.getMnoES2Port();
		XMLGregorianCalendar call = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());

		System.out.println("Invoking es2HandleProfileDeletedNotification...");
		ES2HandleProfileDeletedNotification _parameters = new ES2HandleProfileDeletedNotification();
		_parameters.setEid("89001012012341234012345678901224".getBytes());
		_parameters.setIccid("00");
		_parameters.setCompletionTimestamp(call);
		port.es2HandleProfileDeletedNotification(_parameters);
	}
}
