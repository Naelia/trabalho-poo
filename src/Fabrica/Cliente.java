package Fabrica;

public class Cliente {

	public static void main(String[] args) {
		
		CelularAbstract c1 = CelularProduct.getTipoSistema("Android");
		Celular celular1 = c1.getCelular("Motorola");	
		celular1.draw();
		
		CelularAbstract c2 = CelularProduct.getTipoSistema("Outros");
		Celular celular2 = c2.getCelular("Iphone");
		celular2.draw();
	}

}
