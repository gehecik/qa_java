package com.exemple;

import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensMaleTest() throws Exception{
        Lion lion = new Lion("Самец", feline);

        Mockito.when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }

    @Test
    public void getKittensFemaleTest() throws Exception{
        Lion lion = new Lion("Самка", feline);

        Mockito.when(feline.getKittens()).thenReturn(4);
        assertEquals(4, lion.getKittens());
    }
}
