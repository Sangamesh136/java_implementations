
//Find the element the is present only once in the array:
public class SingleArrayELement {
    public static void main(String[] args){
        int [] arr ={2,1,3,4,5,5,4,3,2};
        System.out.println(findNum(arr));
    }
    public static int findNum(int [] arr){
        int element = 0;
        for(int i : arr){
             element = i^(i+1);
        }
        return element;
    }
    
    
}
