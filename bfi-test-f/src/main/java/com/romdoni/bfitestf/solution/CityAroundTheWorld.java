package com.romdoni.bfitestf.solution;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import info.debatty.java.stringsimilarity.JaroWinkler;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CityAroundTheWorld {
    public List<String> find(String cityName, String countryCode){
        String stringURL = "https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json";
        JaroWinkler jaroWinkler=new JaroWinkler();
        List<String> result = new ArrayList<>();

        try {
            URL url = new URL(stringURL);
            URLConnection request = url.openConnection();
            request.connect();
            JsonParser jsonParser = new JsonParser();
            JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonArray array = root.getAsJsonArray();

            for (JsonElement element: array) {
                JsonObject object = element.getAsJsonObject();
                String country = object.get("country").getAsString();
                String name = object.get("name").getAsString();

                if (country.equals(countryCode)&&jaroWinkler.distance(name,cityName)<=0.26){
                    result.add(name);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
