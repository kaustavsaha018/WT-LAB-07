public class Q3 {
    public void area(double r){
        System.out.println("Area of Circle is: " + String.format("%.3f", (3.14*r*r)) + " square units");
    }
    public void area(double l, double b){
        System.out.println("Area of Square: " + (l*b) + " square units");
    }
    public void area(double a, double b, double c){
        double S=(a+b+c)/2;
        System.out.println("Area of Triangle is: " + String.format("%.3f", Math.sqrt(S*(S-a)*(S-b)*(S-c))) + " square units");
    }
    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.area(3);
        obj.area(4,4);
        obj.area(9,9,5);
    }
}
