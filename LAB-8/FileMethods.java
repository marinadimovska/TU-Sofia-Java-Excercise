import java.io.*;
import java.util.ArrayList;

public class FileMethods {
    private static final String FILE_NAME = "file.txt";

    public void createFile(){
        File file = new File(FILE_NAME);
        if(file.exists()){
            System.out.println("File is already created.");
        }else{
            try{
                file.createNewFile();
                System.out.println("File created.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void writeInFile(String msg) throws IOException {
        try {
            BufferedWriter bfWrite = new BufferedWriter(new FileWriter(FILE_NAME));
            bfWrite.write(msg);
            System.out.println("Successful written in file");

            bfWrite.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public ArrayList<String> read() throws IOException{
        try{
            BufferedReader bfRead = new BufferedReader(new FileReader(FILE_NAME));
            ArrayList<String> fullFile = new ArrayList<>();
            String line = bfRead.readLine();

            while (line!=null){
                fullFile.add(line);
                line = bfRead.readLine();
            }
            bfRead.close();
            return fullFile;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public void create() {
    }
}
