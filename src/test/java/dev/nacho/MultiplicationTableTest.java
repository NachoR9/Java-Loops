package dev.nacho;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {
    @Test
    void testMultiply() {
        List<Integer> expected = List.of(3, 6, 9, 12, 15, 18, 21, 24, 27, 30);
        List<Integer> result = MultiplicationTable.multiply(3);
        assertEquals(expected, result);

    }

}
