package com.aractakipsistemi.model.Entity;

import java.util.Objects;

public class Cihaz {

	private String seriNo;

	public Cihaz(String seriNo) {
		super();
		this.seriNo = seriNo;
	}

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(seriNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cihaz other = (Cihaz) obj;
		return Objects.equals(seriNo, other.seriNo);
	}

	@Override
	public String toString() {
		return "Cihaz [seriNo=" + seriNo + "]";
	}

}
