class Student{
    String name;
    float grade;
}
//Constructor Declaration
public Student(String name, float grade) throws InvalidGradeException{
    if(grade>4.0||grade<0.0){
        throw new InvalidGradeException("INVALID INPUT!");
    }else{
        this.name=name;
        this.grade=grade;
    }
}

//Custom inherited Exception definition
class InvalidGradeException extends Exception{
    public InvalidGradeException(String msg){
        super(msg);
    }
}
class Test{
    public static void main(String[] args) {
        try{
            Student s = new Student("Anil", 25);
        }catch(InvalidGradeException e ){
            System.out.println(e.getMessage);
        }
    }
}