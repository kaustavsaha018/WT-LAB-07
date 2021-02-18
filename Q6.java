import java.util.Scanner;

public class Q6 {
    public void calculateArea(double x){
        System.out.println("Area of the circle is: " + String.format("%.2f",3.14*3.14*x)+ "\n");
    }
    public void calculateArea(double x, Double y){
        System.out.println("Area of the rectangle is: " +String.format("%.2f",x*y)+ "\n");
    }
    public void calculateArea(double x, double y, double z){
        double S = (x+y+z)/2;
        double ar = Math.sqrt(S*(S-x)*(S-y)*(S-z));
        System.out.println("Area of the rectangle is: " + String.format("%.2f",ar)+ "\n");
    }
    
    public static void main(String[] args) {
        System.out.println("\n1. To Calculate the area of the Circle \n2. To Calculate the Recatangle of the Square \n3. To Calculate the area of the Triangle");
        System.out.println("4. To Exit from the program\n\n");
        Scanner sc = new Scanner(System.in);
        Q6 obj = new Q6();
        boolean flag=true;
        while(flag){
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of circle: ");
                    double rad = sc.nextDouble();
                    obj.calculateArea(rad);
                break;
                case 2:
                    System.out.println("Enter the lenght and width of rectangle: ");
                    double len = sc.nextDouble();
                    double wid = sc.nextDouble();
                    obj.calculateArea(len,wid);
                break;
                case 3:
                    System.out.println("Enter the 3 sides of the triangle: ");
                    double s1 = sc.nextDouble();
                    double s2 = sc.nextDouble();
                    double s3 = sc.nextDouble();
                    obj.calculateArea(s1,s2,s3);
                break;
                case 4:
                    System.out.println("Exiting...");
                    flag=false;
                break;
                default:
                    System.out.println("Wrong Choice!\n");
            }
        }
        sc.close();
    } 
}

