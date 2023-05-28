package com.gildedrose.model;

import com.gildedrose.Item;

public class LegendaryItem extends BaseItem{
    protected final static int LEGENDARY_MAX_QUALITY = 80;
    public LegendaryItem(Item item) {
        super(item);
    }

    protected int getMaxQuality() {
        return LEGENDARY_MAX_QUALITY;
    }

    protected void updateSellIn() {
        //Legendary item never has to be sold
    }

    protected int qualityChange() {
        return 0;
    }
}
