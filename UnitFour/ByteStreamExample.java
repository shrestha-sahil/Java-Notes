package UnitFour;

import java.io.*;

public class ByteStreamExample {

    public static void main(String[] args) {

        // Writing to a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("example.txt")) {

            String content = "sahil";

            byte[] contentBytes = content.getBytes();

            fos.write(contentBytes);

            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}