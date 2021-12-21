class Employee {
    String name;
    int id, salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary * 12;
    }
}

class Manager extends Employee {
    public Manager(String name, int id, int salary) {
        super(name, id, salary);
    }

    public String toString() {
        String info = "Name:" + this.name + "\nId:" + this.id + "\nSalary:" + (getSalary() + (10000 * 12));
        return info;
    }

}

class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Manager m = new Manager("Deepak", 8, 1000);
        System.out.println(m);
    }
}