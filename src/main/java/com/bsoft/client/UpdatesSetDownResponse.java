
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
 *         &lt;element name="UpdatesSetDownResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "updatesSetDownResult"
})
@XmlRootElement(name = "UpdatesSetDownResponse")
public class UpdatesSetDownResponse {

    @XmlElement(name = "UpdatesSetDownResult")
    protected boolean updatesSetDownResult;

    /**
     * 获取updatesSetDownResult属性的值。
     * 
     */
    public boolean isUpdatesSetDownResult() {
        return updatesSetDownResult;
    }

    /**
     * 设置updatesSetDownResult属性的值。
     * 
     */
    public void setUpdatesSetDownResult(boolean value) {
        this.updatesSetDownResult = value;
    }

}
