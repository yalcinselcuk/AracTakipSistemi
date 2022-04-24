package com.aractakipsistemi.model.Entity;

public abstract class DenizArac extends Arac {
	
	private String liman;
	private String no;
	private double litreSaat;

	public DenizArac(String liman,String no,double litreSaat,String marka, String model) {
		super(marka, model);
		this.liman = liman;
		this.no = no;
		this.setLitreSaat(litreSaat);
	}

	public String getLiman() {
		return liman;
	}

	public void setLiman(String liman) {
		this.liman = liman;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	

	public double getLitreSaat() {
		return litreSaat;
	}

	public void setLitreSaat(double litreSaat) {
		this.litreSaat = litreSaat;
	}
	
	@Override
	public double yakitSarfiyati() {
		
		return (getSeyahatSure()*litreSaat);
	}
	
	@Override
	public String toString() {
		String simpleName = this.getClass().getSimpleName();
		return simpleName+"[liman=" + liman + ", no=" + no + " , litreSaat="+litreSaat+" , marka="+getMarka()+" , model="+getModel()+"]";
	}

}
