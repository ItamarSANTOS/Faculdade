import ws.org.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itamar.oliveira
 */
public class ClienteWSPrincipal {
    public static void main(String[] a)
    {
        WSSoma_Service servico = new  WSSoma_Service();
        
       WSSoma porta = servico.getWSSomaPort();
       
       double resposta = porta.operation(2, 5);
       
        System.out.println("resposta" + resposta);
    }
}
