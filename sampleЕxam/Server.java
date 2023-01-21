import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Server {

    private ServerSocket server;
    private static final FileMethods methods = new FileMethods();

    private final Object userLock;

    //When the server is starting automatically create file with ADMIN user
    public Server() throws IOException {
        methods.fileCreation();
        userLock = new Object();
    }

    public void start(){

        try
        {
            System.out.println("Server is listening...");
            server = new ServerSocket(8081);

            while (true)
            {
                Socket client = server.accept();

                Thread clientThread = new Thread(() ->
                {
                    System.out.println("Client accepted");
                    Scanner sc = null;
                    PrintStream out = null;

                    try {
                        sc = new Scanner(client.getInputStream());
                        out = new PrintStream(client.getOutputStream());
                        userMenu(sc,out);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    finally {
                        if (sc != null)
                            sc.close();
                        if (out != null)
                            out.close();
                    }
                });

                clientThread.start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void userMenu(Scanner sc,PrintStream out){

        while (true) {

            out.println("Login? Y/N");
            String accept = sc.nextLine();

            if (!accept.equalsIgnoreCase("Y")) {
                out.println("Goodbye!");
                return;
            }

            out.println("Username:");
            String username = sc.nextLine();

            out.println("Password:");
            String password = sc.nextLine();


            User user = login(username,password);

            if(user==null){
                out.println("Invalid login");
                continue;
            }

            UserType userType = user.getUserType();

            try {
                switch (userType) {
                    case ADMIN:
                        adminMenu(sc, out);
                        break;
                    case TEACHER:
                        teacherMenu(sc,out);
                        break;
                    case STUDENT:
                        studentMenu(sc, out, (Student) user);
                        break;
                }
            }catch (ValidationException e){
                e.printStackTrace();
            }


        }
    }

    public User login(String username, String password){

        synchronized (userLock){
            for(User user: methods.loadUsers()){
                if(Objects.equals(user.getUsername(),username) && Objects.equals(user.getPassword(),password)){
                    return user;
                }
            }
            return null;
        }
    }

    public void adminMenu(Scanner sc, PrintStream out) throws ValidationException {
        out.println("You logged in as Admin");

        out.println("Choose what account you want to register: ADMIN|STUDENT|TEACHER");

        UserType userType = UserType.valueOf(sc.nextLine().toUpperCase());

        out.println("Username:");
        String username = sc.nextLine();

        out.println("Password:");
        String password = sc.nextLine();

        methods.register(userType,username,password);

    }

    public void studentMenu(Scanner sc, PrintStream out, Student student){

        out.println("You logged in as Student");

        ArrayList<Grade> grades;

        grades = sort(student.getGrade());

        out.println(grades);
    }

    public void teacherMenu(Scanner sc, PrintStream out){

        out.println("You logged in as Teacher.");

        out.println("Enter student faculty number:");
        String facNumber = sc.nextLine();

        out.println("Enter subject:");
        String subject = sc.nextLine();

        out.println("Enter semester:");
        int semester = Integer.parseInt(sc.nextLine());

        out.println("Enter grade:");
        int gradeValue = Integer.parseInt(sc.nextLine());

        Grade grade = new Grade(subject,semester,gradeValue);

        synchronized (userLock){

            ArrayList<User> users = (ArrayList<User>) methods.loadUsers();

            for (User user:users) {
                if(user.getUsername().equals(facNumber) && user instanceof Student){
                    ((Student) user).getGrade().add(grade);
                    methods.saveUsers(users);
                    out.println("Success");
                    return;
                }
                out.println("No such Student");
                return;
            }
        }
    }

    public ArrayList<Grade> sort(ArrayList<Grade> grades){
        grades.stream().sorted(Comparator.comparing(Grade::getSemester).thenComparing(Grade::getSubject)).collect(Collectors.toList());

        return grades;
    }


}
