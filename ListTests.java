import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.*;

public class ListTests {

    @Test
    public void testFilter() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("real", "barca", "united", "city"));
        MyStringChecker sc = new MyStringChecker();
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("barca", "united", "city"));
        
        assertEquals(expectedOutput, ListExamples.filter(input, sc));
    }

    @Test
    public void testMerge() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("barca", "real"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("city", "united"));
        List<String> mergedList = ListExamples.merge(list1, list2);

        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("barca", "city", "real", "united"));
        assertEquals(expectedOutput, mergedList);
    }
}
