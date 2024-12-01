
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
 *         &lt;element name="GetSearchStringSampleByAdiconCodeToByteResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "getSearchStringSampleByAdiconCodeToByteResult"
})
@XmlRootElement(name = "GetSearchStringSampleByAdiconCodeToByteResponse")
public class GetSearchStringSampleByAdiconCodeToByteResponse {

    @XmlElement(name = "GetSearchStringSampleByAdiconCodeToByteResult")
    protected byte[] getSearchStringSampleByAdiconCodeToByteResult;

    /**
     * 获取getSearchStringSampleByAdiconCodeToByteResult属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetSearchStringSampleByAdiconCodeToByteResult() {
        return getSearchStringSampleByAdiconCodeToByteResult;
    }

    /**
     * 设置getSearchStringSampleByAdiconCodeToByteResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetSearchStringSampleByAdiconCodeToByteResult(byte[] value) {
        this.getSearchStringSampleByAdiconCodeToByteResult = value;
    }

}
