package Lab1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordList {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("pg1342.txt");
			BufferedReader br = new BufferedReader(fr);
			String input = null;
			Set<String> wordCollection = new HashSet<String>();

			while (br.readLine() != null) {
				input = br.readLine();
				String[] words = input.split("\\W+");
				for (String word : words) {
					wordCollection.add(word.toLowerCase());
				}
			}
			Iterator iter = wordCollection.iterator();
			while (iter.hasNext()) {
			    System.out.println(iter.next());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
