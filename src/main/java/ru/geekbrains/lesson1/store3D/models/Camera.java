package ru.geekbrains.lesson1.store3D.models;


public class Camera {

    private Point3D location;
    private Angle3D angle;

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public void rotate(Angle3D angle) {

    }

    public void move(Point3D location) {

    }

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }
}
