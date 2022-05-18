public class Circle extends Shape implements Display_name {
    private static String name;

    public Circle() {
        name = "Circle";
    }

    @Override
    public static void display_name() {
        System.out.println("Name = " + name);
    }
}
