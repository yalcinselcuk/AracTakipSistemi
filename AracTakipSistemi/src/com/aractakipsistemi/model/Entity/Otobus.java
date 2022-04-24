package com.aractakipsistemi.model.Entity;

public class Otobus extends KaraArac{

	public Otobus(String plaka, String marka, String model,double ltKm) {
		super(plaka, marka, model,ltKm);
		
	}
	
	public Otobus() {
		super("","","",0);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
