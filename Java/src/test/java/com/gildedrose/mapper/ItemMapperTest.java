package com.gildedrose.mapper;

import com.gildedrose.Item;
import com.gildedrose.model.BaseItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemMapperTest {

    @Test
    void givenOrdinaryItem_whenMapped_thenItReturnsBaseItem() {
        BaseItem testItem = ItemMapper.map(new Item("test item", 10, 10));
        assertEquals(BaseItem.class, testItem.getClass());
    }
}
