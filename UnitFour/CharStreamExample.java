package UnitFour;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {
    public static void main(String[] args){
    //write file
    try(FileWriter fw = new FileWriter("file_char.txt")){
        fw.write("test");
    }catch (IOException e){
        e.printStackTrace();
    }

    //read file
        try(FileReader fr = new FileReader("file_char.txt")){
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
