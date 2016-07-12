package za.co.mipisolutions.serviceTests;

import org.junit.Before;
import org.junit.Test;
import za.co.mipisolutions.service.MainService;
import za.co.mipisolutions.service.MainServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by chrismipi on 2016/07/08.
 */
public class ServiceTests {

	private MainService service;

	@Before
	public void setUp() {
		service = new MainServiceImpl();
	}

	@Test
	public void addTwoNumbersFirst() {
		String first = "7";
		String second = "108";

		assertEquals("115", service.compute(first, second));
	}

	@Test
	public void addStuff() {
		String first = "110";
		String second = "10";

		assertEquals("120", service.compute(first, second));
	}

	@Test
	public void addLetters() {
		String first = "a";
		String second = "100";

		assertEquals("100", service.compute(first, second));
	}

	@Test
	public void addTwoLetters() {
		String first = "a";
		String second = "b";

		assertEquals("0", service.compute(first, second));
	}
}
