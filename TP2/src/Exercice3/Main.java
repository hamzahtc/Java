package Exercice3;

public class Main {
		
	
		public static void main(String args[]) {
			Valeur myVal=new Valeur(11);
			
			Runnable j1=new Ajob(myVal,1);
			Runnable j2=new Ajob(myVal,-1);
			
			new Thread(j1).start();
			new Thread(j2).start();
			
			System.out.println(myVal.toString());
		}
}



//Exercice3-5:  Entre les threads j1 et j2 dans l'utilisation de la méthode ADD

