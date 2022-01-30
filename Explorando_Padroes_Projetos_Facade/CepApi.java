package Explorando_Padroes_Projetos_Facade;

public class CepApi {
	
private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade (String cep) {
		return "Joinville";
	}
	
	public String recuperarEstado(String cep) {
		return "Santa Catarina";
	}

}
