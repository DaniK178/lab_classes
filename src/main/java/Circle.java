public class Circle {

    private double radius;

public Circle (double newRadius){
    this.radius = newRadius;
}

public double getRadius(){
    return radius;
}

public double getCircumference(){
    return radius*Math.PI*2;
}

public void setRadius(double newRadius) {
    this.radius = newRadius;
    }

@Override
public String toString() {
    return "Circle{" + "radius'" + radius + '}';
    }

}



