package edu.badpals;
import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<Item> Updateable; 

    public GildedRose(Item[] items) {
        Updateable = new ArrayList<>();
    }

    public void update_item() {
        for (Item Updateable : Updateable) {
            Updateable.update_quality();
            Updateable.update_sellIn();
        }
    }

    public Item[] getItems() {
        return Updateable.toArray(new Item[0]);
    }

     
}