package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updaterclass updater;

            switch (item.name) {
                case "Aged Brie":
                    updater = new agedbrieclass();
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updater = new backstageclass();
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    updater = new sulfurasclass();
                    break;
                default:
                    updater = new updaterclass();
                    break;
            }

            updater.update(item);
        }
    }
}
