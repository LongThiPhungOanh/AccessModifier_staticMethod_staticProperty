package BaiTap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Circle(){}
    public Circle(String color){}
    public double getArea(){
       return (this.radius * this.radius) * 3.14;
    }
}
