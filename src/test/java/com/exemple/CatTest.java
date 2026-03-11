package com.exemple;

import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline feline;

    Cat cat;

    @BeforeEach
    void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodCallsEatMeatTest() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.eatMeat()).thenReturn(food);
        assertEquals(food, cat.getFood());
    }
}
