package kata.ufthtc;

import java.io.*;

public class UnicodeFileToHtmlTextConverter {
    private Reader reader;
    private StringEscaper stringEscaper;

    public UnicodeFileToHtmlTextConverter(String fullFilenameWithPath) throws FileNotFoundException {
        this(new FileReader(fullFilenameWithPath), new StringEscaper());
    }

    public UnicodeFileToHtmlTextConverter(Reader reader) {
        this(reader, new StringEscaper());
    }

    public UnicodeFileToHtmlTextConverter(Reader reader, StringEscaper stringEscaper) {
        this.reader = reader;
        this.stringEscaper = stringEscaper;
    }

    public String convertToHtml() throws IOException{
        BufferedReader reader = new BufferedReader(this.reader);

        String line = reader.readLine();
        String html = "";
        while (line != null)
        {
            html += this.stringEscaper.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }
}
