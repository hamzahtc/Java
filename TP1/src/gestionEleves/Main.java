package gestionEleves;

public class Main {

	

	public static void main(String[] args) {
		
		Eleve e = new Eleve("Hasna");
		Eleve h = new Eleve("Hamza");
		Eleve p = new Eleve("Amira");
		GroupeEleves ge = new GroupeEleves();
		ge.ajouterEleve(e);
		ge.ajouterEleve(h);
		ge.ajouterEleve(p);
		System.out.println(ge.chercher("Hasna"));
		ge.lister();
		
	}

}
