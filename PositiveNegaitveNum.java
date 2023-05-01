import java.util.Scanner;

public class PositiveNegaitveNum {
    public static void main(String[] args) {
//        int num=45;

//        if(num>0){
//            System.out.println("The number is positive");
//        }
//        if (num<0){
//            System.out.println("The number is negative");
//        }
//        if(num==0){
//            System.out.println("The number is neither positive nor negative");
//        }

//        if(num>0){
//            System.out.println("The number is positive");
//        }
//        else if(num<0){
//            System.out.println("The number is negative");
//        }
//        else{
//            System.out.println("The number is neither positive nor negative");
//        }

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        num = scanner.nextInt();
        scanner.close();
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is neither positive nor negative");
        }


    }
}
