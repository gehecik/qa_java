package com.exemple;

import com.example.Alex;
import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlexTest {

    Feline feline = new Feline();
    Alex alex;

    @BeforeEach
    void setUp() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void setMaleTest() {
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void getKittensTest() {
        assertEquals(0, alex.getKittens());
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
