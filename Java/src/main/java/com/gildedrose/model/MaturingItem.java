package com.gildedrose.model;

import com.gildedrose.Item;

public class MaturingItem extends BaseItem{
    public MaturingItem(Item item) {
        super(item);
    }

    protected int qualityChange() {
        return 1;
    }
}
