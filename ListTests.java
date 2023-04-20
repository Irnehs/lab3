import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input = Arrays.asList("hi", "apple", "pear");
        assertEquals(Arrays.asList("apple", "pear"), ListExamples.filter(input, s -> s.contains("a")));
    }

    @Test
    public void testMerge() {
        List<String> input1 = Arrays.asList("a", "cc", "eee");
        List<String> input2 = Arrays.asList("b", "de", "f");
        assertEquals(Arrays.asList("a", "b", "cc", "de", "eee", "f"), ListExamples.merge(input1, input2));
    }

}
