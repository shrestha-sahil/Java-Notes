package UnitFour;
import java.io.*;

public class BufferedCharStreamExample {
    public static void main(String[] args){
        //write file
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("file_char.txt"))){
            bw.write("test");
        }catch (IOException e){
            e.printStackTrace();
        }

        //read file
        try(BufferedReader br = new BufferedReader(new FileReader("file_char.txt"))){
            int i;
            while ((i = br.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
