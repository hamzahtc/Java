package Exercice5;

public class Main {

	public static void main(String[] args) {
		FileStatistics file = new FileStatistics("file.txt");
		System.out.println(file.getCharCount()+" words");
		System.out.println(file.getWordCount()+" sentences");
		file.saveCounts("saver.txt");
	}

}
