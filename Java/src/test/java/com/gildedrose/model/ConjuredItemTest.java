package com.gildedrose.model;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuredItemTest {

    @Test
    void givenConjuredItem_whenUpdated_thenItDegradesTwiceQuicker() {
        ConjuredItem conjuredItem = new ConjuredItem(new Item("Conjured test item", 10, 10));
        conjuredItem.update();
        assertEquals(8, conjuredItem.getQuality());
    }

    @Test
    void givenExpiredConjuredItem_whenUpdated_thenItDegradesTwiceQuicker() {
        ConjuredItem conjuredItem = new ConjuredItem(new Item("Conjured test item", 0, 10));
        conjuredItem.update();
        assertEquals(6, conjuredItem.getQuality());
    }
}
