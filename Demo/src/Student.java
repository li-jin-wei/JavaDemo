public class Student extends Person {
    String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    void study() {
        System.out.println(name + " is studying " + major + ".");
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
