public class TestDemo01 implements Drawable{
    @Override
    public void draw() {
     System.out.println("实现接口");
 }

    public static void main(String[] args) {
        new TestDemo01().draw();
    }
}
