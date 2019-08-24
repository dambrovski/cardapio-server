package edu.up.bsi.cardapio.soap.server;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // representa o elemento principal, ou a tag principal, do XML
@XmlAccessorType(XmlAccessType.FIELD) // define onde as anotações JAXB devem ser interpretadas, nos métodos ou
										// atributos
public class DadoFake {

	public String getDados() {

		String dados = new String();
		

		dados = "FKN INFORMATICA, CPF: 09871204922 NUMERO: 41995168492";
		return dados;
	}
}
