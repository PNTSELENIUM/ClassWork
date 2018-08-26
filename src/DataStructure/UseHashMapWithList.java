package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMapWithList {
    public static void main(String[] args) {

        List<String> CityOfUsa = new ArrayList<>();
        CityOfUsa.add("ny");
        CityOfUsa.add("fl");
        CityOfUsa.add("az");

        List<String> CityOfUk = new ArrayList<>();
        CityOfUk.add("london");
        CityOfUk.add("Manchester");
        CityOfUk.add("Chelsea");

        List<String> CityOfRd = new ArrayList<>();
        CityOfRd.add("santo domingo");
        CityOfRd.add("santiago");

        Map<String, List<String>> ListOfCountry = new HashMap<String, List<String>>();
        ListOfCountry.put("usa", CityOfUsa);
        ListOfCountry.put("UK", CityOfUk);
        ListOfCountry.put("RD", CityOfRd);

        for(Map.Entry<String, List<String>> state: ListOfCountry.entrySet()){

            System.out.println(state.getKey() + "---> " + state.getValue() );
        }





    }





}
