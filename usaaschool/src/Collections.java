import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //List -ArrayLIst
        //Values ordered according insertion
        //Allows duplicates
        //Index based order
        System.out.println("*****List*****");
        List<String> months = new ArrayList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("March");
        months.add("March");

        System.out.println("months = " + months);

        months.add(1, "December");

        System.out.println("months = " + months);

        String month = months.remove(3);

        System.out.println("months = " + months);

        System.out.println(months.get(0));

        System.out.println(months.size());





        //no natural order
        //No duplicates
        //Fastest collection
        System.out.println("*****Set*****");

        Set<String> cities = new HashSet<>();

        cities.add("GDL");
        cities.add("MTY");
        cities.add("CDMX");
        cities.add("GDL");
        cities.add("GDL");
        cities.add("GDL");

        System.out.println("cities = " + cities);

        boolean city = cities.remove("GDL");
        System.out.println("cities = " + cities);

        System.out.println(cities.size());
        System.out.println(cities.contains("BCS"));


        for(String element : cities){
            System.out.println(element);
        }


        //Pairs of <K,V>
        //No duplicate Keys
        //in case of HashMap, no natural order

        System.out.println("*****Map*****");

        Map<Integer, String> workers = new HashMap<>();


        workers.put(1, "Pedro");
        workers.put(2, "Luis");
        workers.put(3, "Raul");
        workers.put(1, "Luis");

        System.out.println("workers = " + workers);

        System.out.println(workers.size());
        System.out.println(workers.values());//list of values
        System.out.println(workers.keySet());//llist of keys
        System.out.println(workers.get(4));

    }
}
