import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Server {
    private static ServerSocket server  = null;
    private static final FileMethods methods = new FileMethods();

    public Server() {
        methods.createFile();
    }

    public void start(){
        try {
            System.out.println("Server is listening...");
            server = new ServerSocket(8080);


            while (true){
                Socket client = server.accept();

                Thread clientThread = new Thread(() -> {
                    System.out.println("Client accepted");
                    Scanner sc = null;
                    PrintStream out = null;

                    try {
                        sc = new Scanner(client.getInputStream());
                        out = new PrintStream(client.getOutputStream());
                        UserMenu(sc, out);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } finally {
                        if (sc != null) {
                            sc.close();
                        }
                        if (out != null) {
                            out.close();
                        }
                    }
                });
                clientThread.start();
        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void UserMenu(Scanner sc, PrintStream out) throws IOException {
        while (true){
            out.println("Login Y/N");
            String login = sc.nextLine();

            if(!login.equalsIgnoreCase("Y")){
                System.out.println("Goodbye!");
                return;
            }

            out.println("Choose write or read [W/R]");
            login = sc.nextLine();

            switch (login){
                case"W":
                    out.println("Write the text you want to enter in the file");
                    String msg = sc.nextLine();
                    methods.writeInFile(msg);
                    out.println();
                    out.println("The message is successfully written!");
                    break;
                case "R":
                    out.println("Read the text in the file");
                    out.println();

                    ArrayList<String> msg_read = methods.read();

                    out.println(Arrays.toString(msg_read.stream().toArray()));
                    break;
            }
        }
    }
}
