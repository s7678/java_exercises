import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number;
        long fact = 1;
        int count = 1;

//        for(int i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("The Factorial is "+fact);


        //Find Factorial using while loop

//        while (count <= number) {
//            fact = fact * count;
//            count++;
//        }
//        System.out.println("The Factorial is " + fact);

        //Find Factorial of number entered by the user

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        number=scanner.nextInt();

        while(count<=number){
            fact=fact*count;
            count++;
        }
        System.out.println("The Factorial number is "+fact);






    }
}
