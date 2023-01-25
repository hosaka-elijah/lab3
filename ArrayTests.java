import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {3, 6, 9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{9,6,3}, input1);
  }

  @Test
  public void testReverse2() {
    int[] input1 = {3, 6, 9};
    assertArrayEquals(new int[]{9,6,3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input = {1,6,6,6,6,6};
    assertEquals(6, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input = {2,2,6,6,6,6,6};
    assertEquals(6, ArrayExamples.averageWithoutLowest(input), 0.001);
  }
}
