package UnitFour;

import java.io.*;

public class BufferedByteStream {
    public static void main(String[] args){
        //writing
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Buffered_example.txt"))){
            String str = "this is a test string for writing";
            byte[] bytes = str.getBytes();
            bos.write(bytes);

        }catch (IOException e){
            e.printStackTrace();
        }

        //reading
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Buffered_example.txt"))){
            int i;
            while ((i = bis.read()) != -1){
                System.out.print((char)i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
