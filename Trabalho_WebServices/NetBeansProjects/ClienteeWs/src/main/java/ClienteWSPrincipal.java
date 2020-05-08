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
    public static void main(String[] a){
    WSCartao_Service servico = new WSCartao_Service();
    WSCartao porta = servico.getWSCartaoPort();
    String resposta = porta.cartao("1");
        System.out.println(resposta);
    }
}
