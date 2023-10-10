package main.HW1.ModelElements;

public class Camera {
    Point3D location;
    Angle3D angle;

    public Camera(Point3D location, Angle3D angle){
        this.location = location;
        this.angle = angle;
    }


    public void rotate(Angle3D angle) {
    }

    public void move(Point3D location) {
    }
}
