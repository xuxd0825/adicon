
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
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YLJGDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KSSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JSSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SFZH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JYLSH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DownloadFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "key",
    "yljgdm",
    "kssj",
    "jssj",
    "xm",
    "sfzh",
    "jylsh",
    "downloadFlag"
})
@XmlRootElement(name = "GetLisXinGuanReportListOrResult")
public class GetLisXinGuanReportListOrResult {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "YLJGDM")
    protected String yljgdm;
    @XmlElement(name = "KSSJ")
    protected String kssj;
    @XmlElement(name = "JSSJ")
    protected String jssj;
    @XmlElement(name = "XM")
    protected String xm;
    @XmlElement(name = "SFZH")
    protected String sfzh;
    @XmlElement(name = "JYLSH")
    protected String jylsh;
    @XmlElement(name = "DownloadFlag")
    protected String downloadFlag;

    /**
     * 获取key属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置key属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * 获取yljgdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYLJGDM() {
        return yljgdm;
    }

    /**
     * 设置yljgdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYLJGDM(String value) {
        this.yljgdm = value;
    }

    /**
     * 获取kssj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKSSJ() {
        return kssj;
    }

    /**
     * 设置kssj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKSSJ(String value) {
        this.kssj = value;
    }

    /**
     * 获取jssj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJSSJ() {
        return jssj;
    }

    /**
     * 设置jssj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJSSJ(String value) {
        this.jssj = value;
    }

    /**
     * 获取xm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXM() {
        return xm;
    }

    /**
     * 设置xm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXM(String value) {
        this.xm = value;
    }

    /**
     * 获取sfzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFZH() {
        return sfzh;
    }

    /**
     * 设置sfzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFZH(String value) {
        this.sfzh = value;
    }

    /**
     * 获取jylsh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJYLSH() {
        return jylsh;
    }

    /**
     * 设置jylsh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJYLSH(String value) {
        this.jylsh = value;
    }

    /**
     * 获取downloadFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadFlag() {
        return downloadFlag;
    }

    /**
     * 设置downloadFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadFlag(String value) {
        this.downloadFlag = value;
    }

}
