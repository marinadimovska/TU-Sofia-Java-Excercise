import java.io.*;
import java.lang.reflect.Field;
import java.sql.Array;
import java.util.ArrayList;

public class TicketLoader implements Importable{
    private final static String FILE_NAME = "dailytickets.txt";
    @Override
    public Object[] importDataFromFile() throws IOException {
         ArrayList<String> concerts = new ArrayList<>();
         ArrayList<String> volleyBallMatch = new ArrayList<>();
         Event[] arrayOfEvents = null; //масив от тип Event,в който са ни всички събития
         int numberOfRows = getNumberOfRows();
         arrayOfEvents = new Event[numberOfRows];
         BufferedReader objReader = null;

            try{
                String currentLine;
                objReader = new BufferedReader(new FileReader(FILE_NAME));
                //Цикълът while в кода по-долу ще прочете файла, докато не достигне края на файла
                //strCurrentLine чете текущия ред и Java readLine функцията objReader.readLine() връща низ.
                // Следователно, цикълът ще се повтаря, докато не стане нула.
                while((currentLine = objReader.readLine() )!= null){
                    if (currentLine.startsWith("1")){
                        concerts.add(currentLine);
                    }else if(currentLine.startsWith("2")){
                        volleyBallMatch.add(currentLine);
                    }else{
                        throw new UnrecognisedRowException();
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            } catch (UnrecognisedRowException e) {
                throw new RuntimeException(e);
            } finally {
                try{
                    if(objReader != null){
                        objReader.close();
                    }
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }

            return new ArrayList[]{concerts,volleyBallMatch};
    }
    private static int getNumberOfRows() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
        int numberOfRows = 0;
        while(bufferedReader.readLine() != null){
            numberOfRows++;
        }

        return numberOfRows;
    }
    }

