import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample{
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Person.class;
        Constructor<?> constructor = clazz.getConstructor(String.class,int.class);
        Object person = constructor.newInstance("John",30);

    }
}
