package com.gildedrose.model;

import com.gildedrose.Item;

public class ConjuredItem extends BaseItem{
    public ConjuredItem(Item item) {
        super(item);
    }
    protected int qualityChange() {
        return super.qualityChange() * 2;
    }
}
