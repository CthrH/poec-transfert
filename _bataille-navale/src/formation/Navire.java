package formation;

public class Navire {
	private int position;
	private int taille;
	boolean[] etat;
	
	public Navire(int maxOcean) {
		taille = 2 + (int) (Math.random() * 4); 
		position = (int) (Math.random() * (maxOcean - taille)); 
		etat = new boolean[taille];
		for (int i = 0; i < etat.length; i++) {
			etat[i] = false;
		}
	}
	
	public boolean[] getEtat() {
		return etat;
	}
	public int getPosition() {
		return position;
	}
	public int getTaille() {
		return taille;
	}
	
	// 0 = raté / 1= touché / 2 = coulé
	public int estTouche (Tir tir) {
		int reponse = 0;
		if ((tir.getValue() >= position) && 
		   (tir.getValue() <= position + taille - 1)) {
			   
			etat [tir.getValue() - position ] = true;	
			reponse = 1;
		}
		if (estCoule()) {
			reponse = 2;
		}
		return reponse;
	}
	
	public boolean estCoule() {
		boolean reponse = true;
		for (boolean b : etat) {
			if(b == false) {
				reponse = false;
				break;
			}
		} 
		return reponse;
	}
	
	
	
	
	
	
	
}
