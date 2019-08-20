package edu.up.bsi.cardapio.soap.server;

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

	@WebMethod(operationName = "login_usuario")
	@WebResult(name = "login_usuario_resultado")
	public String getMessageLogin() {

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
			return "Ola� " + username + " bem vindo ao login SOAP.";
		} else {
			return " Usuario invalido";
		}

	}

	private CardapioFake dao = new CardapioFake();

	@WebMethod(operationName = "todos_alimentos")
	@WebResult(name = "todos_alimentos_resultado")

	public ArrayList<AlimentoCardapio> getAll() {

		ArrayList<AlimentoCardapio> cardapio = new ArrayList<AlimentoCardapio>();
		cardapio = dao.getAllAlimentos();
		return cardapio;

	}

}