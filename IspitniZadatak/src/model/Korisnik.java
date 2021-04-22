package model;

import java.util.ArrayList;
import java.util.List;

public class Korisnik {

	private int ukupniPoeniPre = 20;
	private List<Kartica> kartice = new ArrayList<Kartica>();
	
	public Korisnik() {
		
	}
	
	public int getUkupniPoeniPre() {
		return ukupniPoeniPre;
	}
	public void setUkupniPoeniPre(int ukupniPoeniPre) {
		this.ukupniPoeniPre = ukupniPoeniPre;
	}
	public List<Kartica> getKartice() {
		return kartice;
	}
	public void setKartice(List<Kartica> kartice) {
		this.kartice = kartice;
	}
	
	
	
	
}
