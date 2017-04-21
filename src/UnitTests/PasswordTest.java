package UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Password p = new Password();
		assertFalse(p.checkPassword1("Name","Password"));
		assertFalse(p.checkPassword1("Rahul","Password"));
		assertFalse(p.checkPassword1("andrew","A"));
		assertTrue(p.checkPassword1("Andrew","A"));
	}

}
