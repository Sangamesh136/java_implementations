import java.util.Arrays;

public class bubbleSorting {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[]arr){
        boolean swapped=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<=arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
//            if no swapping occurs when i=0, then the program when directly return to the main method
            if(!swapped){
                break;
            }
        }
    }

}
