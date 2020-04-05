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
	public void saveTest() {
		List<Validator> validators = new ArrayList<>();
		
		SpaceValidator sv = mock(SpaceValidator.class);
		LengthValidator lv = mock(LengthValidator.class);
		
		validators.add(sv);
		validators.add(lv);
		
		User u = mock(User.class);
		
		UserServiceImpl us = new UserServiceImpl(um, validators);
		
		um.save(u);
		us.save(u);
		
		verify(um, times(1)).save(u);
	}
	
	@Test
	public void isValidTest() {
		
		List<Validator> validators = new ArrayList<>();
		
		SpaceValidator sv = mock(SpaceValidator.class);
		LengthValidator lv = mock(LengthValidator.class);
		
		validators.add(sv);
		validators.add(lv);
		
		User u = mock(User.class);
		
		when(validators.get(0).isValid(u)).thenReturn(true);
		
		assertTrue(validators.get(0).isValid(u));
		
		when(validators.get(1).isValid(u)).thenReturn(false);
		
		assertFalse(validators.get(1).isValid(u));

	}

}
