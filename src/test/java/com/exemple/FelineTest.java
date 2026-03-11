package com.exemple;

import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {

    Feline feline;

    @BeforeEach
    void  setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");

        assertEquals(food, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnOneTest() {
        assertEquals(1, feline.getKittens());
    }

}
