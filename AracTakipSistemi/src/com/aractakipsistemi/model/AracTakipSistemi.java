package com.aractakipsistemi.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aractakipsistemi.model.Entity.Arac;
import com.aractakipsistemi.model.Entity.Cihaz;
import com.aractakipsistemi.model.Entity.Konum;
import com.aractakipsistemi.model.Entity.Musteri;
import com.aractakipsistemi.model.Entity.Otobus;
import com.aractakipsistemi.model.Entity.Otomobil;
import com.aractakipsistemi.model.Entity.Uyari;
import com.aractakipsistemi.model.Entity.Yat;
import com.aractakipsistemi.model.creationals.SingletonExample;

public class AracTakipSistemi {

	public static void main(String[] args) throws ParseException {
		
		/*

		// arabalara ait motorNo ve sasiNo gonderildi
		Araba araba1 = new Araba("Honda", "Civic", "A1B2C3", "Mlty");
		Araba araba2 = new Araba("Honda", "Civic", "A1B2C3", "Mlty");

		araba2 = araba1;
		// arabalarin ayni mi degil mi oldugunu motorNo ve sasiNo ile karsilastirdik
		System.out.println(araba1 == araba2);
		System.out.println(araba1.equals(araba2));

		// araba ile ilgili ozellikleri dondurduk
		System.out.println(araba1.toString());

		// sistemden tarih alma denendi
		System.out.println("Sistem Tarihi : " + new Date());
		
		*/
//--------------------------------------------------------------------------------------------
		
		/*
		 
		// Musteri olusturduk
		Musteri musteri = new Musteri("yalcin","nick : yalcin");
		musteri.setAdres("Malatya-Battalgazi");
		

		// yeni bir arac olusturduk
		Arac arac = new Arac("34 AB 1234","Fiat Linea","2012");

		// yeni bir cihaz olusturduk
		Cihaz cihaz = new Cihaz("ABC-1234567");

		// Arac'in cihazini atadik
		arac.setCihaz(cihaz);

		// Musteriye Arac'i ekledik
		musteri.addArac(arac);

		// yeni bir konum tanimladik
		Konum maslak = new Konum(41.115831,29.021704);

		// Arac'a Konum ekledik
		arac.addKonum(maslak);

		// yeni bir konum tanimladik
		Konum besiktas = new Konum(41.069516,29.015222);

		// Arac'a Konum ekledik
		arac.addKonum(besiktas);
		
		//Uyari tanimladik
		Uyari hizliKullanim = new Uyari("Arac hiz 90 km/h limitini,146 km/h ile asti");
		
		//Arac'a Uyari ekledik
		arac.addUyari(hizliKullanim);

		
		System.out.println(musteri); 
		System.out.println();
		//System.out.println(arac);
		System.out.println();
		
		
		// creational
		SingletonExample.getInstance().helloSingleton();
		
		//deneme amacli
		System.out.println();
		
		*/
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		// Gercege Dayali Ornek
		/*
		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
		//denizden rota
		
		Konum beykoz = new Konum(41.133894, 29.091565);
		beykoz.setGunVeSaat(df.parse("23/04/2022 16:45"));
		
		Konum bogaz = new Konum(41.143243, 29.065334);
		bogaz.setGunVeSaat(df.parse("23/04/2022 16:55"));
		
		Konum sariyer = new Konum(41.166249, 29.057526);
		sariyer.setGunVeSaat(df.parse("23/04/2022 17:05"));
		
		Yat yat = new Yat("Istanbul","11255",5.5,"Pancar","2022");
		yat.addKonum(beykoz);
		yat.addKonum(bogaz);
		yat.addKonum(sariyer);
		
		System.out.println(yat);
		System.out.println("Sure (dk) : "+yat.getSeyahatSure()*60);
		System.out.println("Mesafe (km) : "+yat.getSeyahatMesafe());
		System.out.println("Yakit tuketimi (lt) : "+yat.yakitSarfiyati());
		
		System.out.println();
		*/
		
		
		/*
		  
		 java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
		//karadan rota
		
		Konum beykoz = new Konum(41.133894, 29.091565);
		beykoz.setGunVeSaat(df.parse("23/04/2022 16:45"));
		
		Konum hisar = new Konum(41.123978, 29.098808);
		hisar.setGunVeSaat(df.parse("23/04/2022 16:55"));
		
		Konum kavacik = new Konum(41.089573, 29.090911);
		kavacik.setGunVeSaat(df.parse("23/04/2022 17:05"));
		
		Konum levent = new Konum(41.099405, 29.007999);
		levent.setGunVeSaat(df.parse("23/04/2022 17:20"));
		
		Konum haciOsman = new Konum(41.151774, 29.030486);
		haciOsman.setGunVeSaat(df.parse("23/04/2022 17:40"));
		
		Konum sariyer = new Konum(41.166249, 29.057526);
		sariyer.setGunVeSaat(df.parse("23/04/2022 17:45"));
		
		Otobus otobus = new Otobus("34 AB 2233","Mercedes","City",0.19);
		otobus.addKonum(beykoz);
		otobus.addKonum(hisar);
		otobus.addKonum(kavacik);
		otobus.addKonum(levent);
		otobus.addKonum(haciOsman);
		otobus.addKonum(sariyer);
		
		System.out.println(otobus);
		System.out.println("Sure (dk) : "+otobus.getSeyahatSure()*60);
		System.out.println("Mesafe (km) : "+otobus.getSeyahatMesafe());
		System.out.println("Yakit tuketimi (lt) : "+otobus.yakitSarfiyati());
		
		 
		 */
		
		//Cengelköy-Sarıyer arasinda yolculuk oldugunu dusunelim
		//Cengelköy-Üsküdar arasi = otobus
		//Uskudar-Besiktas arasi = yat
		//Besiktas-Ortakoy arasi = otomobil
		//kullanildiginda ne kadar yakit sarfiyati yapacagimizi hesaplayacagiz
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		List<Arac> araclar = new ArrayList<Arac>();
		
		/*Cengelkoy-Uskudar arasi otobus */
		Otobus otobus = new Otobus("34 AB 2233","Mercedes","City",0.19);
		
		Konum cengelkoy = new Konum(41.050914, 29.051633);
		cengelkoy.setGunVeSaat(df.parse("24/04/2022 15:00"));
		
		Konum uskudar = new Konum(41.027851,29.015369);
		uskudar.setGunVeSaat(df.parse("24/04/2022 15:10"));
		
		otobus.addKonum(cengelkoy);
		otobus.addKonum(uskudar);
		araclar.add(otobus);
		
		
		/*Uskudar-Besiktas arasi yat */
		Yat yat = new Yat("Istanbul","11255",5.5,"Pancar","2022");
		
		Konum besiktas = new Konum(41.040892, 29.007422);
		besiktas.setGunVeSaat(df.parse("24/04/2022 15:20"));
		
		yat.addKonum(uskudar);
		yat.addKonum(besiktas);
		araclar.add(yat);
		
		
		/*Besiktas-Ortakoy arasi otomobil */
		Otomobil otomobil = new Otomobil("34 ABC 18","HONDA","CIVIC",4,20,1.1);
		
		Konum ortakoy = new Konum(41.047285, 29.025615);
		ortakoy.setGunVeSaat(df.parse("24/04/2022 15:30"));
		
		otomobil.addKonum(besiktas);
		otomobil.addKonum(ortakoy);
		araclar.add(otomobil);
		
		//toplam yakit sarfiyati
		double yakit = 0;
		for(Arac arac : araclar) {
			yakit = yakit + arac.yakitSarfiyati();
		}
		
		System.out.println("otobus : "+otobus.toString());
		System.out.println("otobus (dk) : "+otobus.getSeyahatSure()*60);
		System.out.println("otobus mesafe (km) : "+otobus.getSeyahatMesafe());
		System.out.println("otobus yakit (lt) : "+otobus.yakitSarfiyati());
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		System.out.println("yat : "+yat.toString());
		System.out.println("yat (dk) : "+yat.getSeyahatSure()*60);
		System.out.println("yat mesafe (km) : "+yat.getSeyahatMesafe());
		System.out.println("yat yakit (lt) : "+yat.yakitSarfiyati());
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		System.out.println("otomobil : "+otomobil.toString());
		System.out.println("otomobil (dk) : "+otomobil.getSeyahatSure()*60);
		System.out.println("otomobil mesafe (km) : "+otomobil.getSeyahatMesafe());
		System.out.println("otomobil yakit (lt) : "+otomobil.yakitSarfiyati());
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		System.out.println("Toplam yakit sarfiyati (lt) : "+yakit);
		
	}

}
