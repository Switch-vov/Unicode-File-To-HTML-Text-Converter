package kata.ufthtc;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;

public class UnicodeFileToHtmlTextConverterTest {
    @Test
    public void a_trivial_test() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void should_convert_ampersand() throws IOException {
        // Arrange
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader("H&M"));

        // Act & Assert
        assertEquals("H&amp;M<br />", converter.convertToHtml());
    }

    @Test
    public void should_convert_greater_than_and_less_than() throws IOException {
        // Arrange
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader(">_<|||"));

        // Act & Assert
        assertEquals("&gt;_&lt;|||<br />", converter.convertToHtml());
    }

    @Test
    public void should_add_a_line_break_for_a_new_line() throws IOException {
        // Arrange
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader("Cheers\nSwitch"));

        // Act & Assert
        assertEquals("Cheers<br />Switch<br />", converter.convertToHtml());
    }

    @Test
    public void should_convert_ampersand_using_StringEscaper() throws IOException {
        // Arrange
        StringEscaper stringEscaper = new StringEscaper();
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader("H&M"), stringEscaper);

        // Act & Assert
        assertEquals("H&amp;M<br />", converter.convertToHtml());
    }
}
