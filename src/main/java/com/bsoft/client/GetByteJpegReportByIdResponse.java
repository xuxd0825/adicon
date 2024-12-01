
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
 *         &lt;element name="GetByteJpegReportByIdResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "getByteJpegReportByIdResult"
})
@XmlRootElement(name = "GetByteJpegReportByIdResponse")
public class GetByteJpegReportByIdResponse {

    @XmlElement(name = "GetByteJpegReportByIdResult")
    protected byte[] getByteJpegReportByIdResult;

    /**
     * 获取getByteJpegReportByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetByteJpegReportByIdResult() {
        return getByteJpegReportByIdResult;
    }

    /**
     * 设置getByteJpegReportByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetByteJpegReportByIdResult(byte[] value) {
        this.getByteJpegReportByIdResult = value;
    }

}
