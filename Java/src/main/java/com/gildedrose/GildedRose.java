package com.gildedrose;

import com.gildedrose.mapper.ItemMapper;
import com.gildedrose.model.BaseItem;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).map(ItemMapper::map).forEach(BaseItem::update);
    }
}
