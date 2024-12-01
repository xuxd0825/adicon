
package com.bsoft.client;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * ADICON报告单对外服务接口
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AdiconWebService", targetNamespace = "http://www.adicon.com.cn/", wsdlLocation = "http://218.94.115.122:8099/ADReportWebService.asmx?swdl")
public class AdiconWebService
    extends Service
{

    private final static URL ADICONWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADICONWEBSERVICE_EXCEPTION;
    private final static QName ADICONWEBSERVICE_QNAME = new QName("http://www.adicon.com.cn/", "AdiconWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://218.94.115.122:8099/ADReportWebService.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADICONWEBSERVICE_WSDL_LOCATION = url;
        ADICONWEBSERVICE_EXCEPTION = e;
    }

    public AdiconWebService() {
        super(__getWsdlLocation(), ADICONWEBSERVICE_QNAME);
    }

    public AdiconWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADICONWEBSERVICE_QNAME, features);
    }

    public AdiconWebService(URL wsdlLocation) {
        super(wsdlLocation, ADICONWEBSERVICE_QNAME);
    }

    public AdiconWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADICONWEBSERVICE_QNAME, features);
    }

    public AdiconWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdiconWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdiconWebServiceSoap
     */
    @WebEndpoint(name = "AdiconWebServiceSoap")
    public AdiconWebServiceSoap getAdiconWebServiceSoap() {
        return super.getPort(new QName("http://www.adicon.com.cn/", "AdiconWebServiceSoap"), AdiconWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdiconWebServiceSoap
     */
    @WebEndpoint(name = "AdiconWebServiceSoap")
    public AdiconWebServiceSoap getAdiconWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.adicon.com.cn/", "AdiconWebServiceSoap"), AdiconWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADICONWEBSERVICE_EXCEPTION!= null) {
            throw ADICONWEBSERVICE_EXCEPTION;
        }
        return ADICONWEBSERVICE_WSDL_LOCATION;
    }

}
