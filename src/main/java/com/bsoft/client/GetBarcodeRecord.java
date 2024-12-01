
package com.bsoft.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ybid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ybid",
    "lb"
})
@XmlRootElement(name = "GetBarcodeRecord")
public class GetBarcodeRecord {

    protected String ybid;
    protected String lb;

    /**
     * 获取ybid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYbid() {
        return ybid;
    }

    /**
     * 设置ybid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYbid(String value) {
        this.ybid = value;
    }

    /**
     * 获取lb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLb() {
        return lb;
    }

    /**
     * 设置lb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLb(String value) {
        this.lb = value;
    }

}
