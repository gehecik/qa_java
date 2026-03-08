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

}
