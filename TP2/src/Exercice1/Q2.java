package Exercice1;

public class Q2 extends Thread {
 private String name;
	public Q2(String name) {
		
		this.name=name;
		}
		
	public void run() {
		
			for(int i=1;i<=1000;i++) {
				
				System.out.println(this.name+" "+i);
			}
			
	}
			
}
