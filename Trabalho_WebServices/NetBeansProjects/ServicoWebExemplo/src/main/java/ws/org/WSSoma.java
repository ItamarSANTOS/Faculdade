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
@WebService(serviceName = "WSSoma")
public class WSSoma {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public double operation(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        //TODO write your implementation code here:
        return x + y;
    }
}
