/**
 * 11. Declare following two Arrylist and compare it.
 */

import java.util.ArrayList;

public class Programme_11_ArrayList_Compare {

    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Display both ArrayList
        System.out.println("Colors = " + c1);
        System.out.println("New Colors = " + c2);

        //compare ArrayList1 ArrayList2
        if (c1.equals(c2) == false) {
            System.out.println("Colors and New Colors are not equal");
        }


    }


}
