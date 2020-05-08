/**
 * PcartaoWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controler;

public class PcartaoWSServiceLocator extends org.apache.axis.client.Service implements controler.PcartaoWSService {

    public PcartaoWSServiceLocator() {
    }


    public PcartaoWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PcartaoWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PcartaoWS
    private java.lang.String PcartaoWS_address = "http://tempuri.org/CartaoWbservece/services/PcartaoWS";

    public java.lang.String getPcartaoWSAddress() {
        return PcartaoWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PcartaoWSWSDDServiceName = "PcartaoWS";

    public java.lang.String getPcartaoWSWSDDServiceName() {
        return PcartaoWSWSDDServiceName;
    }

    public void setPcartaoWSWSDDServiceName(java.lang.String name) {
        PcartaoWSWSDDServiceName = name;
    }

    public controler.PcartaoWS getPcartaoWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PcartaoWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPcartaoWS(endpoint);
    }

    public controler.PcartaoWS getPcartaoWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            controler.PcartaoWSSoapBindingStub _stub = new controler.PcartaoWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getPcartaoWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPcartaoWSEndpointAddress(java.lang.String address) {
        PcartaoWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (controler.PcartaoWS.class.isAssignableFrom(serviceEndpointInterface)) {
                controler.PcartaoWSSoapBindingStub _stub = new controler.PcartaoWSSoapBindingStub(new java.net.URL(PcartaoWS_address), this);
                _stub.setPortName(getPcartaoWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PcartaoWS".equals(inputPortName)) {
            return getPcartaoWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controler", "PcartaoWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controler", "PcartaoWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PcartaoWS".equals(portName)) {
            setPcartaoWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
