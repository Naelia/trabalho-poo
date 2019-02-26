package Fabrica;

public class CelularProduct {
	public static CelularAbstract getTipoSistema(String Sistema) {
		if(Sistema.equalsIgnoreCase("Android")) {	
			return new CelularesAndroid();	
		}else if (Sistema.equalsIgnoreCase("Outros")){
			return new OutrosCelulares();	
		}
		return null;
	}
}

	


