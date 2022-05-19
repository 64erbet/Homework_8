public class Display_shape {
    public Display_shape(Shape sama_shape) {
        sama_shape.display_shape_name();// Можно было бы вызвать метод display_shape_name()
                                        // в конструкторе каждой фигуры и тогда в мейне было
                                        // бы просто пять операторов "new", но велено, что
                                        // "должен быть класс, который принимает фигуру",
                                        // поэтому - Вуаля!!!!
    }

    public static void main(String[] args) {

          new Display_shape(new Circle());
          new Display_shape(new Quad());
          new Display_shape(new Rectangle());
          new Display_shape(new Rhombus());
          new Display_shape(new Triangle());
    }
}


