
package com.whty.efs.webservice.es.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}BaseResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Isd-p-aid" type="{}AIDType"/&gt;
 *         &lt;element name="EuiccResponseData" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isdPAid",
    "euiccResponseData"
})
@XmlRootElement(name = "ES3-CreateISDPResponse")
public class ES3CreateISDPResponse
    extends BaseResponseType
{

    @XmlElement(name = "Isd-p-aid", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] isdPAid;
    @XmlElement(name = "EuiccResponseData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] euiccResponseData;

    /**
     * 获取isdPAid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIsdPAid() {
        return isdPAid;
    }

    /**
     * 设置isdPAid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdPAid(byte[] value) {
        this.isdPAid = value;
    }

    /**
     * 获取euiccResponseData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEuiccResponseData() {
        return euiccResponseData;
    }

    /**
     * 设置euiccResponseData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuiccResponseData(byte[] value) {
        this.euiccResponseData = value;
    }

}
