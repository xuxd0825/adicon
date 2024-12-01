
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
 *         &lt;element name="GetLisXinGuanReportListOrResultResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getLisXinGuanReportListOrResultResult"
})
@XmlRootElement(name = "GetLisXinGuanReportListOrResultResponse")
public class GetLisXinGuanReportListOrResultResponse {

    @XmlElement(name = "GetLisXinGuanReportListOrResultResult")
    protected String getLisXinGuanReportListOrResultResult;

    /**
     * 获取getLisXinGuanReportListOrResultResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetLisXinGuanReportListOrResultResult() {
        return getLisXinGuanReportListOrResultResult;
    }

    /**
     * 设置getLisXinGuanReportListOrResultResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetLisXinGuanReportListOrResultResult(String value) {
        this.getLisXinGuanReportListOrResultResult = value;
    }

}
