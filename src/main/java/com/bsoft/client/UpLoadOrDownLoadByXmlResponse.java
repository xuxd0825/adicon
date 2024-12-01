
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
 *         &lt;element name="UpLoadOrDownLoadByXmlResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "upLoadOrDownLoadByXmlResult"
})
@XmlRootElement(name = "UpLoadOrDownLoadByXmlResponse")
public class UpLoadOrDownLoadByXmlResponse {

    @XmlElement(name = "UpLoadOrDownLoadByXmlResult")
    protected String upLoadOrDownLoadByXmlResult;

    /**
     * 获取upLoadOrDownLoadByXmlResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpLoadOrDownLoadByXmlResult() {
        return upLoadOrDownLoadByXmlResult;
    }

    /**
     * 设置upLoadOrDownLoadByXmlResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpLoadOrDownLoadByXmlResult(String value) {
        this.upLoadOrDownLoadByXmlResult = value;
    }

}
