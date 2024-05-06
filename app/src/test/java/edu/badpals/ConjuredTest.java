package edu.badpals;    
import edu.badpals.items.Conjured;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

class ConjuredTest{

    @ParameterizedTest
    @MethodSource("sellInValues")
    public void testSellIn(int initialSellIn, int expectedSellIn, int quality) {
        Conjured item = new Conjured("Conjured item", initialSellIn, quality);
        item.update_sellIn();
        assertEquals(expectedSellIn, item.getSellIn());
    }

    private static Stream<Arguments> sellInValues() {
        return Stream.of(
            Arguments.of(10, 9, 20),
            Arguments.of(-1, -2, 9),
            Arguments.of(0, -1, 10)
        );
    }

    @Test 
    public void testQuality1() {
        Conjured item = new Conjured("Conjured item", 10, 20);
        item.update_quality();
        assertEquals(18, item.getQuality());
    }

    @Test 
    public void testQuality2() {
        Conjured item = new Conjured("Conjured item", -1, 10);
        item.update_quality();
        assertEquals(6, item.getQuality());
    }

    @Test
    public void testQuality3() {
        Conjured item = new Conjured("Conjured item", 0, 10);
        item.update_quality();
        assertEquals(6, item.getQuality());
    }

    @Test
    public void testQuality4() {
        Conjured item = new Conjured("Conjured item", 1, 10);
        item.update_quality();
        assertEquals(8, item.getQuality()); }
}

