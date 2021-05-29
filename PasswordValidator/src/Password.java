
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String pwd = sc.nextLine();

        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword = isValidPassword(pwd,regex);
        System.out.println("Password Entered is valid password:" +validPassword);
    }

    public static boolean isValidPassword(String password,String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}