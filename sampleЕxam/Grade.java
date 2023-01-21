import java.util.ArrayList;

public class Grade {
    private String subject;
    private int semesterNum;
    private int grade;

    public Grade(String subject, int semesterNum, int grade) {
        this.subject = subject;
        this.semesterNum = semesterNum;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSemesterNum() {
        return semesterNum;
    }

    public void setSemesterNum(int semesterNum) {
        this.semesterNum = semesterNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
