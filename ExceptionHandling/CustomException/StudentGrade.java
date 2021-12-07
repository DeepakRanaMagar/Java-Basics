class InvaildAgeException extends Exception{
    public InvaildAgeException(String msg){
        super(msg);
    }
}
class Person{
    String name;
    int age;
    public Person(String name, int age)throws InvaildAgeException{
        if(age<18){
            throw  new InvaildAgeException("You are under age to vote.");
        }else{
            this.name=name;
            this.age=age;
        }
    }
}
class StudentGrade{
    public static void main(String[] args) {
        try{
            Person c = new Person("Deepak", 20);
        }catch(InvaildAgeException e){
            System.out.println(e.getMessage());
        }
    }
}