import java.io.*;

public class FileMethods {
    public static final String fileName = "users.bin";

    // Method to read user information from a file and return an object of the appropriate class
    public static User readUserFromFile(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            ois.close();
            return user;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to write user information to a file
    public static void writeUserToFile(User user, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void register(String username,String email,String password,UserType userType,String fileName){
        User user;
        if(userType.equals(UserType.ADMIN)){
            user= new Admin(username,password);
        }else if(userType.equals(UserType.STUDENT)){
            user= new Student(username,password);
        }else if(userType.equals(UserType.TEACHER)){
            user= new Teacher(email,password);
        }else{
            throw new IllegalArgumentException("Invalid role");
        }
        writeUserToFile(user, fileName);
    }
}

