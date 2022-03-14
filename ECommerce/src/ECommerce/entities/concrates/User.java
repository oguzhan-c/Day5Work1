package ECommerce.entities.concrates;

import ECommerce.entities.abstracts.IUser;

public class User implements IUser {
	int id;
	String soyad; 
	String eposta;
	String parola;
	public User(int id, String soyad, String eposta, String parola) {
		this.id = id;
		this.soyad = soyad;
		this.eposta = eposta;
		this.parola = parola;
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
