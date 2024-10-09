public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;


    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
            this.designation = designation;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 职位='" + designation + '\'' +
                ", 薪资=" + salary +
                '}';
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee("张三");
        Employee e2 =  new Employee("李四");
        e1.setAge(37);
        e1.setDesignation("IT工程师");
        e1.setSalary(20000);
        System.out.println(e1.toString());

        e2.setAge(45);
        e2.setDesignation("网络工程师");
        e2.setSalary(40000);
        System.out.println(e2.toString());
    }
}