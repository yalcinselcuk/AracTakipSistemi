package com.aractakipsistemi.model.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Takip edilecek araclar sadece kara nakil olmayabilir
//o yuzden projemize Arac,KaraArac ve DenizArac diye 3 soyut sinif tanimliyoruz
public abstract class Arac {

	private String plaka;
	private String marka;
	private String model;
	
	//Arac-Konum ve Arac-Uyari arasindaki 1-N iliskiler tanimlandi
	private List<Konum> konumlar;
	private List<Uyari> uyarilar;
	
	public abstract double yakitSarfiyati();
	
	//Arac-Cihaz arasindaki 1-1 iliski tanimlandi
	private Cihaz cihaz;
	
	//konumlar ve uyarilar listelerine bos bir liste koyduk
	public Arac(String marka, String model) {
		super();
		this.marka = marka;
		this.model = model;
		this.setKonumlar(new ArrayList<Konum>());
		this.setUyarilar(new ArrayList<Uyari>());
	}
	
	public Cihaz getCihaz() {
		return cihaz;
	}
	public void setCihaz(Cihaz cihaz) {
		this.cihaz = cihaz;
	}
	
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(marka, model, plaka);
	}
	
	
	public List<Konum> getKonumlar() {
		return konumlar;
	}
	public void setKonumlar(List<Konum> konumlar) {
		this.konumlar = konumlar;
	}
	public List<Uyari> getUyarilar() {
		return uyarilar;
	}
	public void setUyarilar(List<Uyari> uyarilar) {
		this.uyarilar = uyarilar;
	}
	
	//konumlara add & remove islemleri yapildi
	public void addKonum(Konum konum) {
		this.getKonumlar().add(konum);
	}
	public void removeKonum(Konum konum) {
		this.getKonumlar().remove(konum);
	}
	
	//uyarilara add & remove islemleri yapildi
	public void addUyari(Uyari uyari) {
		this.getUyarilar().add(uyari);
	}
	public void removeUyari(Uyari uyari) {
		this.getUyarilar().remove(uyari);
	}
	
	public double getSeyahatSure() {
		double sure = 0;
		Konum a = null;
		
		for(Konum b : getKonumlar()) {
			if(a != null) {
				sure += b.zamanFark(a); //a ve b konumlari arasindaki sure farkini verecek 
			}
			a = b;
		}
		return sure;
	}
	
	public double getSeyahatMesafe() {
		double mesafe = 0;
		Konum a = null;
		
		for(Konum b : getKonumlar()) {
			if(a != null) {
				mesafe += b.mesafe(a);//a ve b konumlari arasindaki mesafe farkini verecek 
			}
			a = b;
		}
		return mesafe;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arac other = (Arac) obj;
		return Objects.equals(marka, other.marka) && Objects.equals(model, other.model)
				&& Objects.equals(plaka, other.plaka);
	}

	@Override
	public String toString() {
		String simpleName = this.getClass().getSimpleName();
		return simpleName+"[plaka = "+plaka+", marka = "+marka+", model = "+model+"]";
	}
	

}
