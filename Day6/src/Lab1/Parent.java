package Lab1;

public class Parent implements Photographer {
	public void prepareScene(){
		System.out.println("Say cheese childern!!!");
	}
	
	public String takePhotograph(){
		return "1st birthday photograph";
	}
}
