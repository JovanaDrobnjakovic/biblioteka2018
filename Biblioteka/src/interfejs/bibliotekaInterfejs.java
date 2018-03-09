package interfejs;

import java.util.LinkedList;

import Autor.Autori;
import biblioteka.Knjiga;

public interface bibliotekaInterfejs {
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public LinkedList<Knjiga> VratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(Autori autor,
	long ISBN, String naslov, String izdavac);
}
