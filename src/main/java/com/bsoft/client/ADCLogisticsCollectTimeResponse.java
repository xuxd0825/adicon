
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
 *         &lt;element name="ADCLogisticsCollectTimeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "adcLogisticsCollectTimeResult"
})
@XmlRootElement(name = "ADCLogisticsCollectTimeResponse")
public class ADCLogisticsCollectTimeResponse {

    @XmlElement(name = "ADCLogisticsCollectTimeResult")
    protected String adcLogisticsCollectTimeResult;

    /**
     * 获取adcLogisticsCollectTimeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADCLogisticsCollectTimeResult() {
        return adcLogisticsCollectTimeResult;
    }

    /**
     * 设置adcLogisticsCollectTimeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADCLogisticsCollectTimeResult(String value) {
        this.adcLogisticsCollectTimeResult = value;
    }

}
