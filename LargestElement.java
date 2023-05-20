public class LargestElement {
    public static void main(String []args){
        int []arr={45,89,654,23,11,8,345,2,67};
        int largestElement=arr[0];

        for(int i=0;i<arr.length;i++){
            int currentElement=arr[i];
            if(currentElement>largestElement){
                largestElement=currentElement;
            }
        }
        System.out.println(largestElement);
    }
}
