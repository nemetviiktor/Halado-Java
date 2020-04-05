package komplex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

class UseRepositoryTest {
	
	@Mock
	List<User> users;
	
	@Mock
	UserModify um;

	@Test
	public void saveTest() {
		
		UseRepository ur = new UseRepository();
		User u = mock(User.class);
		
		ur.save(u);
		
		verify(u);
	}
	
	@Test
	public void getByNektunKodTest() {
		
		List<User> users = new ArrayList<>();
		
		UseRepository ur = new UseRepository();
		User user = mock(User.class);
		
		when(user.getNeptunkod()).thenReturn("neptunkod");
		
		assertEquals(user, ur.getByNektunKod("1"));
		
	}

}
