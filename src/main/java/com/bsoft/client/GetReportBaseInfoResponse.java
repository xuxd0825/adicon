
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
 *         &lt;element name="GetReportBaseInfoResult" type="{http://www.adicon.com.cn/}ArrayOfString" minOccurs="0"/&gt;
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
    "getReportBaseInfoResult"
})
@XmlRootElement(name = "GetReportBaseInfoResponse")
public class GetReportBaseInfoResponse {

    @XmlElement(name = "GetReportBaseInfoResult")
    protected ArrayOfString getReportBaseInfoResult;

    /**
     * 获取getReportBaseInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetReportBaseInfoResult() {
        return getReportBaseInfoResult;
    }

    /**
     * 设置getReportBaseInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetReportBaseInfoResult(ArrayOfString value) {
        this.getReportBaseInfoResult = value;
    }

}
