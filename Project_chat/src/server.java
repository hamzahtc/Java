
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String []args)
	{
		ServerSocket ser=null;
		Socket s=null;
		
		try
		{System.out.println("==========Server===============");
			
		
			ser=new ServerSocket(6666);
			ser.getReuseAddress();
			while(true)
			{System.out.println("Serveur : Waiting");
				s=ser.accept();
				System.out.println("le client connecté est :"+s.getLocalAddress());
				clientThread x=new clientThread(s);
				new Thread(x).start();
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		
		}
	}

private static class clientThread implements Runnable
{
	Socket s;
	public clientThread(Socket s)
	{
		this.s=s;
	}
	@Override
	public synchronized void run() {
		PrintWriter pr=null;
		BufferedReader r=null;
		
		try
		{
			while(true) {
			Scanner e=new Scanner(System.in);
			r=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=r.readLine();
			System.out.println("le cli ent vous a envoyé :"+str);
			String t=e.nextLine();
			pr=new PrintWriter(s.getOutputStream());
			pr.println(t);
			pr.flush();
		}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			if(pr!=null ||r!=null||s!=null) {
			pr.close();
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		}
		
	}
	
}	
	
	
	
	
	
}
