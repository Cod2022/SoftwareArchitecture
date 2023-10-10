package main.HW1.ModelElements;

public class Flash {

    Point3D location;
    Angle3D angle;
    Color color;
    float power;

    public Flash(Point3D location, Angle3D angle,Color color,float power){
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Angle3D angle) {
    }

    public void move(Point3D location) {
    }
}
