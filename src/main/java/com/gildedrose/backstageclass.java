package com.gildedrose;

public class backstageclass extends updaterclass {
    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            increaseQuality(item);
            if (item.sellIn <= 10) increaseQuality(item);
            if (item.sellIn <= 5) increaseQuality(item);
        }
    }
}
