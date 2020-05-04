package my.sudoku;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
    //       Problem problem = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            //String json = "{\"id\":20, \"name\":\"HOGE\"}";
            //String json = "{\"0,0\" : 5, \"0,1\" : 3}";
            Map<String, Integer> scoreByName = mapper.readValue("mondai.json", HashMap.class);
            //Map<String, Integer> scoreByName = mapper.readValue(json, HashMap.class);
            System.out.println(scoreByName);
        }
        catch (IOException e) {
            e.printStackTrace();
            }
    }

}