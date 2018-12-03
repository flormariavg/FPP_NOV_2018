package w1l4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
		
		boolean actual = Palindrome.isPalindrome("tacocat");
		boolean expected = true;
		
		assertEquals(expected, actual);
	}

}
