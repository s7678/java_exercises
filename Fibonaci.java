import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
//        int count = 7;
//        int num1 = 0;
//        int num2 = 1;
//        for (int i = 1; i <= count; i++) {
//            System.out.print(num1);
//            int sum = num1 + num2;
//            num1 = num2;
//            num2 = sum;
//        }
//
//    }

        //Find fibonaci series with while loop

//        int count = 7;
//        int num1 = 0;
//        int num2 = 1;
//        int i = 1;
//        while (i <= count) {
//            System.out.print(num1);
//            int sum = num1 + num2;
//            num1 = num2;
//            num2 = sum;
//            i++;
//        }

        //Find fibonaci series with user input


        int num1=0;
        int num2=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int counter=scanner.nextInt();

        for (int i=1;i<=counter;i++){
            System.out.print(num1+" ");
            int sum=num1+num2;
            num1=num2;
            num2=sum;
        }






    }
}
