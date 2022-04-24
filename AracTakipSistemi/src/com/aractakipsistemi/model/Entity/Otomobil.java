package com.aractakipsistemi.model.Entity;

public class Otomobil extends KaraArac{
	
	private int yolcuKapasitesi;
	private int bagajHacmi;
	
	public Otomobil() {
		this("","","",0,0,0);//yeni yazmis oldugumuz constructor'i kullanip parametre olarak bos diziler 
						   //ve sifir degerleri gonderiyoruz
	}
	
	public Otomobil(String plaka, String marka, String model,int yolcuKapasitesi,int bagajHacmi,double ltKm) {
		super(plaka, marka, model,ltKm);
		this.bagajHacmi = bagajHacmi;
		this.yolcuKapasitesi = yolcuKapasitesi;
		
	}
	
	
	public int getYolcuKapasitesi() {
		return yolcuKapasitesi;
	}
	public void setYolcuKapasitesi(int yolcuKapasitesi) {
		this.yolcuKapasitesi = yolcuKapasitesi;
	}
	public int getBagajHacmi() {
		return bagajHacmi;
	}
	public void setBagajHacmi(int bagajHacmi) {
		this.bagajHacmi = bagajHacmi;
	}
	
	@Override
	public String toString() {
		return super.toString()+"[yolcuKapasitesi=" + yolcuKapasitesi + ", bagajHacmi=" + bagajHacmi + " lt ]";
	}


}
