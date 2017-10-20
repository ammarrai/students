package testing.warburton.wordwrap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordWrapTest {

	public static final int LINE_LENGTH = 5;
	
	@Test
	public void lineShouldWrapIfOverLineLength() {
		String result = WordWrap.wrap("The Sleepy", LINE_LENGTH);
		assertEquals("The S\nleepy", result);
	}
	
}
