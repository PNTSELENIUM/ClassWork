package DataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {

        Map<String, String> cityNCountry = new LinkedHashMap<>();
        cityNCountry.put("USA", "NY");
        cityNCountry.put("UK", "LONDON");
        cityNCountry.put("Canada", "MONTREAL");

        for(Map.Entry<String, String> state: cityNCountry.entrySet()){
            System.out.println(state.getKey() + "---->" + state.getValue());


        }

    }



}
