package UnitFour;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(BufferedByteStream[] args){
        try (FileOutputStream fos = new FileOutputStream("BCA 6th.txt")){
            BufferedByteStream content = "this is a test content hehe";
            fos.write(content.getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }

        //reading for file using file-input stream
        try (FileInputStream fis = new FileInputStream("bca 6th.txt")){
            int i;
            while ((i = fis.read()) != -1){
                System.out.print((char)i);
            }

        }catch (IOException e){

        }
    }
}
