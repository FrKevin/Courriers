package fr.univ_lille1.fil.coo.courriers.tests.letters.content;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class TextContentTest {
	public final static String CONTENT_LETTER = "bla bla";
	
	@Test
	public void testTextContent() {
		TextContent content = new TextContent(CONTENT_LETTER);
		assertTrue(content.getContentLetter().equals(CONTENT_LETTER));
	}

}
