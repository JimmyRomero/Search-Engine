import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by JimmyRomero on 9/2/2016.
 */
public class SearchEngine {

    static int find(String needle, String haystack) {

        String regexNeedle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher matcher = Pattern.compile(regexNeedle).matcher(haystack);
        if (matcher.find()) {
            return matcher.start();
        } else {
            return -1;
        }
    }
}
