package com.exemple;

import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParamTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 0})
    public void getKittensCountsTest(int kittensCount) {
        Feline feline = new Feline();

        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

}
