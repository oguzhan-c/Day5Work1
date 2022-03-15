package ECommerce.entities.concrates;

import ECommerce.entities.abstracts.IEnity;

public class User implements IEnity {
	int id;
	String ad;
	String soyad; 
	String eposta;
	String parola;
	public User(int id, String soyad, String eposta, String parola, String ad) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.eposta = eposta;
		this.parola = parola;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
}
