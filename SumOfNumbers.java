import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        int num=10, count=1, total=0;
        while(count<=num){
            total=total+count;
            count++;
        }
        System.out.println("The sum of first 10 numbers is "+total);


        for(int i=count;i<=num;i++){
            total=total+i;

        }
        System.out.println("The sum of first 10 numbers is "+total);

        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
//

        for (int i=1;i<=n;i++){
            int number= scanner.nextInt();
            total=total+number;
        }
        System.out.println("The sum of n numbers are "+total);

        for(int i=1; i<=n;i++){
            total=total+i;
        }
        System.out.println("The sum of n numbers is "+total);
    }
}
