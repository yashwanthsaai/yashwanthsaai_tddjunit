package learn_epam.tddjunithometask;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DelAinFirst2CharsTest {
	
	/* TODO list for my feature
	 * 1. empty char : "" => ""
	 * 2. 1 char : "A" => ""
	 * 			   "B" => "B"
	 * 3. greater than 1 char : "AABAA" => "BAA"
	 * 							"ABCD" => "BCD"
	 * 							"BACD" => "BCD"
	 
	 */
	@Test
	void test1chars() {
		DelAinFirst2Chars delAinfirst2chars = new DelAinFirst2Chars();
		String actual = delAinfirst2chars.removeA("B");
		assertEquals("B", actual);
	}
	

	@Test
	void testemptychar() {
		DelAinFirst2Chars delAinfirst2chars = new DelAinFirst2Chars();
		String actual = delAinfirst2chars.removeA("");
		assertEquals("", actual);
	}
	
	@Test
	void testgreaterthan2chars() {
		DelAinFirst2Chars delAinfirst2chars = new DelAinFirst2Chars();
		String actual = delAinfirst2chars.removeA("BAACD");
		assertEquals("BACD", actual);
	}
	
}
