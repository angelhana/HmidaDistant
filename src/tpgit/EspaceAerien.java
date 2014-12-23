package tpgit;

import java.util.ArrayList;

public class EspaceAerien {
	
	private ArrayList<Avion> avions= new ArrayList<Avion>();

	private final int reducedVerticalSeparationMinima = 1000;
	
	public boolean addAvion(Avion a){
		return avions.add(a);
	}
	
	public boolean removeAvion (Avion a){
		return avions.remove(a);
	}
	
	public ArrayList<Avion> verificationAltitudes(){
		ArrayList<Avion> listeAlerte= new ArrayList<Avion>();
		for (Avion a1:avions){
			for(Avion a2:avions){
				if(!a1.equals(a2)){
					if (Math.abs(a1.getAltitude()-a2.getAltitude())< reducedVerticalSeparationMinima){
						if (!listeAlerte.contains(a1)){
							listeAlerte.add(a1);
						}
						if (!listeAlerte.contains(a2)){
							listeAlerte.add(a2);
						}
					}
				}
			}
		}
		return listeAlerte;
	}
}
