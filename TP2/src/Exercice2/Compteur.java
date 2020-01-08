package Exercice2;
public class Compteur extends Thread {
	String nom;
	int maxvalue;
	public Compteur(String nom,int maxvalue) {
		this.nom=nom;
		this.maxvalue=maxvalue;
	}

	public void run() {
		
			try {
				for(int i=1;i<=this.maxvalue;i++) {
					
					System.out.println(this.nom+" "+i);
					
				sleep((long) (Math.random()*399+1));
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}


