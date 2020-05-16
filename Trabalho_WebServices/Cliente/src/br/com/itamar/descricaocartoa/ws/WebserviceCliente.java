package br.com.itamar.descricaocartoa.ws;

import java.util.List;

import javax.xml.ws.Response;
import javax.xml.ws.WebServiceClient;



import java.io.*;
import java.net.*;
import java.util.*;
	public class WebserviceCliente {
	  public static void main(String[] args) throws Exception {

	    URL url = new URL ("http://localhost:8080/estoquews?wsdl");
	    String codigo = new String("1");
       String nome = new String("MasterCared");
       String tipo = new String("cartao");
       Integer quantidade = new Integer([1]);
	    // Constroi a chamada.
       private ItemDao dao = new ItemDao();

       call.setTargetObjectURI("urn:onjavaserver");
       call.setMethodName(args[0]);
       call.setEncodingStyleURI(Constants.NS_URI_SOAP_ENC);
       Vector params = new Vector();
       params.addElement(new Parameter("p1", Integer.class, p1, null));
       params.addElement(new Parameter("p2", Integer.class, p2, null));

       call.setParams (params);
	    // faz a chamada
       Response resp = call.invoke(url,"http://localhost:8080/estoquews?wsdl");
       Parameter result = resp.getItems();
       System.out.println("codigo" + "nome" + "tipo"+ quantidade);
 
}

}
