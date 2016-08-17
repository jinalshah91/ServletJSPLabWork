package Lab1;

import java.awt.Color;

public class Sock implements Colored,Sized {
	private Color color;
	private int size;
	public void setColor(Color color) {
		this.color = color;
	}
	public void setSize(int size) {
		this.size = size;
	}

	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Sock(Color color, int size){
		this.color= color;
		this.size= size;
	}
	public String toString(){
		setMsg("Sock color: " +color+" & size: "+size);
		return msg;
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
