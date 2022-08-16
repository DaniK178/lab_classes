public class Rectangle {


    private float length;
    private float width;

public Rectangle (float newlength, float newwidth){
    this.length = newlength;
    this.width = newwidth;

}

public float getLength(){
    return length;
}

public float getWidth(){
    return width;
}

public float getPerimeter(){
    return width *2 + length *2;
}

public float getArea(){
    return width * length;
}

public double getDiagonal(){
    return Math.sqrt( Math.pow(width, 2) + Math.pow(length,2));
}
    @Override
    public String toString() {
        return "Account{" + "length='" + length + "width= '" + width + ", Perimeter=" + Perimeter + '}';


}
