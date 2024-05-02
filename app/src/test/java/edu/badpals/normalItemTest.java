package edu.badpals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class normalItemTest {
    @Test
    public void testSellInPositive() {
        Item item = new Item("Dexterity Vest", 10, 20);
        item.update_sellIn();
        assertEquals(9, item.getSellIn());
    }
    @Test
    public void testSellInNegative(){
        Item item = new Item("Dexterity Vest",-1,8);
        item.update_sellIn();
        assertEquals(6,item.getSellIn());
    }
}