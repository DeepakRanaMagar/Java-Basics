class Job {
    String title;
    int salary;

    // CONSTRUCTOR
    public Job(String title, int salary) {
        this.title = title;
        this.salary = salary;
    }
    public void showTitle() {
        System.out.println("Title: " + this.title);
    }
    
    public void showSalary() {
        System.out.println("Salary: " + this.salary);
    }
}

class Person {
    String name;
    int age;
    Job job;
    
    // CONSTRUCTOR
    public Person(String name, int age, Job j) {
        this.name = name;
        this.age = age;
        this.job = j;
    }
    
    // Value return ko lagi
    public void info(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        job.showTitle();
        job.showSalary();
    }
}

class TestJob {
    public static void main(String[] args) {
        Job job = new Job("Manager", 20000);
        Person p = new Person("Sam", 20, job);
        p.info(); 
    }
}