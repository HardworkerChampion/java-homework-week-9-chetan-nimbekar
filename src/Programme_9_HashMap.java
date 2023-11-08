import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme_9_HashMap {

    public static void main(String[] args) {


        Map <Integer,String> obj = new HashMap<>();
        obj.put(1, "Ferrari");
        obj.put(2,"Lamborgini ");
        obj.put(3,"Bugati");

        System.out.println(obj);
        for (Map.Entry<Integer,String> car: obj.entrySet()){

        }
        Iterator<Map.Entry<Integer,String >> carlist = obj.entrySet().iterator();
        while (carlist.hasNext()){
            System.out.println(carlist.next() + " ");
        }

    }
}