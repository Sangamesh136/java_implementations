public class LSPractice {
    public static void main(String[]args){
        int []arr={1,4,45,765,434,32,6,864,2,69};
        int target=32;
        String str="Sangamesh";
        char find='m';
//      to print the index:
        System.out.println(search(arr,target));

//        to print if it is present or no
        if(search2(arr,target)==true){
            System.out.println("Yes! it is present!");
        }
        else
            System.out.println("No! it is not present!");

//        to check if the element is present in a specified region:

        int start=2;
        int end=9;
        if(search3(arr,target,start,end)==false){
            System.out.println("element not found!");
        }
        else
            System.out.println("Element found!");

//        to find minimum value in an array:
        System.out.println("The minimum value in the array is "+ search4(arr));
    }


//    index value
    static int search(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


//    to check if it is present or not:
    static boolean search2(int []arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }


//    element in a range:
    static boolean search3(int []arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for(int i=start;i<=end;i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }


//    minimum value:
    static int search4(int []arr){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int mini=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }
    static boolean searchS(String str,char find){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==find){
                return true;
            }
        }
        return false;
    }
    static boolean searchS2(String str,char find){
        if(str.length()==0){
            return false;
        }
        for(char c:str.toCharArray()){
            if(c==find){
                return true;
            }
        }
        return false;
    }
}
