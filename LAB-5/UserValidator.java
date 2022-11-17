package Laboratorno5zadacha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

//declare a string pattern for username.

    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
    private static final String PASSWORD_PATTERN= "[a-zA-Z]{11,}";

    private static final String PHONENUMBER_PATTERN= "[0-9]{10}";

    public static boolean validateUserName(final String name){
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(name);

        return matcher.matches();


    }
    public static boolean validateUserPassword(final String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
    public static boolean validateUserPhonenumber(final String number){
        Pattern pattern = Pattern.compile(PHONENUMBER_PATTERN);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }
}

