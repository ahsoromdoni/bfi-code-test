package com.romdoni.bfitestd.solution;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class LargestNegativeNumberTest {
    @Test
    void testFind(){
        LargestNegativeNumber largestNegativeNumber = new LargestNegativeNumber();
        HashMap<Integer[], Integer> checks = new HashMap<Integer[], Integer>();

        checks.put(new Integer[] { 3, 2, -5, 0 }, -1);
        checks.put(new Integer[] { 10, -1, -2, -3 }, -4);
        checks.put(new Integer[] { 100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5 }, -6);
        checks.put(new Integer[] { 0, 2, 4, -1, -3, -4 }, -2);
        checks.put(new Integer[] { 3, 2, -5, -1, -2, 0 }, -3);

        checks.forEach((problem, solution) -> assertTrue(largestNegativeNumber.find(problem) == solution));
    }

}