import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngine {

    static int find(String needle, String haystack) {

        final String regexNeedle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher matcher = Pattern.compile(regexNeedle).matcher(haystack);

        return matcher.find() ? matcher.start() : -1;
    }
}
