package hu.me.krz.haladojava;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class RobotTest {

	@Test
	public void mozgasWhenNoKar_thenLowComp() {
		int x = 10;
		Labegyseg lab = mock(Labegyseg.class);
		int pwd = 123;
		when(lab.mozgas(x)).thenReturn(pwd);
		Robot robot = new Robot(lab);
		
		int power = robot.mozgas(10);
		
		//Assert.assertEquals(50, power);
	}
	
	@Test
	public void mozgasWhenWithKar_thenHighComp() {
		int x = 10;
		Labegyseg lab = mock(Labegyseg.class);
		Kar kar = mock(Kar.class);
		int pwd = 123;
		when(lab.mozgas(x)).thenReturn(pwd);
		int pwd2 = 12312;
		when(kar.integet()).thenReturn(pwd);
		Robot robot = new Robot(lab);
		robot.setKar(kar);
		
		int power = robot.mozgas(x);
		
		Assert.assertEquals(pwd, power);
		verify(lab, times(1)).mozgas(10);
		verify(lab, times(1)).mozgas(10);
	}
	
	
	@Test
	public void mozgasWhenException_then0() {
		int x = 10;
		Labegyseg lab = mock(Labegyseg.class);
		int pwd = 123;
		when(lab.mozgas(x)).thenThrow(new RuntimeException("geb"));
		Robot robot = new Robot(lab);
		
		int power = robot.mozgas(10);
		
		//Assert.assertEquals(50, power);
	}

}
