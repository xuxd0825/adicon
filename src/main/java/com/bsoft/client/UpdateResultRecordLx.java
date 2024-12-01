
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
 *         &lt;element name="piclx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brxx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pic1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="pic2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="pic3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="pic4" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "piclx",
    "brxx",
    "pic1",
    "pic2",
    "pic3",
    "pic4"
})
@XmlRootElement(name = "UpdateResultRecord_lx")
public class UpdateResultRecordLx {

    protected String piclx;
    protected String brxx;
    protected byte[] pic1;
    protected byte[] pic2;
    protected byte[] pic3;
    protected byte[] pic4;

    /**
     * 获取piclx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiclx() {
        return piclx;
    }

    /**
     * 设置piclx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiclx(String value) {
        this.piclx = value;
    }

    /**
     * 获取brxx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrxx() {
        return brxx;
    }

    /**
     * 设置brxx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrxx(String value) {
        this.brxx = value;
    }

    /**
     * 获取pic1属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPic1() {
        return pic1;
    }

    /**
     * 设置pic1属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPic1(byte[] value) {
        this.pic1 = value;
    }

    /**
     * 获取pic2属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPic2() {
        return pic2;
    }

    /**
     * 设置pic2属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPic2(byte[] value) {
        this.pic2 = value;
    }

    /**
     * 获取pic3属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPic3() {
        return pic3;
    }

    /**
     * 设置pic3属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPic3(byte[] value) {
        this.pic3 = value;
    }

    /**
     * 获取pic4属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPic4() {
        return pic4;
    }

    /**
     * 设置pic4属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPic4(byte[] value) {
        this.pic4 = value;
    }

}
