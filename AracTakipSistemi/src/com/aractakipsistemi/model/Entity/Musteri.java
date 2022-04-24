package com.aractakipsistemi.model.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Musteri {
	
		private String ad;
		private String adres;
		private String kullaniciKod;//sisteme girebilmesi icin kullaniciAdi
		private String sifre;//sisteme giris icin sifresi
		
		//Musteri ile Arac arasindaki 1-N iliskiyi tanimladik
		//Bir musterinin birden cok araci olabilir
		private List<Arac> araclar;
		
		//daha okunakli ,daha kolay,daha az hataya acik olsun diye Constructor ekledik
		//sifre ve adres alanlarina varsayilan bir deger atadik
		//Araclar listesini de bos bir liste haline getirdik
		public Musteri(String ad,String kullaniciKod) {
			super();
			this.ad = ad;
			this.kullaniciKod = kullaniciKod;
			this.setSifre("<belirlenmemis>");
			this.setAdres("<belirlenmemis>");
			this.setAraclar(new ArrayList<Arac>());
		}
		public String getAd() {
			return ad;
		}
		public void setAd(String ad) {
			this.ad = ad;
		}
		public String getAdres() {
			return adres;
		}
		public void setAdres(String adres) {
			this.adres = adres;
		}
		public String getKullaniciKod() {
			return kullaniciKod;
		}
		public void setKullaniciKod(String kullaniciKod) {
			this.kullaniciKod = kullaniciKod;
		}
		public String getSifre() {
			return sifre;
		}
		public void setSifre(String sifre) {
			this.sifre = sifre;
		}

		public List<Arac> getAraclar() {
			return araclar;
		}
		public void setAraclar(List<Arac> araclar) {
			this.araclar = araclar;
		}
		
		//arac ekleme yaptik List'e
		public void addArac(Arac arac) {
			this.getAraclar().add(arac);
		}
		
		//arac silme yaptik List'e
		public void removeArac(Arac arac) {
			this.getAraclar().add(arac);
		}
		//diger siniflarla iliski kurmaya hazir hale getiriyoruz
		@Override
		public int hashCode() {
			return Objects.hash(ad, adres, kullaniciKod);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Musteri other = (Musteri) obj;
			return Objects.equals(ad, other.ad) && Objects.equals(adres, other.adres)
					&& Objects.equals(kullaniciKod, other.kullaniciKod);
		}
		@Override
		public String toString() {
			return "Musteri [ad=" + ad + ", adres=" + adres + ", kullaniciKod=" + kullaniciKod + "]";
		}
	
		
		
}
