package com.gildedrose.model;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaturingItemTest {

    @Test
    void givenMaturingItem_whenUpdated_thenItIncreasesInQuality() {
        MaturingItem maturingItem = new MaturingItem(new Item("Aged Brie test", 10, 10));
        maturingItem.update();
        assertEquals(11, maturingItem.getQuality());
    }

    @Test
    void givenMaturingItemWithMaxQuality_whenUpdated_thenQualityRemainsTheSame() {
        MaturingItem maturingItem = new MaturingItem(new Item("Aged Brie test", 10, BaseItem.DEFAULT_MAX_QUALITY));
        maturingItem.update();
        assertEquals(BaseItem.DEFAULT_MAX_QUALITY, maturingItem.getQuality());
    }
}
