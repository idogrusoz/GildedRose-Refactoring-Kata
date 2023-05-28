package com.gildedrose.model;

import com.gildedrose.Item;

public class BackstagePasses extends BaseItem{
    public static final int CONCERT_IS_SOON = 10;
    public static final int CONCERT_IS_IMMINENT = 5;
    public BackstagePasses(Item item) {
        super(item);
    }

    protected int qualityChange() {
        if (isConcertImminent()) {
            return 3;
        } else if(isConcertSoon()) {
            return 2;
        } else {
            return 1;
        }
    }

    private boolean isConcertSoon() {
        return getSellIn() <= CONCERT_IS_SOON;
    }

    private boolean isConcertImminent() {
        return getSellIn() <= CONCERT_IS_IMMINENT;
    }
}
