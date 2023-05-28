package com.gildedrose.model;

import com.gildedrose.Item;

public class BackstagePasses extends BaseItem{
    public static final int CONCERT_IS_SOON = 10;
    public BackstagePasses(Item item) {
        super(item);
    }

    protected int qualityChange() {
        if(isConcertSoon()) {
            return 2;
        } else {
            return 1;
        }
    }

    private boolean isConcertSoon() {
        return getSellIn() <= CONCERT_IS_SOON;
    }
}
