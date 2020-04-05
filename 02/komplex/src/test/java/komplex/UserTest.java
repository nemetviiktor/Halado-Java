package komplex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testUserNameArgsConstructor() {
		String name = "a";

		
		User user = new User(name, false, name);
		
		assertEquals(name, user.getName());
				
	}
	
	@Test
	void testUserNameAndNeptunConstructor() {
		String name = "a";
		String neptun ="b";

		User user = new User(name, false, neptun);
		
		assertEquals(name, user.getName());
		assertEquals(neptun, user.getNeptunkod());
				
	}
	
	@Test
	void testUserNameAndEnabledConstructor() {
		String name = "a";
		boolean enabled = true;

		User user = new User(name, enabled, name);
		
		assertEquals(name, user.getName());
		assertEquals(enabled, user.isEnabled());
				
	}
	
	@Test
	void testUserAllArgsConstructor() {
		String name = "a";
		String neptun ="b";
		boolean enabled = true;
		
		User user = new User(name, enabled, neptun);
		
		assertEquals(name, user.getName());
		assertEquals(neptun, user.getNeptunkod());
		assertEquals(enabled, user.isEnabled());
				
	}
	
	@Test
	void testNoArgsConstructor() {
		
		User user = new User(null, false, null);
		
		assertNull(user.getName());
		assertNull(user.getNeptunkod());
		assertNotNull(user.isEnabled());
				
	}

	@Test
	void testBuilder() {
		String name = "a";
		String neptun ="b";
		boolean enabled = true;
		User user = new User(name, enabled, neptun);
		
		assertEquals(name, user.getName());
		assertEquals(neptun, user.getNeptunkod());
		assertEquals(enabled, user.isEnabled());
				
	}
	
	@Test
	void testGetterSetter() {
		String name = "a";
		String neptun ="b";
		boolean enabled = true;
		User user = new User(name, enabled, neptun);
		
		assertEquals(name, user.getName());
		assertEquals(neptun, user.getNeptunkod());
		assertEquals(enabled, user.isEnabled());
		
		String name2 = "aa";
		String neptun2 ="bb";
		boolean enabled2 = false;
		
		user.setName(name2);
		user.setNeptunkod(neptun2);
		user.setEnabled(enabled2);
		
		assertEquals(name2, user.getName());
		assertEquals(neptun2, user.getNeptunkod());
		assertEquals(enabled2, user.isEnabled());
				
	}
	
	@Test
	void TestToString(){
		String name = "a";
		User user = new User(name, false, name);
		
		assertNotNull(user.toString());
	}
	
	@Test
	void TestHashCode(){
		String name = "a";
		User user = new User(name, false, name);
		
		assertNotNull(user.hashCode());
	}
	
	@Test
	void TestEquals(){
		String name = "a";
		String name2 = "b";
		User usr1 = new User(name, false, name2);
		User usr2 = new User(name, false, name2);
		User usr3 = new User(name2, false, name2);
		
		assertTrue(usr1.equals(usr2));
		assertFalse(usr1.equals(usr3));
	}
}
