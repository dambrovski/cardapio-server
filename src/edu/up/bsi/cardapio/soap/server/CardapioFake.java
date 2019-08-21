package edu.up.bsi.cardapio.soap.server;

import java.util.ArrayList;
import java.util.List;

public class CardapioFake {

	public ArrayList<AlimentoCardapio> getAllAlimentos() {
		
		ArrayList<String> cardapio = new ArrayList<String>();
		
		ArrayList<AlimentoCardapio> lista_alimentos = new  ArrayList<AlimentoCardapio>();
		
		lista_alimentos.add(new AlimentoCardapio(10, "X-BLZ"));
		lista_alimentos.add(new AlimentoCardapio(15, "X-ALL"));
		lista_alimentos.add(new AlimentoCardapio(12, "X-MEN"));
		lista_alimentos.add(new AlimentoCardapio(5, "X-PÃO"));
		lista_alimentos.add(new AlimentoCardapio(30, "X-LAG"));

		return lista_alimentos;
				
	}
}
