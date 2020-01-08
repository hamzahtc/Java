package Exercice4;

import java.util.ArrayList;

public class Parking{
private final int N;
private ArrayList<Voiture> V;
	public Parking(int N) {
		V=new ArrayList<Voiture>();
		this.N=N;
		
	}
	
	public boolean entrer(Voiture v) {
		if(V.size()<N) {
			this.V.add(v);
			return true;
		}else {
			System.out.println("Insuffisant");
			return false;
		}
		
	}

	public void quitter(Voiture v) {
			this.V.remove(v);
	}
	@Override
	public String toString() {
		return "Parking [N=" + N + ", Lv=" + V.toString() + "]";
	}

}
