import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {
    public static void main(String[] args)  {

        Map<String, String> names = new HashMap();

        names.put("artem","denisov");
        names.put("bogdan","demchenkov");
        names.put("artem","petuxov");
        names.put("alex","eremenkov");
        names.put("petr","grigoran");
        names.put("igor","babaev");
        names.put("bogdan","titomir");
        names.put("vadim","kirillov");
        names.put("nikola","vlashich");
        names.put("leonardo","bonuchi");

        removeDuplicates(names);
        System.out.println(names);

    }


    public static <N, S> void removeDuplicates(Map<N, S> names) {

        Map<N, S> goodnames = new HashMap();
        for (Iterator<N> it = names.keySet().iterator(); it.hasNext();) {
            N name = it.next();
            S val = names.get(name);
            if (! goodnames.containsValue(val)) {
                goodnames.put(name, val);
            }
        }


        names.clear();



        for (Iterator<N> a =  goodnames.keySet().iterator(); a.hasNext();) {
            N key = a.next();
            names.put((N)  goodnames.get(key), (S) key);
        }
    }
}