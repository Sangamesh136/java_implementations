// To remove the duplicate elements in an array:

public class Question4{
    public static void main(String[]args){
        int []arr={1,2,2,4,4,5};
        int k = duplicate(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");duplicate(arr);
        }
    }
    static int duplicate(int[] arr){
        int i=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
                }
            }
        return i+1;
    }
}
