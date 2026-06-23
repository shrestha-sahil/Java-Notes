package UnitFour;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class SerializationExample {
    public static void main(String[] args){
        //serialization
    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))){
        Student student1 = new Student(1, "sahil");
        oos.writeObject(student1);


    }catch (Exception e){
        e.printStackTrace();
    }

    //D-seri
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
            Student student = (Student) ois.readObject();
            System.out.println("Student Id:" + student.id);
            System.out.println("Student Name: " + student.name);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
