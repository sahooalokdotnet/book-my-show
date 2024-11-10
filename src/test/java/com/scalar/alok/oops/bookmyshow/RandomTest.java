package com.scalar.alok.oops.bookmyshow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RandomTest {
    @Test
    public void Calculator()
    {
        //Arrange
        int x = 10; int y = 20;
        //Act
        int result = Add(x, y);
        //assert
        assertEquals(30,result, "Hello.");
    }
    private int Add(int a, int b)
    {
        return a + b;
    }
}
