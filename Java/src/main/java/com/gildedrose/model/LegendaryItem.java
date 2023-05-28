package com.gildedrose.model;

import com.gildedrose.Item;

public class LegendaryItem extends BaseItem{
    public LegendaryItem(Item item) {
        super(item);
    }



    protected void updateSellIn() {
        //Legendary item never has to be sold
    }

    protected int qualityChange() {
        return 0;
    }
}
