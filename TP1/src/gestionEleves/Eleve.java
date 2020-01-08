package gestionEleves;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve>{

	
		private String nom;
		private ArrayList<Integer> list = new ArrayList<Integer>();
		private double moyenne;
		public Eleve(String nom) {
			this.nom = nom;
			
		}
		public String getNom() {
			return nom;
		}
		public double getMoyenne() {
			return moyenne;
		}
		
		@Override
		public String toString() {
			return "Eleve [nom=" + nom + ", list=" + list + ", moyenne=" + moyenne + "]";
		}
		public void ajouterNote(int note)
		{
			list.add(note);
			int moy=0;
			for (Integer integer : list) {
				moy+=integer;
			}
			this.moyenne = moy/list.size();
		}
		public ArrayList<Integer> getListeNotes() {
			return list;
		}
		@Override
		public int compareTo(Eleve o) {
			if(o.getClass().equals(Eleve.class))
			{
				Eleve el = (Eleve) o;
				return this.nom.compareTo(el.getNom());
			}
			return -1;
		}
		
		
		

}