package com.gildedrose.model;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseItemTest {

    @Test
    void itEncapsulatesTheSellInValueOfTheItem() {
        BaseItem baseItem = new BaseItem(new Item("test_item", 10, 20));
        assertEquals(10, baseItem.getSellIn());
    }

    @Test
    void itMutatesTheSellInValueOfTheItem() {
        BaseItem baseItem = new BaseItem(new Item("test_item", 10, 20));
        baseItem.setSellIn(9);
        assertEquals(9, baseItem.getSellIn());
    }
    @Test
    void givenABaseItem_whenUpdated_thenSellInDecrements() {
        BaseItem testItem = new BaseItem(new Item("test_item", 10, 10));
        testItem.update();
        assertEquals(9, testItem.getSellIn());
    }
    @Test
    void itEncapsulatesTheQualityValueOfTheItem() {
        BaseItem baseItem = new BaseItem(new Item("test_item", 10, 20));
        assertEquals(20, baseItem.getQuality());
    }

    @Test
    void itMutatesTheQualityValueOfTheItem() {
        BaseItem baseItem = new BaseItem(new Item("test_item", 10, 20));
        baseItem.setQuality(19);
        assertEquals(19, baseItem.getQuality());
    }

    @Test
    void givenABaseItem_whenUpdated_thenQualityDecrements() {
        BaseItem testItem = new BaseItem(new Item("test_item", 10, 10));
        testItem.update();
        assertEquals(9, testItem.getQuality());
    }

    @Test
    void givenAnItemWithPastSellInDate_itIsExpired() {
        BaseItem testItem = new BaseItem(new Item("test_item", -1, 10));
        assertTrue(testItem.isExpired());
    }

    @Test
    void givenAnExpiredBaseItem_whenUpdated_thenQualityDecrementsByTwo() {
        BaseItem testItem = new BaseItem(new Item("test_item", 0, 10));
        testItem.update();
        assertEquals(8, testItem.getQuality());
    }

    @Test
    void givenABaseItemWithZeroQuality_whenUpdated_thenQualityIsNeverNegative() {
        BaseItem testItem = new BaseItem(new Item("test_item", 0, 0));
        testItem.update();
        assertEquals(0, testItem.getQuality());
    }

    @Test
    void givenAnExpiredBaseItemWithQualityOne_whenUpdated_thenQualityIsNeverNegative() {
        BaseItem testItem = new BaseItem(new Item("test_item", -1, 1));
        testItem.update();
        assertEquals(0, testItem.getQuality());
    }
}
