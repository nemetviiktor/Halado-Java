package hu.me.krz.haladojava;

public class Robot {
	private Labegyseg lab;
	private Kar kar;
	
	public Robot(Labegyseg lab) {
		this.lab = lab;
	}

	
	public int mozgas(int hova) {
		int comp = 0;
		
		if (kar != null) {
			comp = kar.integet();
		}
		comp += lab.mozgas(hova);
		
		return comp;
	}


	public Kar getKar() {
		return kar;
	}


	public void setKar(Kar kar) {
		this.kar = kar;
	}

	
}
