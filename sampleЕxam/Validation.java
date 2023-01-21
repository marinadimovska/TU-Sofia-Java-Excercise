import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private final static Pattern FAC_PATTERN = Pattern.compile("\\d{9}");
    private final static Pattern EGN_PATTERN = Pattern.compile("\\d{10}");
    private final static Pattern EMAIL_PATTERN = Pattern.compile("[a-z]+@tu-sofia.bg");

    private User createUser(UserType userType, String username, String password) throws ValidationException{
        switch (userType) {
            case ADMIN:
                if (password.length() < 5) {
                    throw new ValidationException();
                }
                return new Admin(username, password);
            case TEACHER:
                if (!EMAIL_PATTERN.matcher(username).matches()) {
                    throw new ValidationException();
                }
                if (password.length() < 5) {
                    throw new ValidationException();
                }
                return new Teacher(username, password);
            case STUDENT:
                if(!FAC_PATTERN.matcher(username).matches()){
                    throw new ValidationException();
                }
                if(!EGN_PATTERN.matcher(password).matches()){
                    throw new ValidationException();
                }
                return new Student(username,password);
            default: return null;
        }
    }
}


