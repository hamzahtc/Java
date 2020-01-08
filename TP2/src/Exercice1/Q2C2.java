package Exercice1;

public class Q2C2 extends Thread{
	private String name;
	public Q2C2(String name) {
		
		this.name=name;

		}
		
	public void run() {
			for(int i=1000;i>0;i--) {
				System.out.println(this.name+" "+i);
			}
	}

}