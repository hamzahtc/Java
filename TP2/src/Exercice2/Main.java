package Exercice2;

public class Main {

	public static void main(String[] args) {
		
		int A=10,
				j=0;
		while(j<A) {
			
		Compteur C=new Compteur(" "+j,15);
		
		C.start();
		
		j++;
		}
	}

}
