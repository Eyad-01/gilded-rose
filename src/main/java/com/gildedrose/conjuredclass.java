package com.gildedrose;

public class conjuredclass extends updaterclass {
    @Override
    public void update(Item item) {
        item.sellIn--;

        decreaseQuality(item);
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
            decreaseQuality(item);
        }
    }
}
