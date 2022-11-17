package Laboratorno5zadacha;

public class User extends UserValidator {
    private String Name;

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    private String Password;
    private String PhoneNumber;

    public User(String name, String password, String phoneNumber) throws WrongNumberException {
        Name = name;
        Password = password;
        PhoneNumber = phoneNumber;

        ValidatePhone.ValidatePhoneNumber(phoneNumber);
    }

}
