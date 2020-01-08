package Exercice3;

public class Ajob implements Runnable{
	Valeur myVal;
	int i;
	public Ajob(Valeur myVal,int i) {

		this.myVal=myVal;
		this.i=i;
	}
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			this.myVal.add(this.i);
		}
		System.out.println(myVal.getValeur());
	}

}
