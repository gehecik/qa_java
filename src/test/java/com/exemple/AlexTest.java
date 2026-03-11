package com.exemple;

import com.example.Alex;
import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AlexTest {

    @Mock
    Feline feline;

    Alex alex;

    @BeforeEach
    void setUp() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void getPlaceOfLivingTest() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getFriendsTest() throws Exception {
        List<String> friends = List.of("Марти", "Глория", "Мелман");

        assertEquals(friends, alex.getFriends());
    }
}
