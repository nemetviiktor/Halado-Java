package komplex;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class UserServiceImplTest {

	@Mock
	UserModify um;
	
	@Mock
	List<Validator> validators;
	@InjectMocks
	UserServiceImpl usi = new UserServiceImpl(um, validators);
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testSaveWithValidTrue(){
		SpaceValidator sv = mock(SpaceValidator.class);
		when(sv.isValid(null)).thenReturn(true);
		List<Validator> validators = new ArrayList<Validator>();
		validators.add(sv);
		
		usi = new UserServiceImpl(um, validators);
		
		usi.save(null);
		
		verify(um, times(1)).save(null);
	}
	
	@Test
	void testSaveWithValidFalse(){
		SpaceValidator sv = mock(SpaceValidator.class);
		when(sv.isValid(null)).thenReturn(false);
		List<Validator> validators = new ArrayList<Validator>();
		validators.add(sv);
		
		usi = new UserServiceImpl(um, validators);
		
		usi.save(null);
		
		verify(um, times(0)).save(null);
	}

}
