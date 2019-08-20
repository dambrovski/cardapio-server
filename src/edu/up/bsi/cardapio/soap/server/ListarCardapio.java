package edu.up.bsi.cardapio.soap.server;

import java.util.List;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


	@XmlRootElement // represena o elemento principal, ou a tag principal, do XML
	@XmlAccessorType(XmlAccessType.FIELD) // define onde as anotações JAXB devem ser interpretadas, nos métodos ou
											// atributos.
	public class ListarCardapio {

		@XmlElement(name = "alimentos") // Representa uma tag dentro do XML
		private List<AlimentoCardapio> alimentos;

		public ListarCardapio() {
		}

		public ListarCardapio(List<AlimentoCardapio> alimentos) {
			setAlimentos(alimentos);
		}

		public List<AlimentoCardapio> getAlimentos() {
			return alimentos;
		}

		public void setAlimentos(List<AlimentoCardapio> alimentos) {
			this.alimentos = alimentos;
		}
	}


