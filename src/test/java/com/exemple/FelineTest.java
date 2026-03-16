package com.exemple;

import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FelineTest {

    Feline feline;

    @Spy
    Feline feline1 = new Feline();

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
        feline1.getKittens();
        Mockito.verify(feline1).getKittens(1);
    }

}
