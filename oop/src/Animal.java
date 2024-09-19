public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog makes a sound.");
    }
}

class Demo1{
    public static void main(String[] args) {

//        子类引用指向父类，实际上是animal这个对象在调用子类重写的makeSound这个方法，向上自动转型
//        体现出面向对象中的多态
//        多态就是一种事物多种形态的体现
        Animal animal = new Dog();
        animal.makeSound();
    }
}