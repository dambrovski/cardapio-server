package edu.up.bsi.cardapio.soap.server;

import java.util.List;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


	@XmlRootElement // represena o elemento principal, ou a tag principal, do XML
	@XmlAccessorType(XmlAccessType.FIELD) // define onde as anotações JAXB devem ser interpretadas, nos métodos ou
											// atributos.
	public class ListarEmpresa {

		@XmlElement(name = "empresas") // Representa uma tag dentro do XML
		private List<DadosEmpresa> empresas;

		public ListarEmpresa() {
		}

		public ListarEmpresa(List<DadosEmpresa> empresa) {
			setEmpresas(empresas);
		}


		public List<DadosEmpresa> getEmpresas() {
			return empresas;
		}

		public void setEmpresas(List<DadosEmpresa> empresa) {
			this.empresas = empresas;
		}
	}


