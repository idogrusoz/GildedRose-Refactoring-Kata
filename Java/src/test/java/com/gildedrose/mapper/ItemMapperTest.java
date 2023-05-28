package com.gildedrose.mapper;

import com.gildedrose.Item;
import com.gildedrose.model.BaseItem;
import com.gildedrose.model.MaturingItem;
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
}
