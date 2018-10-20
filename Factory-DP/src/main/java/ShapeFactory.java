import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<ShapeEnum, Shape> instances;

    static {
        instances = new HashMap();

        instances.put(ShapeEnum.CIRCLE, new Circle());
        instances.put(ShapeEnum.RECTANGLE, new Rectangle());
    }

    public static Shape getShape(ShapeEnum shapeEnum){
        return  instances.get(shapeEnum);
    }
}
