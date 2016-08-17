package Lab1;

import java.awt.Color;

public class Glove implements Colored,Sized {
	private Color color;
	private int size;
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Glove(Color color, int size){
		this.color= color;
		this.size= size;
	}
	
	public String toString(){
		setMsg("Glove color: " +color+" & size: "+size);
		return getMsg();
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}
