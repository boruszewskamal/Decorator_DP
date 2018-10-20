import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> arrayList = new ArrayList<Shape>();

        arrayList.add(ShapeFactory.getShape(ShapeEnum.CIRCLE));
        arrayList.add(ShapeFactory.getShape(ShapeEnum.RECTANGLE));

        for (Shape s : arrayList) {
            s.draw();
        }
    }
}
