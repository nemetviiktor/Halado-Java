package hu.me.krz.haladojava;

public class App1 {

	public static void main(String[] args) {
		
		Labegyseg lab = new LabegysegImp();
		Kar kar = new Kar();
		
		Robot mozgoRobot = new Robot(lab);
		
		System.out.println("fogyasztas: " + mozgoRobot.mozgas(10));
		
		Robot mozgoIntegetoRobot = new Robot(lab);
		mozgoIntegetoRobot.setKar(kar);
		
		System.out.println("Mozgó integető fogyasztas: " + mozgoIntegetoRobot.mozgas(10));

	}
}
