package com.gildedrose.model;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryItemTest {

    @Test
    void givenALegendaryItem_whenUpdated_thenSellInValueRemainsTheSame() {
        LegendaryItem legendaryItem = new LegendaryItem(new Item("Sulfuras test item", 0, 10));
        legendaryItem.update();
        assertEquals(0, legendaryItem.getSellIn());
    }

    @Test
    void givenALegendaryItem_whenUpdated_thenQualityRemainsTheSame() {
        LegendaryItem legendaryItem = new LegendaryItem(new Item("Sulfuras test item", 0, 10));
        legendaryItem.update();
        assertEquals(10, legendaryItem.getQuality());
    }

}
