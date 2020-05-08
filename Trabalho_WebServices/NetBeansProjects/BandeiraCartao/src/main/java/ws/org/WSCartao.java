/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.org;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author itamar.oliveira
 */

@WebService(serviceName = "WSCartao")
public class WSCartao {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cartao")
    public String cartao(@WebParam(name = "c") String c) {
        //TODO write your implementation code here:
   
        return "Cartão:  MasterCard";
    }
}

