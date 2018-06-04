package formation;

import java.util.ArrayList;
import java.util.List;

public class Ocean {
	List<Case> cases = null;
	private int max;
	
	public Ocean (int max) {
		cases = new ArrayList<Case>();
		for (int i = 0; i < max; i++) {
			Case c = new Case(i);
			c.setCouleur("cyan");
			cases.add(c);
		}
		this.max = max;
	}

	public List<Case> getCases() {
		return cases;
	}

	public int getMax() {
		return max;
	}
			
}
