package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement // representa o elemento principal, ou a tag principal, do XML
//@XmlAccessorType(XmlAccessType.FIELD) // define onde as anotações JAXB devem ser interpretadas, nos métodos ou
										// atributos

public class DadosEmpresa {

	private String dados;



	public DadosEmpresa(String dados) {
		setDados(dados);
	}

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	
	@Override
	public String toString() {
		return "DADOS EMPRESA =" + dados +".";
	}

}
