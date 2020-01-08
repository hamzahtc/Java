package Exercice1;

public class Q1C2 implements Runnable{
	
	private String name;
	public Q1C2(String name) {
		
		this.name=name;

		}
		
	public void run() {
			for(int i=1000;i>0;i--) {
				System.out.println(this.name+" "+i);
			}
	}

}
