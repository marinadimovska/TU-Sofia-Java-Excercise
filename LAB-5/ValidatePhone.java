package Laboratorno5zadacha;

public interface ValidatePhone {
     static void ValidatePhoneNumber(String phonenumber)throws WrongNumberException{
        boolean check;

        check=UserValidator.validateUserPhonenumber(phonenumber);
        if (check==false){
            throw new WrongNumberException();
        }
        else {
            System.out.println("Valid PhoneNumber");
        }
    }

}
