public class LargestOfNumbers {
    public static void main(String[] args){
        int num1 = 50, num2 = 0, num3 = 1300;

//        if(num1>num2&&num1>num3)
//
//        {
//            System.out.println("The largest number is " + num1);
//
//        }
//        else if(num2>num1&&num2>num3)
//
//        {
//            System.out.println("The largest number is " + num2);
//
//        }
//        else
//
//        {
//            System.out.println("The largest number is " + num3);
//        }
//    }

            if (num1 >= num2) {
                if (num1 >= num3) {
                    System.out.println("The largest number is " + num1);
                }
                else{
                    System.out.println("The largest number is "+num3);
                }
            }
        if (num2 >= num1) {
            if (num2 >= num3) {
                System.out.println("The largest number is " + num2);
            } else {
                System.out.println("The largest number is " + num3);
            }
        }



    }
}
