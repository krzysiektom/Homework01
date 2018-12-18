import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(verifyLogin("asdfg"));
        System.out.println(verifyLogin("-asdfg"));
        System.out.println(verifyLogin("_asdfg"));
        System.out.println(verifyLogin("0asdfg"));
        System.out.println(verifyLogin("asd3 sd"));
    }
    static boolean verifyLogin(String login){
        Pattern compiledPattern = Pattern.compile("^[a-zA-z_-][a-zA-z0-9_-]{4,}");
        Matcher matcher = compiledPattern.matcher(login);
        return matcher.matches();
    }
}
