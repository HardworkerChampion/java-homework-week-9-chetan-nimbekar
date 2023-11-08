import java.util.HashSet;
import java.util.Iterator;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> number = new HashSet();
        number.add(4);
        number.add(7);
        number.add(8);

        System.out.println("Numbers are " + number);

        for (Integer num : number){
            System.out.println(num + " ");
        }
        Iterator<Integer> list = number.iterator();
        while (list.hasNext()){
            System.out.println(list.next() + " ");
        }



    }

}
