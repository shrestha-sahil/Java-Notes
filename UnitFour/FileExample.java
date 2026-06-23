package UnitFour;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main (String[] args){
        File file = new File("file_example.txt");

        try{
            if (file.createNewFile()){
                System.out.println("file created");
            }else {
                System.out.println("file created already");
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        //get file properties
        System.out.println("File path:" + file.getAbsolutePath());
        System.out.println("file name:" + file.getName());


        //delete file properties
        if(file.delete()){
            System.out.println("file deleted " + file.getName());
        }else {
            System.out.println("something went wrong");
        }

    }
}
