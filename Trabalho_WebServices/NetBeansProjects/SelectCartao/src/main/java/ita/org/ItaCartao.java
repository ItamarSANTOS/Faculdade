/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ita.org;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author itamar.oliveira
 */
@WebService(serviceName = "ItaCartao")
public class ItaCartao {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cartao")
    public String cartao(@WebParam(name = "n") int n, @WebParam(name = "nome") String nome) {
        //TODO write your implementation code here:
        return nome;
    }
}
