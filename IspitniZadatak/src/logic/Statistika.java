package logic;

import java.util.List;

import model.Kartica;

public class Statistika {
     
	public static double racunajLitre(List<Kartica> kartice) {
		double sumaLitara = 0;
		
		for(Kartica k: kartice) {
			sumaLitara += k.getSipanoLitara();
		}
		return sumaLitara();
	}
	
}
