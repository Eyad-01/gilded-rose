package com.gildedrose;

public class agedbrieclass extends updaterclass {
    @Override
    public void update(Item item) {
        item.sellIn--;
        increaseQuality(item);
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }
}
