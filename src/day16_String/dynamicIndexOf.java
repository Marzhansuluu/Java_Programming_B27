package day16_String;

public class dynamicIndexOf {
    public static void main(String[] args) {
        String str = "definition";
        //            0123456789
        // goal is to find all the indexes of all the 'i' characters
        System.out.println("First i: " + str.indexOf('i'));// 3
        System.out.println("Last i: " +str.lastIndexOf('i') );// 7
        // to find the index value of middle 'i' which is 5:

        System.out.println("other use of index of: ");
        System.out.println("First i: " + str.indexOf('i'));// 3
        System.out.println("Second i: " + str.indexOf('i' , 4));// basically '4' is in here index number, str.indexOf('i', 4) basically we are looking for i after index number of 4. we will get 5 because we are looking for next 'i' starting index number of 4.
        System.out.println("Third i: " + str.lastIndexOf('i'));// we will get 7.

        System.out.println("Hard coded above ===========Dynamic below");

//        int firstI = str.indexOf('i');
//        int secondI = str.indexOf('i' , firstI + 1);// take previous index number and add 1 to it, so we can start looking for the next occurrence.
//        int thirdI = str.indexOf('i' , secondI + 1);
//        System.out.println("First i: " + firstI);
//        System.out.println("second i: " + secondI);
//        System.out.println("Third i: " + thirdI);



    }
}
