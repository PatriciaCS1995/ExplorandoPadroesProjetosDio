package Explorando_Padroes_Projetos_Strategy;

public class ComportamentoDefensivo implements Comportamento {
	
	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}

}
