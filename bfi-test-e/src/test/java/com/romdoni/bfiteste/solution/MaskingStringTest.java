package com.romdoni.bfiteste.solution;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MaskingStringTest {

    @Test
    void TestSolution(){
        MaskingString maskingString = new MaskingString();
        HashMap<String,String> checks = new HashMap<String, String>();

        checks.put("Tony Stark", "T**y S***k");
        checks.put("Peter Parker", "P***r P****r");
        checks.put("Bumblebee", "B*******e");
        checks.put("El Taurino", "El T*****o");
        checks.put("John Doe", "J**n D*e");
        checks.put("Crazy Rich Asian", "C***y R**h A***n");
        checks.put("Stephen Strange", "S*****n S*****e");
        checks.put("A Kid With Supernatural Abilities", "A K*d W**h S**********l A*******s");

        checks.forEach((original, masked) -> assertEquals(maskingString.mask(original), masked));
    }

}