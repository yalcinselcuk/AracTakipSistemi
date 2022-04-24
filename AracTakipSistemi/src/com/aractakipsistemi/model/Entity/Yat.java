package com.aractakipsistemi.model.Entity;

public class Yat extends DenizArac{
	
	private int kamara;
	private int yolcuSayisi;
	private int boy;
	
	public Yat(String liman,String no,double litreSaat,String marka,String model) {
		super(liman,no,litreSaat,marka,model);
	}

	public Yat() {
		super("","",0.0,"","");
	}

	public int getKamara() {
		return kamara;
	}

	public void setKamara(int kamara) {
		this.kamara = kamara;
	}

	public int getYolcuSayisi() {
		return yolcuSayisi;
	}

	public void setYolcuSayisi(int yolcuSayisi) {
		this.yolcuSayisi = yolcuSayisi;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	@Override
	public String toString() {
		return super.toString()+"[kamara=" + kamara + ", yolcuSayisi=" + yolcuSayisi + ", boy=" + boy + "]";
	}

}
