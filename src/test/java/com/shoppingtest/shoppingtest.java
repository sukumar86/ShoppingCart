package com.shoppingtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class shoppingtest {

    @BeforeEach
    void setUp() {
       }


    @Test
    void CartIsEmpty() {
        // Arrange
        cart newItem = new cart();
        // Act
        boolean actual = cart.isEmpty();
        boolean expected = true;
        /* Assert */
       assertEquals(true, actual);


    }
}
