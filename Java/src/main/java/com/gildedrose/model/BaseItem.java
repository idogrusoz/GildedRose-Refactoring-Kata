package com.gildedrose.model;

import com.gildedrose.Item;

public class BaseItem {
    private final Item item;
    protected final static int MIN_QUALITY = 0;
    protected final static int DEFAULT_MAX_QUALITY = 50;

    public BaseItem(Item item) {
        validate(item);
        this.item = item;
    }

    private void validate(Item item) {
        if(item.quality < MIN_QUALITY || item.quality > getMaxQuality()) {
            throw new IllegalArgumentException(
                "Item has a quality out of accepted boundaries. Quality value fot this type of item must be between "
                    + MIN_QUALITY
                    + " and "
                    + getMaxQuality()
                    +  " but received "
                    + item.quality
            );
        }
    }

    protected int getMaxQuality() {
        return DEFAULT_MAX_QUALITY;
    }

    public int getSellIn() {
        return item.sellIn;
    }

    public void setSellIn(int sellIn) {
        item.sellIn = sellIn;
    }

    public void update() {
        updateSellIn();
        updateQuality();
    }

    protected void updateSellIn() {
        setSellIn(getSellIn() - 1);
    }

    public int getQuality() {
        return item.quality;
    }

    public void setQuality(int quality) {
        item.quality = keepQualityInAcceptableRange(quality);
    }

    private int keepQualityInAcceptableRange(int quality) {
        return Math.min(Math.max(quality, MIN_QUALITY), getMaxQuality());
    }

    private void updateQuality() {
        setQuality(getQuality() + qualityChange());
    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }

    protected int qualityChange() {
        return isExpired() ? -2 : -1;
    }
}

