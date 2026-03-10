package com.exemple;

import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    public void getKittensReturnOneTest() {
        Feline feline = new Feline();

        assertEquals(1, feline.getKittens());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 0, -1}) // значение -1 проходит
    public void getKittensCountsTest(int kittensCount) {
        Feline feline = new Feline();

        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
