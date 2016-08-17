package Lab1;

public class SpyCamera  implements Photographer {
	public void prepareScene(){
		System.out.println("Setting the Geo location & focusing!!!");
	}
	
	public String takePhotograph(){
		return "Suspicious activities found in that building";
	}
}
