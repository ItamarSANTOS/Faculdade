package br.com.itamar.descricaocartao.modelo.item;

import javax.xml.bind.annotation.XmlEnumValue;

public enum TipoItem {

	@XmlEnumValue("Cartao")
	Cartao("Cartao"), 
	@XmlEnumValue("Bandeira")
	Bandeira("Bandeira"),
	@XmlEnumValue("Cor")
	Cor("Cor");
	
	private String nome;

	TipoItem(String nome) { 
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static boolean existe(String valor) {
		try{
			//joga IllegalArgumentException caso nao exista
			TipoItem.valueOf(valor.toUpperCase());
		}catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}
