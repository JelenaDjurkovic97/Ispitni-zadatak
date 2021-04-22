package model;

import interfejs.IPoeni;

public class Kartica extends BasicCard implements IPoeni {

	private double sipanoLitara;
	private int tipKartice1;
	
	
	public double getSipanoLitara() {
		return sipanoLitara;
	}

	public void setSipanoLitara(double sipanoLitara) {
		this.sipanoLitara = sipanoLitara;
	}

	public int getTipKartice1() {
		return tipKartice1;
	}

	public void setTipKartice1(int tipKartice1) {
		this.tipKartice1 = tipKartice1;
	}

	public Kartica() {
		
	}
	public Kartica(double sipanoLitara, int tipKartice1, int tipKartice2) {
		super();
		this.sipanoLitara = sipanoLitara;
		this.tipKartice1 = tipKartice1;
	}

	
	@Override
	public void ispisiKarticu(int id, String pan) {
		System.out.println("Id je: " + id);
		System.out.println("Pan je: " + pan);

	}


	@Override
	public int izracunajBrojPoena(Kartica kartica) {
		int brojPoena = 0;
		if(kartica.getTipKartice1() == 1) {
			brojPoena = (int)kartica.getSipanoLitara()*2;
		}else if(kartica.getTipKartice1() == 2) {
			brojPoena = (int)kartica.getSipanoLitara()*3;
		}else{
			System.out.println("Ne postoji tip kartice");
		}
		
		return brojPoena;
	}

}
