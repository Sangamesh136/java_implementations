class Demo{
    public static void main (String[] args){
        int[] arr = {1, 2};
        swap(arr[0], arr[1]);
        System.out.println(arr[0] +" "+ arr[1]);
    }
    static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("second");
        System.out.println(a +" "+ b);
    }
}