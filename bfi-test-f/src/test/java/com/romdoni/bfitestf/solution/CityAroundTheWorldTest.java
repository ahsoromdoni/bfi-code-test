package com.romdoni.bfitestf.solution;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CityAroundTheWorldTest {
    @Test
    void TestFind(){
        CityAroundTheWorld cityAroundTheWorld = new CityAroundTheWorld();
        HashMap<String,Integer> checks = new HashMap<String, Integer>();
        String countryCode = "ID";

        checks.put("sisayang",1);
        checks.put("pulxu pqnjzng",1);
        checks.put("zogjakarta",1);

        checks.forEach((word, similiarWords) -> assertTrue(cityAroundTheWorld.find(word,countryCode).size() >= similiarWords));
    }
}