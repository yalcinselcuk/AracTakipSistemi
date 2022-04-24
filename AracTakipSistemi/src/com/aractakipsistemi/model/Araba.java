package com.aractakipsistemi.model;

import java.util.Objects;

public class Araba {

	private String marka;
	private String model;
	private String renk;
	private String motorGucu;
	private String motorNo;
	private String sasiNo;
	//private AracSahibi aracSahibi;

	
	
	
	public Araba(String marka, String model, String renk, String motorGucu,String motorNo,String sasiNo) {
		super();
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.motorGucu = motorGucu;
		//this.aracSahibi = aracSahibi;
	}
	
	

	public Araba(String marka, String model, String motorNo, String sasiNo) {
		super();
		this.marka = marka;
		this.model = model;
		this.motorNo = motorNo;
		this.sasiNo = sasiNo;
	}



	public void motoruCalistir() {

	}

	public void motoruDurdur() {

	}

	public void ileriGit() {

	}

	public void geriGit() {

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

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getMotorGucu() {
		return motorGucu;
	}

	public void setMotorGucu(String motorGucu) {
		this.motorGucu = motorGucu;
	}
	
	/*
	public AracSahibi getAracSahibi() {
		return aracSahibi;
	}

	public void setAracSahibi(AracSahibi aracSahibi) {
		this.aracSahibi = aracSahibi;
	}
	
	*/

	public String getMotorNo() {
		return motorNo;
	}

	public void setMotorNo(String motorNo) {
		this.motorNo = motorNo;
	}

	public String getSasiNo() {
		return sasiNo;
	}

	public void setSasiNo(String sasiNo) {
		this.sasiNo = sasiNo;
	}

	@Override
	public String toString() {
		return "Araba [marka=" + marka + ", model=" + model + ", renk=" + renk + ", motorGucu=" + motorGucu
				+ ", motorNo=" + motorNo + ", sasiNo=" + sasiNo + "]";
	}
	
	//arabalarin ayni olup olmadigini hashCode ve equals ile karsilastirdik
	@Override
	public int hashCode() {
		return Objects.hash(motorNo, sasiNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Araba other = (Araba) obj;
		return Objects.equals(motorNo, other.motorNo) && Objects.equals(sasiNo, other.sasiNo);
	}

	
	
	

}
