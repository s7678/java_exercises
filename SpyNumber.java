import java.util.Scanner;

public class SpyNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();
        int num=number;

        int sumOfDigits=0;
        int productOfDigits=1;
        int temp;
        while(num>0){
            temp=num%10;
            sumOfDigits=sumOfDigits+temp;
            productOfDigits=productOfDigits*temp;
            num=num/10;
        }

        if(sumOfDigits==productOfDigits){
            System.out.println(number+" its a spy number");
        }
        else{
            System.out.println(number+" its NOT a spy number");
        }

    }

}
