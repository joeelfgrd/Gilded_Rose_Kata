package edu.badpals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class NormalItemTest {

    @ParameterizedTest
    @MethodSource("sellInValues")
    public void testSellIn(int initialSellIn, int expectedSellIn, int quality) {
        Item item = new Item("Dexterity Vest", initialSellIn, quality);
        item.update_sellIn();
        assertEquals(expectedSellIn, item.getSellIn());
    }

    private static Stream<Arguments> sellInValues() {
        return Stream.of(
            Arguments.of(10, 8, 20),
            Arguments.of(-1, -2, 9),
            Arguments.of(0, -1, 10)
        );
    }
}
