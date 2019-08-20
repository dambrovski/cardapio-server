package edu.up.bsi.cardapio.soap.server;

import javax.xml.ws.Endpoint;



public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9080/alimentoCardapio", new FuncoesWS());
	
		System.out.println("Servidor aguardando conexões.");
	}

}

