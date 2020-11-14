import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main1 {
    public static void main(String[] args){
        Map<String, ArrayList<String>> cities = new HashMap();

        ArrayList<String> country = new ArrayList<>();
        country.add("Москва");
        country.add("Кыштым");
        country.add("Казань");
        country.add("Санкт-Петербуг");

        ArrayList<String> country1 = new ArrayList<>();
        country1.add("Берлин");
        country1.add("Гамбург");
        country1.add("Дортмунд");


        cities.put("Россия", country);
        cities.put("Германия", country1);


        //вывод
        System.out.println(cities);
        System.out.println(cities.get("Россия"));
    }
}