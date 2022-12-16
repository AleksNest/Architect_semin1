package ModelElements;

import Stuff.Point3D;
import java.util.ArrayList;

public class Poligon {
    public ArrayList<Point3D> points = new ArrayList<Point3D>();

    // конструктор добавления хотя бы одной точки, #param point
    public Poligon(Point3D point) {
        points.add(point);
    }

}
