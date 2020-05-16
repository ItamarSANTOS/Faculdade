package br.com.itamar.descricaocartao.modelo.item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ItemDao {

	private static Map<String, Item> ITENS = new LinkedHashMap<>();

	public ItemDao() {
		popularItensNoMapa();
	}
	
	public void cadastrar(Item item) {
		ITENS.put(item.getCodigo(), item);
	}

	public ArrayList<Item> todosItens(List<Filtro> filtros) {
		
		ArrayList<Item> resultados = new ArrayList<Item>();
		Collection<Item> todosItens = ITENS.values();

		if (filtros == null || filtros.isEmpty()) {
			resultados.addAll(todosItens);
			return resultados;
		}
		
		for(Filtro filtro : filtros) {
			for (Item item : todosItens) {
				
				String tipo = filtro.getTipo().getNome();
				String nome = filtro.getNome();
				
				if(itemPossuiTipo(item, tipo) && itemPossuiNome(item, nome)){
					resultados.add(item);
				}
			}
		}
		
		return resultados;
	}

	//este método existe apenas para facilitar o primeiro exercicio que não usa o filtro
	public ArrayList<Item> todosItens() {
		return new ArrayList<>(ITENS.values());
	}
	
	private boolean itemPossuiNome(Item item, String nome) {
		return item.getNome().contains(nome);
	}

	private boolean itemPossuiTipo(Item item, String tipo) {
		return item.getTipo().equals(tipo);
	}
	
	public Item quantidadeDo(String codigo) {
		return ITENS.get(codigo);
	}
	

	
	private void popularItensNoMapa() {
		ITENS.put("1", new Item.Builder().comCodigo("1").comNome("MasterCard").comTipo("Itaucard").comQuantidade(5).build());
		ITENS.put("2", new Item.Builder().comCodigo("2").comNome("Visa").comTipo("Bradesco").comQuantidade(4).build());
		ITENS.put("3", new Item.Builder().comCodigo("3").comNome("Alelo").comTipo("Caixa").comQuantidade(8).build());
		ITENS.put("4", new Item.Builder().comCodigo("4").comNome("Visa Nascional").comTipo("Cart�o Carrefour").comQuantidade(3).build());
		ITENS.put("5", new Item.Builder().comCodigo("5").comNome("MasterCard").comTipo("Santander").comQuantidade(7).build());
		ITENS.put("6", new Item.Builder().comCodigo("6").comNome("Visa").comTipo("BrasilCard").comQuantidade(3).build());
		ITENS.put("7", new Item.Builder().comCodigo("7").comNome("Master").comTipo("BMG").comQuantidade(10).build());
		ITENS.put("8", new Item.Builder().comCodigo("8").comNome("Visa Nascional").comTipo("Santander Nacional").comQuantidade(6).build());
		ITENS.put("9", new Item.Builder().comCodigo("9").comNome("Visa").comTipo("Celular").comQuantidade(8).build());
		ITENS.put("10", new Item.Builder().comCodigo("10").comNome("MasterCard").comTipo("Santander Internacional").comQuantidade(2).build());
	}



}
