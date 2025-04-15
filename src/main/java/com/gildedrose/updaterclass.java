package com.gildedrose;

public class updaterclass {

    public void update(Item item) {
        item.sellIn--;
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    protected void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    protected void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
