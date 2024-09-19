public class Demo {

//    方法的重载，方法名相同，接受参数不同或者参数类型不同
    int add (int a, int b) {
        return a + b;
    }
    double add (double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.add(10, 20));
        System.out.println(demo.add(10.101, 20.20001));
    }
}
