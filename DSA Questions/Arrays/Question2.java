// To find the second largest element in an array:

public class Question2{
    public static void main(String[]args){
        int []arr={1,4,3,2,5,6};

        // For O(n2)
        sortingArray(arr);
        // System.out.println("Second largest number in the array is "+ arr[arr.length-2]);
    
        // for O(n)
        int slarg=optimalSol(arr);
        System.out.println("Second largest number in the array is "+ slarg);
    }
    static void sortingArray(int[] arr){
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-j-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    static int optimalSol(int[] arr){
        int larg=Integer.MIN_VALUE;
        int slarg=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>slarg){
                larg=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>slarg&&arr[i]<larg){
                slarg=arr[i];
            }
        }
    return slarg;
    }

}