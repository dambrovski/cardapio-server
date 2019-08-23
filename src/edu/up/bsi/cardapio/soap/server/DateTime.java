package edu.up.bsi.cardapio.soap.server;

public class DateTime {

	private String texto = "";
	private DateTime dataAtual;

	public DateTime() {

	}

	public DateTime(DateTime dataAtual, String texto) {
		setDataAtual(dataAtual);
		setTexto(texto);

	}

	public DateTime getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(DateTime dataAtual) {
		this.dataAtual = dataAtual;
	}

	@Override
	public String toString() {
		return "Data Atual =" + dataAtual + ".";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
