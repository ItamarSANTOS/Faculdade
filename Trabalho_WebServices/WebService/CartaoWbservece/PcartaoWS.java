package controler;

import java.util.*;
import entities.*;
public class PcartaoWS {
	
	public Pcartao find(double saldo) 
	{
		return new Pcartao("catao 1", "MasterCard", 1000);
	}
	
	public List<Pcartao> findAll()
	{
		List<Pcartao> ListCartoes = new ArrayList<Pcartao>();
		
		ListCartoes.add( new Pcartao("catao 1", "MasterCard", 1000));
		ListCartoes.add( new Pcartao("catao 2", "Ciello", 2000));
		ListCartoes.add( new Pcartao("catao 3", "CredCard", 150.55));
		
		return ListCartoes;
	}
}