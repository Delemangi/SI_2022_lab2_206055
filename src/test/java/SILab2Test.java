import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SILab2Test {
    @Test
    void everyStatementTest() {
        // 1
        List<String> list1 = List.of();
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));

        // 2
        List<String> list2 = List.of("0#0".split(""));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(list2));

        // 3
        List<String> list3 = List.of("0###0####".split(""));
        assertEquals(List.of("2###4####".split("")), SILab2.function(list3));
    }

    @Test
    void everyBranchTest() {
        // 1
        List<String> list1 = List.of();
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));

        // 2
        List<String> list2 = List.of("0#0".split(""));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(list2));

        // 3
        List<String> list3 = List.of("0#000##0#".split(""));
        assertEquals(List.of("1#212##2#".split("")), SILab2.function(list3));
    }
}
