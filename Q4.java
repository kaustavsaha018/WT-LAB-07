class Rectangle {
    double lenght;
    double breadth;

    public void getDimensions(double lenght, double breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    public double area(){
        return lenght*breadth;
    }
    public double perimeter(){
        return (2*(lenght+breadth));
    }
    public void display(){
        System.out.println("Area of the Rectangle is: " + String.format("%.3f", area()) + " square units");
        System.out.println("Perimeter of the Rectangle is: " + String.format("%.3f", perimeter()) + " units");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.getDimensions(1.5,2.4);
        R1.display();
    }
}
