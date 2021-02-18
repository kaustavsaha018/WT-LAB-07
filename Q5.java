import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double cgpa;

     public void getDetails(int rollNo, String name, double cgpa){
        this.rollNo=rollNo;
        this.name=name;
        this.cgpa=cgpa;
     }
}
public class Q5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the no. of Students: ");
      int n = Integer.parseInt(sc.nextLine());
       
      Student[] S = new Student[n];
      
      int temp_roll;
      String temp_name;
      double temp_cgpa;

      for(int i=0;i<n;i++){
         System.out.print("\nEnter Student's Roll No: ");
         temp_roll = Integer.parseInt(sc.nextLine());
         System.out.print("Enter Student's Name: ");
         temp_name = sc.nextLine();
         System.out.print("Enter Student's CGPA: ");
         temp_cgpa = Double.parseDouble(sc.nextLine());
         S[i] = new Student();
         S[i].getDetails(temp_roll, temp_name, temp_cgpa);
      }
      sc.close();

      String lowest = S[0].name;
      for(int i=1;i<n;i++){
         if(S[i-1].cgpa>S[i].cgpa)
            lowest=S[i].name;
      }
      System.out.println("\n"+ lowest + " has got the lowest CGPA");
   }
}