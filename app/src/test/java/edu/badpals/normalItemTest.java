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

        assertEquals(-2,item.getSellIn());
    }
    @Test
    public void testSellInZero(){
        Item item = new Item("Dexterity Vest",0,8);
        item.update_sellIn();
        assertEquals(-1,item.getSellIn()); 
    }
    @Test
    public void 
    ///hacer test parametrizados///
}