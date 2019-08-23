package edu.up.bsi.cardapio.soap.server;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class FuncoesWS {

	@Resource
	WebServiceContext wsctx;
	private CardapioFake dao = new CardapioFake();
	private DadoFake dao2 = new DadoFake();
	private DateTime dao3 = new DateTime();

	@WebMethod(operationName = "login_usuario")
	@WebResult(name = "login_usuario_resultado")
	public boolean getMessageLogin() {

		Boolean verificado = false;
		MessageContext mctx = wsctx.getMessageContext();

		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<String> userList = (List<String>) http_headers.get("Username");
		List<String> passList = (List<String>) http_headers.get("Password");

		String username = "";
		String password = "";

		if (userList != null) {
			username = userList.get(0);

		}

		if (passList != null) {
			password = passList.get(0);

		}

		if (username.equals("admin") && password.equals("admin123")) {
			verificado = true;
			return verificado;
		} else if (username.equals("airton") && password.equals("1234")) {
			verificado = true;
			return verificado;
		} else if (username.equals("root") && password.equals("toor")) {
			verificado = true;
			return verificado;
		} else {

			return verificado;
		}

	}

	@WebMethod(operationName = "um_alimento")
	@WebResult(name = "um_alimento_resultado")

	public String getOne(int codigoLanche) {

		ArrayList<AlimentoCardapio> cardapio = new ArrayList<AlimentoCardapio>();
		cardapio = dao.getAllAlimentos();
		String alimentoSelecionado = "Alimento não encontrado!";

		for (AlimentoCardapio alimentoCardapio : cardapio) {

			if (cardapio.indexOf(alimentoCardapio) == codigoLanche) {

				alimentoSelecionado = "Código: " + codigoLanche + " | Lanche: " + alimentoCardapio.getDescricao()
						+ " | Preço: R$" + alimentoCardapio.getpreco();
			}
		}

		return alimentoSelecionado;

	}

	@WebMethod(operationName = "todos_alimentos")
	@WebResult(name = "todos_alimentos_resultado")

	public ArrayList<AlimentoCardapio> getAll() {

		ArrayList<AlimentoCardapio> cardapio = new ArrayList<AlimentoCardapio>();
		cardapio = dao.getAllAlimentos();
		return cardapio;

	}

	@WebMethod(operationName = "dados_empresa")
	@WebResult(name = "dados_empresa_resultado")

	public ArrayList<DadosEmpresa> getDados() {

		ArrayList<DadosEmpresa> dados = new ArrayList<DadosEmpresa>();
		dados = dao2.getDados();
		return dados;

	}
	
	@WebMethod(operationName = "hora_atual")
	@WebResult(name = "hora_atual_resultado")

	public Date dataAtual() {

		DateTime data = new DateTime();
		data.getDataAtual();
		dados = dao2.getDados();
		return data;

	}
}
