import org.junit.Test;

import static org.junit.Assert.*;

public class OfflineExercisesTests {
	/*
	 * README Do not edit tests, the trainer will be running your code against a
	 * copy of the current tests here So if you edit the tests here, the changes
	 * will not reflect in the trainers version of the tests, and may result in
	 * some tests failing.
	 */
	OfflineExercises oe = new OfflineExercises();

	@Test
	public void doubleChar() {
		assertEquals("TThhee", oe.doubleChar("The"));
		assertEquals("AAAAbbbb", oe.doubleChar("AAbb"));
		assertEquals("HHii--TThheerree", oe.doubleChar("Hi-There"));
	}
	@Test
	public void getSandwich() {
		assertEquals("jam", oe.getSandwich("breadjambread"));
		assertEquals("jam", oe.getSandwich("xxbreadjambreadyy"));
		assertEquals("", oe.getSandwich("xxbreadyy"));
		assertEquals("honey", oe.getSandwich("xxbreadhoneybreadyy"));
	}
	@Test
	public void evenlySpaced() {
		assertTrue(oe.evenlySpaced(2, 4, 6));
		assertTrue(oe.evenlySpaced(4, 6, 2));
		assertFalse(oe.evenlySpaced(4, 6, 3));
	}
	@Test
	public void nTwice() {
		assertEquals("Helo", oe.nTwice("Hello", 2));
		assertEquals("Choate", oe.nTwice("Chocolate", 3));
		assertEquals("Ce", oe.nTwice("Chocolate", 1));
	}
	@Test
	public void endsLy() {
		assertTrue(oe.endsly("oddly"));
		assertFalse(oe.endsly("y"));
		assertFalse(oe.endsly("l"));
		assertFalse(oe.endsly("oddl"));
		assertFalse(oe.endsly("oddy"));
	}
	@Test
	public void stringClean() {
		assertEquals("yza", oe.stringClean("yyzzza"));
		assertEquals("abcd", oe.stringClean("abbbcdd"));
		assertEquals("Helo", oe.stringClean("Hello"));
	}
	@Test
	public void fibonacci() {
		assertEquals(0, oe.fibonacci(0));
		assertEquals(1, oe.fibonacci(1));
		assertEquals(1, oe.fibonacci(2));
		assertEquals(2, oe.fibonacci(3));
		assertEquals(3, oe.fibonacci(4));
		assertEquals(5, oe.fibonacci(5));
		assertEquals(8, oe.fibonacci(6));
		assertEquals(75025, oe.fibonacci(25));
	}
	@Test
	public void bunnyEars() {
		assertEquals(0, oe.bunnyEars(0));
		assertEquals(4, oe.bunnyEars(2));
		assertEquals(8, oe.bunnyEars(4));
		assertEquals(32, oe.bunnyEars(16));
	}
}
