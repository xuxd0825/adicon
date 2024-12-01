
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
 *         &lt;element name="GetSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "getSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult"
})
@XmlRootElement(name = "GetSearchBytePdfSampleByAdiconCodeAndLanguageTypeResponse")
public class GetSearchBytePdfSampleByAdiconCodeAndLanguageTypeResponse {

    @XmlElement(name = "GetSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult")
    protected byte[] getSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult;

    /**
     * 获取getSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult() {
        return getSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult;
    }

    /**
     * 设置getSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult(byte[] value) {
        this.getSearchBytePdfSampleByAdiconCodeAndLanguageTypeResult = value;
    }

}
