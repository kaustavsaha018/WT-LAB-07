import java.util.Scanner;

class Numbers {
    int size;
    
    Numbers(int size){
        this.size=size;
    }
    int[] arr;
    public void getNumbers(){
        arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public void swap(){
        int maxIndex=0,minIndex=0;
        for(int i=1;i<size;i++){
            if(arr[maxIndex]<arr[i])
                maxIndex=i;
            if(arr[minIndex]>arr[i])
                minIndex=i;
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        System.out.println("The Largest number is swapped with the Smallest number");
    }
    public void display(){
        System.out.print("The Array is:");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many no.s you want to enter: ");
        int n = sc.nextInt();
        Numbers N1 = new Numbers(n);
        N1.getNumbers();
        N1.display();
        N1.swap();
        N1.display();
        sc.close();
    }
}
