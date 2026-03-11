package com.exemple;

import com.example.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnimalParamTest {

    Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal();
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", "Всеядные"})
    public void getFoodExceptionTest(String animalKind) {
        Exception exception = assertThrows(Exception.class, () -> animal.getFood(animalKind));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage());
    }

    @ParameterizedTest
    @MethodSource("animalAndFoodData")
    public void getFoodTest(String animalKind, List<String> expected) throws Exception {
        List<String> food = animal.getFood(animalKind);

        assertEquals(expected, food);
    }
    private static Stream<Arguments> animalAndFoodData() {
        return Stream.of(
                Arguments.of("Травоядное", List.of("Трава", "Различные растения")),
                Arguments.of("Хищник", List.of("Животные", "Птицы", "Рыба"))
        );
    }

}
