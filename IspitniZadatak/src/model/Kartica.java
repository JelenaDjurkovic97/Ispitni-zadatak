package model;

import interfejs.IPoeni;

public class Kartica extends BasicCard implements IPoeni {

	private double sipanoLitara;
	private int tipKartice1;
	private int tipKartice2;
	
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

	public int getTipKartice2() {
		return tipKartice2;
	}

	public void setTipKartice2(int tipKartice2) {
		this.tipKartice2 = tipKartice2;
	}
	
	public Kartica() {
		
	}
	public Kartica(double sipanoLitara, int tipKartice1, int tipKartice2) {
		super();
		this.sipanoLitara = sipanoLitara;
		this.tipKartice1 = tipKartice1;
		this.tipKartice2 = tipKartice2;
	}

	
	@Override
	public void ispisiKarticu(int id, String pan) {
		System.out.println("Id je: " + id);
		System.out.println("Pan je: " + pan);

	}


	@Override
	public int izracunajBrojPoena(Kartica kartica) {
		
		return 0;
	}

}
