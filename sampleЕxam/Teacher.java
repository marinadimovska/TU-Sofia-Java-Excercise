public class Teacher extends User {
    public Teacher(String email, String password) {
        super(email, password);
    }

    @Override
    UserType getUserType() {
        return UserType.TEACHER;
    }
}
