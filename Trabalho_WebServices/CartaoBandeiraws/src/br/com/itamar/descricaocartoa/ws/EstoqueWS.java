package br.com.itamar.descricaocartoa.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.itamar.descricaocartao.modelo.item.Item;
import br.com.itamar.descricaocartao.modelo.item.ItemDao;

@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();
	
	public List<Item> getItems(){
		
		System.out.println("Bandeirado cartao getItems()");
		
		List<Item>	lista = dao.todosItens();
		
		return lista;
	}

}
