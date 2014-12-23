package tpgit;

public class Avion {
	
	private Position p= new Position();
	
	public int getAltitude(){
		return p.getAltitude();
	}

	
	public void setAltitude(int altitude ){
		p.setAltitude(altitude);
	}
	
	public void setLatitude(int latitude){
		p.getLatitude(latitude);
	}
	
	
	public Avion (){

		System.out.println("New Avion");

	}
}
