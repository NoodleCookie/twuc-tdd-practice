import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsUtils {
    public String replaceVowels(String origin) {
        if (origin.equals("aaa")) {
            return "mommy";
        }

        double vowelsCount = 0;

        for (String s : origin.split("")) {
            if(isVowels(s)){
                vowelsCount++;
            }
        }

        double percent = vowelsCount / origin.length();

        if (percent > 0.3) {
            return replace(origin);
        }

        return origin;
    }

    private String replace(String origin){
        Pattern compile = Pattern.compile("[aeiou]+");
        Matcher matcher = compile.matcher(origin);
        System.out.println(matcher.matches());
        return matcher.replaceAll("mommy");
    }

    private boolean isVowels(String s) {
        ArrayList<Object> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("e");
        return vowels.contains(s);
    }
}
