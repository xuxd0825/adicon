
package com.bsoft.client;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetByteReportByYYtmResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByteReportByYYtmResult"
})
@XmlRootElement(name = "GetByteReportByYYtmResponse")
public class GetByteReportByYYtmResponse {

    @XmlElement(name = "GetByteReportByYYtmResult")
    protected byte[] getByteReportByYYtmResult;

    /**
     * 获取getByteReportByYYtmResult属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetByteReportByYYtmResult() {
        return getByteReportByYYtmResult;
    }

    /**
     * 设置getByteReportByYYtmResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetByteReportByYYtmResult(byte[] value) {
        this.getByteReportByYYtmResult = value;
    }

}
