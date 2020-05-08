package controler;

public class PcartaoWSProxy implements controler.PcartaoWS {
  private String _endpoint = null;
  private controler.PcartaoWS pcartaoWS = null;
  
  public PcartaoWSProxy() {
    _initPcartaoWSProxy();
  }
  
  public PcartaoWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initPcartaoWSProxy();
  }
  
  private void _initPcartaoWSProxy() {
    try {
      pcartaoWS = (new controler.PcartaoWSServiceLocator()).getPcartaoWS();
      if (pcartaoWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pcartaoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pcartaoWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pcartaoWS != null)
      ((javax.xml.rpc.Stub)pcartaoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public controler.PcartaoWS getPcartaoWS() {
    if (pcartaoWS == null)
      _initPcartaoWSProxy();
    return pcartaoWS;
  }
  
  public entities.Pcartao find(double saldo) throws java.rmi.RemoteException{
    if (pcartaoWS == null)
      _initPcartaoWSProxy();
    return pcartaoWS.find(saldo);
  }
  
  
}