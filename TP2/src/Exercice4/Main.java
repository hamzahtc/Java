package Exercice4;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parking p=new Parking(3);
		Voiture v1=new Voiture(1);
		Voiture v2=new Voiture(2);
		Voiture v3=new Voiture(3);
		Voiture v4=new Voiture(4);
		p.entrer(v1);
		p.entrer(v2);
		p.entrer(v3);
		p.entrer(v4);
		p.quitter(v1);
		p.entrer(v4);
		System.out.println(p.toString());


	}

}
