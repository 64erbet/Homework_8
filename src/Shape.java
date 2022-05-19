abstract class Shape {
    protected String name;
    public void display_shape_name() {
        System.out.println("Name of figure: " + this.name); // Значение переменной name
                                                            // выбираем в зависимости от
                                                            // типа вызывающего класса-
                                                            // наследника
    }
}
