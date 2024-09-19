
//定义抽象类
/*
  抽象类是一种不能被实例化的类，它通常用于定义一些通用的属性和方法，供其子类继承和实现。抽象类中可以包含抽象方法和非抽象方法。
  使用 “abstract” 关键字来定义抽象类和抽象方法。
* */
abstract class Shape {
    String color;
    int width;
    int height;
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Test extends Shape{
    public Test() {
        super();
    }
    void draw() {
        super.draw();
        System.out.println("Testing a  shape");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.draw();
    }
}

