package Exercice4;

public class Voiture extends Thread{
	int id;
	
	public Voiture(int id) {
	
		this.id=id;
	}

	public static void main(String[] args) {
		

	}
	public void run() {
		
		try {
			
			sleep((long) Math.random()*10539+1);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + "]";
	}

}
