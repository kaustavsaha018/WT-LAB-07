import java.util.Scanner;

class Box {
    double lenght,width,height;

    Box(double lenght, double width, double height){
        this.lenght=lenght;
        this.width=width;
        this.height=height;
    }

    public double volume(){
        return lenght*width*height;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the box: ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of the box: ");
        double h = sc.nextDouble();
        sc.close();
        Box B1 = new Box(l,b,h);
        System.out.println("Volume of the box is: " + String.format("%.2f", B1.volume()) + " cubic units");
    }
}
