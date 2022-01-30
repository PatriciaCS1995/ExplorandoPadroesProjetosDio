package Explorando_Padroes_Projetos_Strategy;

public class TestRobo {

	public static void main(String[] args) {
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		System.out.println("----------------------");
		robo.setComportamento(defensivo);
		robo.mover();
		
		System.out.println("----------------------");
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
	}

}
