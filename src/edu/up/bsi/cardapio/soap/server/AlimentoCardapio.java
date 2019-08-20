package edu.up.bsi.cardapio.soap.server;

public class AlimentoCardapio {
	
	private int preco;
	private String descricao;
	
	public AlimentoCardapio() {
		
	}
	public AlimentoCardapio(int preco, String descricao) {
		setpreco(preco);
		setDescricao(descricao);
	}
	public int getpreco() {
		return preco;
	}
	public void setpreco(int preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "preco =" + preco + " e descricao=" + descricao + ".";
	}
	
	
}
