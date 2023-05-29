package com.gildedrose.mapper;

import com.gildedrose.Item;
import com.gildedrose.model.*;

import java.util.Arrays;
import java.util.List;

public class ItemMapper {

    private static final List<String> MATURING_KEYWORDS = Arrays.asList("Aged Brie");
    private static final List<String> LEGENDARY_KEYWORDS = Arrays.asList("Sulfuras");
    private static final List<String> BACKSTAGE_PASSES_KEYWORDS = Arrays.asList("Backstage passes");
    private static final List<String> CONJURED_KEYWORDS = Arrays.asList("Conjured");

    public static BaseItem map(Item item) {
        if (MATURING_KEYWORDS.stream().anyMatch(keyword -> item.name.contains(keyword))) {
            return new MaturingItem(item);
        } else if(LEGENDARY_KEYWORDS.stream().anyMatch(keyword -> item.name.contains(keyword))) {
            return new LegendaryItem(item);
        } else if(BACKSTAGE_PASSES_KEYWORDS.stream().anyMatch(keyword -> item.name.contains(keyword))) {
            return new BackstagePasses(item);
        } else if(CONJURED_KEYWORDS.stream().anyMatch(keyword -> item.name.contains(keyword))) {
            return new ConjuredItem(item);
        } else {
            return new BaseItem(item);
        }
    }
}
