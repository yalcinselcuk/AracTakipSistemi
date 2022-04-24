package com.aractakipsistemi.model.Entity;

public abstract class KaraArac extends Arac {

	private String plaka;
	private double litreKilometre;
	
	public KaraArac(String plaka,String marka, String model,double litreKilometre) {
		super(marka, model);
		this.setPlaka(plaka);
		this.setLitreKilometre(litreKilometre);
		
		// TODO Auto-generated constructor stub
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public double getLitreKilometre() {
		return litreKilometre;
	}

	public void setLitreKilometre(double litreKilometre) {
		this.litreKilometre = litreKilometre;
	}
	
	
	@Override
	public double yakitSarfiyati() {
		
		return (getSeyahatSure()*getSeyahatMesafe()*litreKilometre);
	}
	

	@Override
	public String toString() {
		String simpleName = this.getClass().getSimpleName();
		return simpleName+"[plaka=" + plaka +",marka : "+getMarka()+",model : "+getModel()+ ",litreKilometre = "+litreKilometre+"]";
	}

}
