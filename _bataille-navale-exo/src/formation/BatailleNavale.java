package formation;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="bataillenavale", eager=true)
public class BatailleNavale {
	
	private int compteur = 0;

	public int getCompteur() {
		return compteur++;
	}

	public void reset() {
		compteur = 0;
	}
	
}
