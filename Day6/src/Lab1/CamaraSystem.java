package Lab1;

public class CamaraSystem {
	public static void main(String args[]){
	    Photographer []photographers = new Photographer[3];
	    photographers[0]=new Parent();
	    photographers[1]=new SpyCamera();
	    photographers[2]=new TrafficCamera();
	    
	    for (Photographer photographer : photographers) {
	    	photographer.prepareScene();
	    	System.out.println(photographer.takePhotograph());
	    	System.out.println("----------------------------");
		}

	    
	}
}
