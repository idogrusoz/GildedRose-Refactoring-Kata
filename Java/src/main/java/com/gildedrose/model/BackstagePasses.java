package com.gildedrose.model;

import com.gildedrose.Item;

public class BackstagePasses extends BaseItem{
    public BackstagePasses(Item item) {
        super(item);
    }

    protected int qualityChange() {
        return 1;
    }
}
