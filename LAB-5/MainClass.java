package Laboratorno5zadacha;

import java.util.Objects;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws WrongNumberException,WrongUserException{
        Scanner scanner=new Scanner(System.in);

        String username;
        String password;
        String password1;
        String phonenumber;

        User user1=new User("erol","1234","0893522308");
        User user2=new User("crol","12343","0893522301");
        User user3=new User("brol","12345","0893522302");

        User[] userList={user1,user2,user3};
        System.out.println("If you want to register type (r) if you want to login type (l): ");
        String wish=scanner.next();

        if(Objects.equals(wish,"r")){
            boolean flag=true;
            boolean checkUser;
            boolean chekPass;

            System.out.println("Enter username: ");
            username=scanner.next();
            for(User value:userList){
                if (Objects.equals(username,value.getName())){
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                System.out.println("Username is used...");
            }
            else {
                checkUser=UserValidator.validateUserName(username);
                if(!checkUser){
                    throw new WrongUserException();
                }
                else {
                    System.out.println("Enter password: ");
                    password=scanner.next();
                    System.out.println("Enter your password again : ");
                    password1=scanner.next();

                    if (!password.equals(password1)){
                        System.out.println("Passwords doesn't match");
                    }
                    else {
                        chekPass=UserValidator.validateUserPassword(password);
                        if (!chekPass){
                            System.out.println("Invalid passowrd");
                        }

                        System.out.println("Enter your Phonenumber: ");
                        phonenumber=scanner.next();

                        User user=new User(username,password,phonenumber);
                    }
                }
            }
        }
        if (Objects.equals(wish,"l")){
            boolean flag=false;

            System.out.println("Enter your username: ");
            username=scanner.next();
            for (User value: userList) {
                if(Objects.equals(username,value.getName())){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println("That username doesnt exist");
            }
            else {
                flag=false;
                System.out.println("Enter your password: ");
                password=scanner.next();

                for (User value: userList) {
                    if (Objects.equals(password,value.getPassword())){
                        flag=true;
                        System.out.println("The phone number is "+value.getPhoneNumber());
                        break;
                    }
                }
                if(!flag){
                    System.out.println("The password is not correct !");
                }
            }
        }

    }
}
