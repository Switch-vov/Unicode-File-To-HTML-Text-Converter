package kata.ufthtc;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Created by switch on 16/7/2.
 */
public class StringEscaper {
    public String escapeHtml(String originalString) {
        return StringEscapeUtils.escapeHtml(originalString);
    }
}
