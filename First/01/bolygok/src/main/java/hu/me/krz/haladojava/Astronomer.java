package hu.me.krz.haladojava;

import java.util.List;

public class Astronomer {
	
	private String name;
	List<Planet> DiscoveredPLanets;
	
	public Astronomer(String name) {
		this.name = name;
	}
	
	public List<Planet> getDiscoveredPLanets() {
		return DiscoveredPLanets;
	}


	public void observeTheSky() {
		Planet[] planet = new Planet[10];
		
		for (int i = 0; i < planet.length; i++) {
			
		}
	}
	
	
	

}
