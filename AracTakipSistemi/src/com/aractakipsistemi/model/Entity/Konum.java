package com.aractakipsistemi.model.Entity;

import java.util.Date;
import java.util.Objects;

public class Konum {

	private double enlem;
	private double boylam;
	private Date gunVeSaat;
	
	public Konum(double enlem, double boylam) {
		super();
		this.enlem = enlem;
		this.boylam = boylam;
		this.setGunVeSaat(new Date());
	}
	
	public double zamanFark(Konum a) {
		double hours = (gunVeSaat.getTime() - a.gunVeSaat.getTime()) / 3600000.0;
		return hours;
	}
	
	public double mesafe(Konum p) {
		//Haversine formulu ile mesafe hesabi
		//http://www.movable-type.co.uk/scripts/latlong.html
		
		final double R = 6371; // dunyanin km olarak yariCapi
		double dLat = Math.toRadians(p.enlem - enlem);
		double dLong = Math.toRadians(p.boylam - boylam);
		
		double a = Math.sin(dLat/2) * Math.sin(dLat/2)+
				Math.cos(Math.toRadians(enlem)) * Math.cos(Math.toRadians(boylam))
				*Math.sin(dLong/2)*Math.sin(dLong/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double d = R * c ;
		return d;
	}
	
	public double getEnlem() {
		return enlem;
	}
	public void setEnlem(double enlem) {
		this.enlem = enlem;
	}
	public double getBoylam() {
		return boylam;
	}
	public void setBoylam(double boylam) {
		this.boylam = boylam;
	}
	public Date getGunVeSaat() {
		return gunVeSaat;
	}
	public void setGunVeSaat(Date gunVeSaat) {
		this.gunVeSaat = gunVeSaat;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(boylam, enlem, gunVeSaat);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konum other = (Konum) obj;
		return Double.doubleToLongBits(boylam) == Double.doubleToLongBits(other.boylam)
				&& Double.doubleToLongBits(enlem) == Double.doubleToLongBits(other.enlem)
				&& Objects.equals(gunVeSaat, other.gunVeSaat);
	}
	
	@Override
	public String toString() {
		return "Konum [enlem=" + enlem + ", boylam=" + boylam + ", gunVeSaat=" + gunVeSaat + "]";
	}

}
