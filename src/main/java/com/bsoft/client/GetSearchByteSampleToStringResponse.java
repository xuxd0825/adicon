
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
 *         &lt;element name="GetSearchByteSampleToStringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getSearchByteSampleToStringResult"
})
@XmlRootElement(name = "GetSearchByteSampleToStringResponse")
public class GetSearchByteSampleToStringResponse {

    @XmlElement(name = "GetSearchByteSampleToStringResult")
    protected String getSearchByteSampleToStringResult;

    /**
     * 获取getSearchByteSampleToStringResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSearchByteSampleToStringResult() {
        return getSearchByteSampleToStringResult;
    }

    /**
     * 设置getSearchByteSampleToStringResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSearchByteSampleToStringResult(String value) {
        this.getSearchByteSampleToStringResult = value;
    }

}
