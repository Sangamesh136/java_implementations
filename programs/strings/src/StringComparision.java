public class StringComparision {
    public static void main(String[]args){
//        creating different veriables pointing to the same object in string
        String a="Sam";
        String b="Sam";
        System.out.println(a==b);
//        it returns true cuz, both the reference variables point towards the same object "Sam". They point towards the same object because, they have same values and as a result, present in the string pool


//        now creating different objects even though they have same values
        String c = new String("Sam");
        String d = new String("Sam");
        System.out.println(c==d);
//       it returns false as both the reference variables are now pointing towards different objects.

//        to compare only the values irrespective of the object they are pointing to we use .equals
        System.out.println(c.equals(d));
//        here the output is true as they have same values but are different objects

//        to get character at some index in an array we use vari.charAt()
        System.out.println(c.charAt(1));
        float e=123.456f;
        System.out.printf("formatted output upto 2 decimal values %.2f \n",e);

        System.out.println(Math.PI);
        System.out.printf("formatted output upto 2 decimal values %.2f",Math.PI);
    }
}
