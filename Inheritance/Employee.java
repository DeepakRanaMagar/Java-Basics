//Parent class
class Employee{
   public float salary = 1000;
}

//Child class
class Programmer extends Employee{
    public int bonus = 500;
}

//Main class
class Test{
    public static void main(String[] args){
        Programmer p = new Programmer();
        System.out.println("Salary is: " + p.salary);
        System.out.println("Bonus is: " + p.bonus);
    }
}

//Is-A relation 