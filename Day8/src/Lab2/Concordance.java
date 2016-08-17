package Lab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Concordance {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("pg1342.txt");
			BufferedReader br = new BufferedReader(fr);
			String input = null;
			Map<String, Integer> concordanceMap = new HashMap<String, Integer>();

			while (br.readLine() != null) {
				input = br.readLine();
				String[] words = input.split("\\W+");
				for (String word : words) {
					if (concordanceMap.get(word.toLowerCase()) == null)
						concordanceMap.put(word.toLowerCase(), 1);
					else
						concordanceMap.put(word.toLowerCase(), concordanceMap.get(word.toLowerCase()) + 1);
				}
			}
			 Iterator it = concordanceMap.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			        System.out.println(pair.getKey() + " = " + pair.getValue());
			        it.remove(); // avoids a ConcurrentModificationException
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
