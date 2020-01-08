package Exercice3;

public class Valeur {
	private int valeur;
	public Valeur(int valeur) {
		
		this.valeur=valeur;
	}
	@Override
	public String toString() {
		return "Valeur [valeur=" + valeur + "]";
	}
	public int getValeur() {
		return valeur;
	}
	public synchronized void add(int i) {
		System.out.println(i);
		this.valeur += i;
	}

}
