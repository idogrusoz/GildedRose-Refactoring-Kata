package com.gildedrose.mapper;

import com.gildedrose.Item;
import com.gildedrose.model.BaseItem;

public class ItemMapper {
    public static BaseItem map(Item item) {
        return new BaseItem(item);
    }
}
