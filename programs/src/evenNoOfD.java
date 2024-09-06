public class evenNoOfD {
    public static void main(String[]args){
    int []arr={12,2,143,6542};

    System.out.println("The total number of even numbers is " + findNumber(arr));
    }
    static int findNumber(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

//    function to check whether a number contains even number or not:
    static boolean even(int num){
        int rem;
        int count = 0;
        while(num!=0){
            rem=num%10;
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
