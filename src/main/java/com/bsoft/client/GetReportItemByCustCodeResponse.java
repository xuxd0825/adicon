
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
 *         &lt;element name="GetReportItemByCustCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getReportItemByCustCodeResult"
})
@XmlRootElement(name = "GetReportItemByCustCodeResponse")
public class GetReportItemByCustCodeResponse {

    @XmlElement(name = "GetReportItemByCustCodeResult")
    protected String getReportItemByCustCodeResult;

    /**
     * 获取getReportItemByCustCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetReportItemByCustCodeResult() {
        return getReportItemByCustCodeResult;
    }

    /**
     * 设置getReportItemByCustCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetReportItemByCustCodeResult(String value) {
        this.getReportItemByCustCodeResult = value;
    }

}
