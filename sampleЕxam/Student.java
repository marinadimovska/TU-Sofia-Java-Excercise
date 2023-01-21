import java.util.ArrayList;

public class Student extends User{
    ArrayList<Grade> grade;

    public Student(String username, String password) {
        super(username, password);
        grade = new ArrayList<>();
    }

    @Override
    UserType getUserType() {
        return UserType.STUDENT;
    }

    public ArrayList<Grade> getGrade(){
        return grade;
    }
}
