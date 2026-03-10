package com.exemple;

import com.example.Feline;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of("Животные", "Птицы", "Рыба");

        assertEquals(food, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }



}
