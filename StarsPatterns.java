public class StarsPatterns {
    public static void main(String[]args){
        int n=5;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        //Print Increasing Triangle
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//
//        //Print Decreasing Triangle
        for(int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//
//        //Print Right sided Triangle I
        for (int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//
//        //Print Right sided Triangle II
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Print Hill Pattern

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Print Reverse Hill Pattern

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Print Diamond pattern

        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Print Square Parallel Bar Pattern

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Print Square Plus Pattern

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1||j==n/2+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Print Cross Pattern

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Print Hollow Square Pattern

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         //Print Hollow Increasing Triangle

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                if(i==n||j==1||j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        //Print Hollow Decreasing Triangle

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i==1||j==i||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }




    }
}
