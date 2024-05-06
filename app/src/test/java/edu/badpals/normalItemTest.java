package edu.badpals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class normalItemTest {

    @ParameterizedTest
    @MethodSource("sellInValues")
    public void testSellIn(int initialSellIn, int expectedSellIn, int quality) {
        normalItem item = new normalItem("Dexterity Vest", initialSellIn, quality);
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
        normalItem item = new normalItem("Dexterity Vest", 10, 20);
        item.update_quality();
        assertEquals(19, item.getQuality());
    }

    @Test 
    public void testQuality2() {
        normalItem item = new normalItem("Dexterity Vest", -1, 10);
        item.update_quality();
        assertEquals(8, item.getQuality());
    }

    @Test
    public void testQuality3() {
        normalItem item = new normalItem("Dexterity Vest", 0, 10);
        item.update_quality();
        assertEquals(8, item.getQuality());
    }

    @Test
    public void testQuality4() {
        normalItem item = new normalItem("Dexterity Vest", 1, 10);
        item.update_quality();
        assertEquals(9, item.getQuality());
    }
}
