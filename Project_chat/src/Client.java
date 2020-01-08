
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try
		{
			Scanner e=new Scanner(System.in);
			Socket s=new Socket("localhost",1337);
			s.getReuseAddress();
			String r=e.nextLine();
			PrintWriter re=new PrintWriter(s.getOutputStream(),true);
			re.println(r);
			re.flush();
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=br.readLine();
			System.out.println("Server repond :"+str);
			re.close();
			br.close();
			s.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
