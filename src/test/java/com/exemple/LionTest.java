package com.exemple;

import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodCallsFelineGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);

        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

}
