import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(verifyLogin2("asdfg"));
        System.out.println(verifyLogin2("-asdfg"));
        System.out.println(verifyLogin2("_asdfg"));
        System.out.println(verifyLogin2("0asdfg"));
        System.out.println(verifyLogin2("asd3 sd"));

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

    }static boolean verifyLogin2(String login){
        return login.matches("\\S{5,}")
                && login.matches("[a-zA-Z0-9_-]*")
                && login.substring(0,1).matches("^[^0-9]");
    }
}
