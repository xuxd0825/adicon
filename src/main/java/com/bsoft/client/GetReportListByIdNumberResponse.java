
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
 *         &lt;element name="GetReportListByIdNumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getReportListByIdNumberResult"
})
@XmlRootElement(name = "GetReportListByIdNumberResponse")
public class GetReportListByIdNumberResponse {

    @XmlElement(name = "GetReportListByIdNumberResult")
    protected String getReportListByIdNumberResult;

    /**
     * 获取getReportListByIdNumberResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetReportListByIdNumberResult() {
        return getReportListByIdNumberResult;
    }

    /**
     * 设置getReportListByIdNumberResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetReportListByIdNumberResult(String value) {
        this.getReportListByIdNumberResult = value;
    }

}
