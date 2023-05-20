public class DuplicateElement {
    public static void main(String []args){
        int[]num={3,5,6,2,2,8,4,3,8,0,4,7};

        for(int i=0;i<num.length;i++){
            boolean isDuplicate=false;
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    isDuplicate=true;
                    break;
                }

            }
            if(isDuplicate==true){
                System.out.println(num[i]);
            }
        }


    }
}
