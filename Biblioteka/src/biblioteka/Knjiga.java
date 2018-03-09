package biblioteka;

import java.util.LinkedList;

import Autor.Autori;

public class Knjiga {
String naslov;
LinkedList<Autori> autori;
String izdavac;
int izdanje;
String isbn;
public String getNaslov() {
	return naslov;
}
public void setNaslov(String naslov) {
	this.naslov = naslov;
}
public LinkedList<Autori> getAutori() {
	return autori;
}
public void setAutori(LinkedList<Autori> autori) {
	this.autori = autori;
}
public String getIzdavac() {
	return izdavac;
}
public void setIzdavac(String izdavac) {
	this.izdavac = izdavac;
}
public int getIzdanje() {
	return izdanje;
}
public void setIzdanje(int izdanje) {
	this.izdanje = izdanje;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
