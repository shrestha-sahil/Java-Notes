package UnitFour;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args){

        //creating scanner object to read from file
        try {
            File file = new File("bca6th.txt");
            Scanner input = new Scanner(file);

            //reading from file
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
