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

    // TODO-new-feature: Make the UnicodeFileToHtmlTextConverter working for not only a file but also a string

    // TODO-user-intent-test-working-on: should convert ampersand
    public void should_convert_ampersand() throws IOException {
        // Arrange
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader("H&M"));

        // Act & Assert
        assertEquals("", converter.convertToHtml());
    }

    // TODO-user-intent-test: should convert greater than and less than

    // TODO-user-intent-test: should add a line break for a new line
}
