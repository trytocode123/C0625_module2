package ss19_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String regex = "\\d{2,4}[-|/][A-Z]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("22-AAAA");
        System.out.println(matcher.matches());
    }
}
