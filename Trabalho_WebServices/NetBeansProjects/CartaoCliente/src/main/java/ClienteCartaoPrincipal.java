

import ita.org.ItaCartao;
import ita.org.ItaCartao_Service;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
//<editor-fold defaultstate="collapsed" desc="comment">

//</editor-fold>
/**
 *
 * @author itamar.oliveira
 */


public class ClienteCartaoPrincipal {
    public static void main (Strin[] a)
    {
        ItaCartao_Service service = new ItaCartao_Service();
        ItaCartao porta = servico.getItaCartaoPort();
        int resposta = porta.nome("itamar", "teste");
        System.out.println(resposta);
    }
}
