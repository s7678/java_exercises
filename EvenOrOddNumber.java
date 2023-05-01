import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args){
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to check if its even or odd");
        num= scanner.nextInt();
        scanner.close();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        String evenOrOdd=(num%2==0)?"even number":"odd number";
        System.out.println(num +" is "+evenOrOdd);



    }
}
