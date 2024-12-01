
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
 *         &lt;element name="UpdateResultRecord_lxResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "updateResultRecordLxResult"
})
@XmlRootElement(name = "UpdateResultRecord_lxResponse")
public class UpdateResultRecordLxResponse {

    @XmlElement(name = "UpdateResultRecord_lxResult")
    protected String updateResultRecordLxResult;

    /**
     * 获取updateResultRecordLxResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateResultRecordLxResult() {
        return updateResultRecordLxResult;
    }

    /**
     * 设置updateResultRecordLxResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateResultRecordLxResult(String value) {
        this.updateResultRecordLxResult = value;
    }

}
