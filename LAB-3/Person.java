public class Person {

    private String name;
    private int yearOfBirth;

    public Person() {
        this.name = "";
        this.yearOfBirth = 0;
    }

    public Person(String name, int yearOfbirth) {
        this.name = name;
        this.yearOfBirth = yearOfbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void speak() {
        System.out.println("Hi, my name is " + getName());
    }

}
