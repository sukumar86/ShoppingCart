package com.shoppingtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class shoppingtest {



    @Test
    void CartIsEmpty() {

        // Act
        boolean actual = cart.isEmpty();
        boolean expected = true;
        /* Assert */
       assertEquals(true, actual);


    }

    @Test
    void SubTotalTest() {
        cart newItem = new cart();
        double actual = newItem.addItem("hat", 10.50);
        actual = newItem.addItem("table", 20.00);
        assertEquals(30.50, actual);
    }
}
