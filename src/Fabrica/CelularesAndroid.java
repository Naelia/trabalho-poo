package Fabrica;

public class CelularesAndroid extends CelularAbstract {

	@Override
	Celular getCelular(String tipoSistema) {
		if(tipoSistema.equalsIgnoreCase("motorola")) {
			return new Motorola();	
		}else if(tipoSistema.equalsIgnoreCase("Samsung")) {
			return new Samsung();	
		}
		return null;
	}

}
