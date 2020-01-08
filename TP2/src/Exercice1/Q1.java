package Exercice1;

public class Q1 implements Runnable {
String nom;
	public Q1(String nom) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
		}
		
	public void run() {
			for(int i=1;i<=1000;i++) {
				System.out.println(this.nom+" "+i);
			}
			
	}
			
}

