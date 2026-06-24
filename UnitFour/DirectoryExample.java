package UnitFour;

import java.io.File;
import java.util.Scanner;

public class DirectoryExample {
    public static void main(String[] args){
        File dir = new File("myDirector");

        //creating a directory
        if(dir.mkdir()){
            System.out.println("directory created");
        }else {
            System.out.println("Directory already exists");
        }

        //listing files in a directory
        File[] files = dir.listFiles();
        if (files != null){
            for (File file : files){
                System.out.println(file.getName());
            }
        }
    }
}
