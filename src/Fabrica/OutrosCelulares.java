package Fabrica;

public class OutrosCelulares  extends CelularAbstract {

	@Override
	//Estou implementando atributos de uma outra clase 
	Celular getCelular(String tipoSistema) {
		//equalsIngnoreCase está ignorando maiusla e miniscula
		if(tipoSistema.equalsIgnoreCase("Iphone")) {
			return new Iphone();	
		}else if(tipoSistema.equalsIgnoreCase("Microsoft")) {
			return new Microsoft();	
		}
		return null;
	}
	

}
