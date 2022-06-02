package ValiDate_Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiDateClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Class_REGEX =   "^(C|A|P)+(\\w*)+[0-9]{4}+(G|H|I|K|L|M)$";

    public ValiDateClass() {
        pattern = Pattern.compile(Class_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
