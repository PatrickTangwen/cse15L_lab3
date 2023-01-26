import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input2 = {1,2,3};
    ArrayExamples.reverseInPlace(input2);
    System.out.println(Arrays.toString(input2));
    assertArrayEquals(new int[]{3,2,1}, input2);
	}

  @Test
  public void testReversed2() {
    int[] input2 = {1,3,5,7};
    System.out.println(Arrays.toString(ArrayExamples.reversed(input2)));
    assertArrayEquals(new int[]{7,5,3,1}, ArrayExamples.reversed(input2));
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
	public void testAverageWithoutLowest() {
    double[] input1 = {6,6,6,6};
    double res = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(6, res,0);
	}


}
