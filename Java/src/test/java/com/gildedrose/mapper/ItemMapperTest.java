package com.gildedrose.mapper;

import com.gildedrose.Item;
import com.gildedrose.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemMapperTest {

    @Test
    void givenOrdinaryItem_whenMapped_thenItReturnsBaseItem() {
        BaseItem testItem = ItemMapper.map(new Item("test item", 10, 10));
        assertEquals(BaseItem.class, testItem.getClass());
    }

    @Test
    void givenAgedBrie_whenMapped_thenItReturnsMaturingItem() {
        BaseItem testItem = ItemMapper.map(new Item("Aged Brie test item", 10, 10));
        assertEquals(MaturingItem.class, testItem.getClass());
    }

    @Test
    void givenSulfuras_whenMapped_thenItReturnsLegendaryItem() {
        BaseItem testItem = ItemMapper.map(new Item("Sulfuras test item", 10, 10));
        assertEquals(LegendaryItem.class, testItem.getClass());
    }

    @Test
    void givenBackstagePasses_whenMapped_thenItReturnsBackStagePasses() {
        BaseItem testItem = ItemMapper.map(new Item("Backstage passes test item", 10, 10));
        assertEquals(BackstagePasses.class, testItem.getClass());
    }

    @Test
    void givenConjuredItems_whenMapped_thenItReturnsConjuredItems() {
        BaseItem testItem = ItemMapper.map(new Item("Conjured test item", 10, 10));
        assertEquals(ConjuredItem.class, testItem.getClass());
    }
}
