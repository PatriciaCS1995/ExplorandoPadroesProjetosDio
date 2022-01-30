package Explorando_Padroes_Projetos;

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
	public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder(){
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
		
}
