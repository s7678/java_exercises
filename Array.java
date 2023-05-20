public class Array {
    public static void main(String[]args){
        int[] number ={11,22,33,44};

        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }

        int [][]arr=new int[2][3];
        arr[0][0]=11;
        arr[0][1]=22;
        arr[0][2]=33;
        arr[1][0]=44;
        arr[1][1]=55;
        arr[1][2]=66;

        int [][]array={{11,22,33,},{44,55,66}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        String[] names ={"Tom","Mary","John"};
        for(String str:names){
            System.out.println(str);
        }

        int []numbers={1,2,3,4,5};
        for(int num:numbers){
            System.out.println(num);
        }


    }
}
