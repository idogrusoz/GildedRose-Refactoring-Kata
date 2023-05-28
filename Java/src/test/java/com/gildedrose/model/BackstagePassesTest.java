package com.gildedrose.model;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassesTest {

    @Test
    void givenBackstagePasses_whenUpdated_thenItIncreasesInQuality() {
        BackstagePasses backstagePasses = new BackstagePasses(new Item("Backstage passes test", 15, 10));
        backstagePasses.update();
        assertEquals(11, backstagePasses.getQuality());
    }
}
