import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.*;
class Person implements Serializable throws IOException,ClassNotFoundExceptionprivate String name;

{
    String name;
    int age;

    public Person(String name, int age){
        this.na me = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Name: "+this.name+"Age: "+this.age);
    }
}
class Serialize{
    public static void main(String[] args) {
        Person p = new Person ("Anil", 20);
        FileOutputStream fos = new FileOutputStream("Text.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(p);
        os.close();
        fos.close();
    }
}