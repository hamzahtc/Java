package Exercice1;

public class Main1 {
		
		public static void main(String args[]) {
			Runnable TA=new Q1("TA");
			Runnable TB=new Q1C2("TB");
				new Thread(TA).start();
			System.out.println("**");
				new Thread(TB).start();

	}

}
