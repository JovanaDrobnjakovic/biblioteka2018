package biblioteka;

import java.util.LinkedList;

import Autor.Autori;
import interfejs.bibliotekaInterfejs;

public class biblioteka implements bibliotekaInterfejs {
	LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();


	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);

	}

	
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);

	}

	
	public LinkedList<Knjiga> VratiSveKnjige() {
		return knjige;
	}

	
	public LinkedList<Knjiga> pronadjiKnjigu(Autori autor, long ISBN, String naslov, String izdavac) {
		if (autor==null && ISBN==0 && naslov==null && izdavac==null)
			throw new RuntimeException("Morate uneti bar neki kriterijum za pretragu");
		return knjige;	
		
	}

}
