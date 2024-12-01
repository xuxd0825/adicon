
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
 *         &lt;element name="SetSampleDownFlagByAdiconBarocdeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "setSampleDownFlagByAdiconBarocdeResult"
})
@XmlRootElement(name = "SetSampleDownFlagByAdiconBarocdeResponse")
public class SetSampleDownFlagByAdiconBarocdeResponse {

    @XmlElement(name = "SetSampleDownFlagByAdiconBarocdeResult")
    protected String setSampleDownFlagByAdiconBarocdeResult;

    /**
     * 获取setSampleDownFlagByAdiconBarocdeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetSampleDownFlagByAdiconBarocdeResult() {
        return setSampleDownFlagByAdiconBarocdeResult;
    }

    /**
     * 设置setSampleDownFlagByAdiconBarocdeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetSampleDownFlagByAdiconBarocdeResult(String value) {
        this.setSampleDownFlagByAdiconBarocdeResult = value;
    }

}
