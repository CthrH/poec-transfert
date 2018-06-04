package formation;

import java.awt.Color;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="bataillenavale", eager=true)
@SessionScoped
public class BatailleNavale {
	
	private int compteur = 0;
	private Ocean ocean;
	private Navire navire;
	
	
	
	public Ocean getOcean() {
		return ocean;
	}

	public Navire getNavire() {
		return navire;
	}

	public BatailleNavale() {
		ocean = new Ocean(20);
		navire = new Navire(ocean.getMax());
		System.out.println(navire.getPosition() + ": :" + navire.getTaille());
	}
	
	public int getCompteur() {
		return compteur++;
	}
	
	public void reset() {
		compteur = 0;
		navire = new Navire(ocean.getMax());
	}
	
	Color[] couleur = {Color.cyan, Color.orange, Color.red};
	
	private String code2color (int i) {
		String[] txtcolor = {"cyan", "orange", "red"};
		return txtcolor [i];
	}
	
	public int selection(Case c) {
		int retour = navire.estTouche(new Tir(c.getValue()));
		if(retour == 2) {
			for (int i = navire.getPosition(); i < navire.getPosition() + navire.getTaille() - 1; i++) {
				ocean.getCases().get(i).setCouleur(code2color(retour));
			}
		} else {
			
		}
		ocean.getCases().get(c.getValue()).setCouleur(code2color(retour));
		return retour;
	}
}
