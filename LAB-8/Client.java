import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket server = new Socket("localhost", 8080);
            Scanner console = new Scanner(System.in);
            Scanner sc = new Scanner(server.getInputStream());
            PrintStream out = new PrintStream(server.getOutputStream());

            UserMenu(console, sc, out);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void UserMenu(Scanner console, Scanner sc, PrintStream out) {
        while (true){
            //login msg
            System.out.println(sc.nextLine());

            //Transport the answer to the server - out is server output stream
            //console.nextLine take the next line

            out.println(console.nextLine());

            //Takes the msg that the server give
            String next = sc.nextLine();
            System.out.println(next);

            if(next.equalsIgnoreCase("Goodbye!")){
                return;
            }
            //Export the answer to the server
            out.println(console.nextLine());

            next = sc.nextLine();
            System.out.println(next);

            switch (next){
                case "Writer: ":
                    System.out.println(next = sc.nextLine());
                    out.println(console.nextLine());
                    System.out.println(next = sc.nextLine());
                    System.out.println(next = sc.nextLine());
                    break;
                case "Reader: ":
                    System.out.println(next = sc.nextLine());
                    System.out.println(next = sc.nextLine());

                    System.out.println(sc.nextLine());

                    break;
            }
        }
    }
}

