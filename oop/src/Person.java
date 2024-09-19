public class Person {
    private String name;
    private int  age;
    String sex;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0 ||age > 100)  {
            System.out.println("年龄输入错误，请重新输入");
        }else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class Student extends Person {
    String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Person.Student{" +
                "major='" + major + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
