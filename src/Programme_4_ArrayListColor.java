/**
 *4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */


import java.util.ArrayList;
import java.util.List;

public class Programme_4_ArrayListColor {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
// for each loof
        for (String colours : colors) {
            System.out.println(colours);
        }
    }
}

