public class Q2 {
    public void subtract(int a, int b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public void subtract(double a, double b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public void subtract(int a, double b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public void subtract(double a, int b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public static void main(String[] args) {
        Q2 obj = new Q2();
        obj.subtract(2, 1);
        obj.subtract(2.5, 1.2);
        obj.subtract(3, 1.2);
        obj.subtract(3.5, 1);
    }
}
