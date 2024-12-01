
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
 *         &lt;element name="Typeflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Outhosiptal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarcodeOrXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "typeflag",
    "outhosiptal",
    "barcodeOrXml"
})
@XmlRootElement(name = "GetOrUploadSampleDetail")
public class GetOrUploadSampleDetail {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Typeflag")
    protected String typeflag;
    @XmlElement(name = "Outhosiptal")
    protected String outhosiptal;
    @XmlElement(name = "BarcodeOrXml")
    protected String barcodeOrXml;

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
     * 获取typeflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeflag() {
        return typeflag;
    }

    /**
     * 设置typeflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeflag(String value) {
        this.typeflag = value;
    }

    /**
     * 获取outhosiptal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuthosiptal() {
        return outhosiptal;
    }

    /**
     * 设置outhosiptal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuthosiptal(String value) {
        this.outhosiptal = value;
    }

    /**
     * 获取barcodeOrXml属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeOrXml() {
        return barcodeOrXml;
    }

    /**
     * 设置barcodeOrXml属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeOrXml(String value) {
        this.barcodeOrXml = value;
    }

}
