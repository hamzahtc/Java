package gestionEleves;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupeEleves {

	private ArrayList<Eleve> listEleves= new ArrayList<Eleve>();
	
	public int nombre(){
	return	listEleves.size();
	}
	
	public ArrayList<Eleve> getListEleves() {
		return listEleves;
	}
	
	public void ajouterEleve(Eleve eleve ) {
		listEleves.add(eleve);
	}
	
	public Eleve chercher (String nom ) {
		Iterator<Eleve> it = listEleves.iterator();
		while(it.hasNext())
		{	
			Eleve e = it.next();
			if(e.getNom().equals(nom)) {
				 return e;
			}
		}
		return null;
	}
	
	public void lister()
	{
		Iterator<Eleve> it = listEleves.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}
}
