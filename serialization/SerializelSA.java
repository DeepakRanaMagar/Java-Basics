import java.io.Serializable;
class Person implements Serializable{
    int id;
    String name;
    //COmstructor
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Student extends Person{
    String course;
    int fee;
    //constructor
    public Student (int id, String name, String course, int fee){
      super(id,name);
      this.course = course;
      this.fee = fee;
    }
}
//Main class
public class SerializelSA{
    public static void main(String[] args) {
        try {
            Student s1 = new Student(08 , "Deepak Rana", "SE", 150000);
            FileOutputStream fos = new FileOutputStream("Student.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(s1);
            os.close();
            System.out.println("Succesfull Created!");
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }

}