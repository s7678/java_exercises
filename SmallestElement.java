public class SmallestElement {
    public static void main(String[]args){
        int []num={23,1,56,33,89,7,45,17};
        int smallestElement=num[0];




        for(int i=0;i<num.length;i++){
            int currentElement=num[i];
           if(currentElement<smallestElement){
               smallestElement=currentElement;
           }

        }
        System.out.println(smallestElement);


    }
}
