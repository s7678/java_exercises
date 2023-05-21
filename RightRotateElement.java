import java.util.Arrays;

public class RightRotateElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int last;
        int n = 2;

        for (int i = 0; i < n; i++) {
            last=arr[arr.length-1];//storing the last element of the array to move to start
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];//shifting the element to right by 1 on each iteration of loop
            }
            arr[0]=last;//adding the last element at the beginning of the array


        }
        System.out.println(Arrays.toString(arr));

    }
}
