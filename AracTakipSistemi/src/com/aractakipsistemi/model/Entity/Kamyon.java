package com.aractakipsistemi.model.Entity;

public class Kamyon extends KaraArac{

	public Kamyon(String plaka, String marka, String model,double ltKm) {
		super(plaka, marka, model,ltKm);
		// TODO Auto-generated constructor stub
	}

	public Kamyon() {
		super("","","",0);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
