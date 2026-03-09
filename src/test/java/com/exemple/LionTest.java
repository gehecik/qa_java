package com.exemple;

import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Feline feline;

    @ParameterizedTest
    @MethodSource("kittensData")
    public void getKittensTest(String sex, int kittens) throws Exception {
        Lion lion = new Lion(sex, feline);

        Mockito.when(feline.getKittens()).thenReturn(kittens);
        assertEquals(kittens, lion.getKittens());
    }
    private static Stream<Arguments> kittensData() {
        return Stream.of(
                Arguments.of("Самец", 5),
                Arguments.of("Самка", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("maneData")
    public void doesHaveManeTest(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }
    private static Stream<Arguments> maneData() {
        return Stream.of(
                Arguments.of("Самец", true),
                Arguments.of("Самка", false)
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void getFoodValidTest(String sex) throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion(sex, feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        assertEquals(food, lion.getFood());
    }

    @Test
    public void lionTrowsException() {
        lionTrowsException(null);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "Гермафродит"})
    public void lionTrowsException(String sex) {
        assertThrows(Exception.class, () -> new Lion(sex, feline));
    }
}
