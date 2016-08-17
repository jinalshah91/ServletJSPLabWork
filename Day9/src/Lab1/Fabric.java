package Lab1;

import java.awt.Color;

public class Fabric implements Colored {
	public Color color;

	public Fabric(Color color) {
		this.color = color;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}
