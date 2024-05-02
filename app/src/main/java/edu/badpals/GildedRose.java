package edu.badpals;
import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    List<Item> Updateable;

    public GildedRose() {
        Updateable = new ArrayList<>();
    }

    public void update_item() {
        for (Item item : Updateable) {
           update_quality(item);
           update_sellIn(item);
        }
    }
}