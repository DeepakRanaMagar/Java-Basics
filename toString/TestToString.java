
class Student {
    int rollno;
    String name;

    //Constructer
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public String toString(){
        return "Name: "+this.name+"Roll no: "+this.rollno;
    }
}

class TestToString{
    public static void main(String[] args) {
        Student s = new Student(8,"Deepak");
        System.out.println(s.toString());
    }
    
}
