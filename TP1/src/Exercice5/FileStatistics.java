package Exercice5;
import java.io.*;

public class FileStatistics {
	String filename;
	
	public FileStatistics(String filename) {
		this.filename=filename;
	}
	
	public int getCharCount() {
		try {
			FileInputStream fis = new FileInputStream(filename);
			int n ;
			int count = 0;
			while((n=fis.read())!=-1) {
				count++;
			}
			fis.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int getWordCount() {
		try {
			FileInputStream fis = new FileInputStream(filename);
			int n;
			String buff = null;
			int count = 0;
			while((n=fis.read())!=-1) {
				buff+=(char)n;
			}
			for(String s : buff.split("[,.:' ']")) {
				count++;
			}
			return count;
		}catch(Exception e) {
			e.fillInStackTrace();
		}
		return 0;
	}
	
	public void saveCounts(String file) {
		try {
			FileWriter fr = new FileWriter(file);
			int nbrChar = this.getCharCount();
			int nbrMot = this.getWordCount();
			String input = "the file : "+this.filename+" has "+nbrChar+" char and "+nbrMot+" sentences";
			fr.write(input);
			fr.flush();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
