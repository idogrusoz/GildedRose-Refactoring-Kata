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

    @Test
    void givenBackstagePassesForAConcertToBeHeldSoon_whenUpdated_thenItIncreasesDoubleInQuality() {
        BackstagePasses backstagePasses = new BackstagePasses(new Item("Backstage passes test", BackstagePasses.CONCERT_IS_SOON, 20));
        backstagePasses.update();
        assertEquals(22, backstagePasses.getQuality());
    }

    @Test
    void givenBackstagePassesForAnImminentConcert_whenUpdated_thenItIncreasesTripleInQuality() {
        BackstagePasses backstagePasses = new BackstagePasses(new Item("Backstage passes test", BackstagePasses.CONCERT_IS_IMMINENT, 10));
        backstagePasses.update();
        assertEquals(13, backstagePasses.getQuality());
    }

    @Test
    void givenBackstagePasses_whenUpdated_thenItNeverSurpassesTheMaxQuality() {
        BackstagePasses backstagePasses = new BackstagePasses(new Item("Backstage passes test", BackstagePasses.CONCERT_IS_IMMINENT, BaseItem.DEFAULT_MAX_QUALITY - 1));
        backstagePasses.update();
        assertEquals(BaseItem.DEFAULT_MAX_QUALITY, backstagePasses.getQuality());
    }
}
