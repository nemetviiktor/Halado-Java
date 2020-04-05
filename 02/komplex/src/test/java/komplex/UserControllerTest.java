package komplex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

class UserControllerTest {

	@Mock
	UserService us;
	
	@Mock
	NeptunCodeGenerator ng;
	
	@InjectMocks
	UserController uc = new UserController(us, ng);
	
	@Mock
	User user;
	
	@Mock
	UserDto ud;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void savetest() {
		uc.save(ud);
		
		
		
	}

}
