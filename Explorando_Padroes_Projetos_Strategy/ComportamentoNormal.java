package Explorando_Padroes_Projetos_Strategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}
	
}