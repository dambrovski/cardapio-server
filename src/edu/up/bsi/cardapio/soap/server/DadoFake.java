package edu.up.bsi.cardapio.soap.server;

import java.util.ArrayList;
import java.util.List;

public class DadoFake {

	public ArrayList<DadosEmpresa> getDados() {

		ArrayList<String> dados = new ArrayList<String>();
		ArrayList<DadosEmpresa> lista_dados = new ArrayList<DadosEmpresa>();

		lista_dados.add(new DadosEmpresa("FKN", "FKN INFORMATICA", "09871204922", "41995168492"));
		return lista_dados;
	}
}
