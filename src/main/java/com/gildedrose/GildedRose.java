package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            boolean isBackstage = item.name.equals("Backstage passes to a TAFKAL80ETC concert");
            boolean isSulfuras = item.name.equals("Sulfuras, Hand of Ragnaros");
            boolean isAgedBrie = item.name.equals("Aged Brie");
            if (!isAgedBrie && !isBackstage) {
                if (!isSulfuras) {
                    decreaseQuality(item);
                }
            } else {
                increaseQuality(item);

                if (isBackstage) {
                    if (item.sellIn < 11) increaseQuality(item);
                    if (item.sellIn < 6) increaseQuality(item);
                }
            }

            if (!isSulfuras) {
                item.sellIn--;
            }

            if (item.sellIn < 0) {
                if (isAgedBrie) {
                    increaseQuality(item);
                } else if (isBackstage) {
                    item.quality = 0;
                } else {
                    if (!isSulfuras) {
                        decreaseQuality(item);
                    }
                }
            }
        }
    }
    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

}