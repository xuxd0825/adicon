
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
 *         &lt;element name="GetTsscPicByAdiconBarcodeResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "getTsscPicByAdiconBarcodeResult"
})
@XmlRootElement(name = "GetTsscPicByAdiconBarcodeResponse")
public class GetTsscPicByAdiconBarcodeResponse {

    @XmlElement(name = "GetTsscPicByAdiconBarcodeResult")
    protected byte[] getTsscPicByAdiconBarcodeResult;

    /**
     * 获取getTsscPicByAdiconBarcodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetTsscPicByAdiconBarcodeResult() {
        return getTsscPicByAdiconBarcodeResult;
    }

    /**
     * 设置getTsscPicByAdiconBarcodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetTsscPicByAdiconBarcodeResult(byte[] value) {
        this.getTsscPicByAdiconBarcodeResult = value;
    }

}
