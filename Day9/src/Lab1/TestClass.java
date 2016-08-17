package Lab1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public static void main(String args[]) {
		Glove g1 = new Glove(Color.red, 2);
		Glove g2 = new Glove(Color.red, 1);
		Sock s1 = new Sock(Color.black, 3);
		Sock s2 = new Sock(Color.black, 2);
		Fabric f1 = new Fabric(Color.yellow);
		Fabric f2 = new Fabric(Color.cyan);
		GlassVase gv1 = new GlassVase(22);

		List<ClothingPair> listPairs = new ArrayList<ClothingPair>();
		listPairs.add(new ClothingPair(g1, g2));
		listPairs.add(new ClothingPair(f1, f2));
		listPairs.add(new ClothingPair(g1, s2));
		listPairs.add(new ClothingPair(f1, f2));

		for (ClothingPair clothingPair : listPairs) {
			System.out.println(clothingPair.isSame());
			System.out.println(clothingPair.isMatched());

		}
	}
}
