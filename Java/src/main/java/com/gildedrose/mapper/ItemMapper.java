package com.gildedrose.mapper;

import com.gildedrose.Item;
import com.gildedrose.model.BaseItem;
import com.gildedrose.model.MaturingItem;

import java.util.Arrays;
import java.util.List;

public class ItemMapper {

    private static final List<String> MATURING_KEYWORDS = Arrays.asList("Aged Brie");

    public static BaseItem map(Item item) {
        if (MATURING_KEYWORDS.stream().anyMatch(keyword -> item.name.contains(keyword))) {
            return new MaturingItem(item);
        } else {
            return new BaseItem(item);
        }
    }
}
