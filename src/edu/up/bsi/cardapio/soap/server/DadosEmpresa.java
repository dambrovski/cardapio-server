package edu.up.bsi.cardapio.soap.server;

public class DadosEmpresa {

	private String fantasia;
	private String razaoSocial;
	private String cnpj;
	private String telefone;

	public DadosEmpresa() {

	}

	public DadosEmpresa(String fantasia, String razaoSocial, String cnpj, String telefone) {
		setFantasia(fantasia);
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
		setTelefone(telefone);
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "FANTASIA =" + fantasia + " e CNPJ=" + cnpj + razaoSocial + telefone + ".";
	}

}
