import java.lang.reflect.Constructor;

public class ReflectionExample{
    public static void main(String[] args){
        Class<?> clazz = Person.class;
        Constructor<?> constructor = clazz.getConstructor(String.class,int.class);
        Object person = constructor.newInstance("John",30);

    }
}
