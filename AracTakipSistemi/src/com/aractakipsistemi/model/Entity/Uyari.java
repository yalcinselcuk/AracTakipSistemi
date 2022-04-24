package com.aractakipsistemi.model.Entity;

import java.util.Objects;

public class Uyari {

	private String aciklama;
	
	public Uyari(String aciklama) {
		super();
		this.aciklama = aciklama;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aciklama);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Uyari other = (Uyari) obj;
		return Objects.equals(aciklama, other.aciklama);
	}

	@Override
	public String toString() {
		return "Uyari [aciklama=" + aciklama + "]";
	}
	
	

}
