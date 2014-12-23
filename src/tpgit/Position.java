package tpgit;

public class Position {
	
	private int altitude=0;
	private int latitude =0;
	private int longitude =0;
	
	public int getAltitude () {
		return altitude;
	}

	public void setAltitude (int altitude){
		this.altitude= altitude;
		}
	
	public int getLatitude (int latitude){
		return latitude;
	}
	
	public void setLatitude (){
		this.latitude=latitude;
	}
	
	public int getLongitude(){
		return longitude ;
	}
	
	public void setLongitude (){
		this.longitude=longitude;
	}
}
