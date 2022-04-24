package com.aractakipsistemi.model.creationals;

public class SingletonExample {

	private static SingletonExample instance = null;// class ile ayni adda bir static member mevcut

	private SingletonExample() {//private metot cunku bir tane olusmasini istiyoruz
	}// private constructor mevcut

	public static SingletonExample getInstance() {// static member'a ulasmak icin static metot mevcut

		if (instance == null) {
			instance = new SingletonExample();
		}

		return instance;
	}
	public void helloSingleton() {
		System.out.println("veritabaniyla baglanti kuruldu");
	}	

}
