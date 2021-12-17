import org.junit.Assert;
import org.junit.Test;

public class MainAppTest {

    @Test
    public void testInputOfEvenLength() {
        // Given
        Integer[] input = {1, 3, 5, 4};
        Integer expected = 68;

        // When
        Integer actual = MainApp.solveWithMath(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInputOfOddLength() {
        // Given
        Integer[] input = {1, 3, 5, 4, 7};
        Integer expected = 141;

        // When
        Integer actual = MainApp.solveWithMath(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInputWithNegative() {
        // Given
        Integer[] input = {1, -3, 5, 4};
        Integer expected = 32;

        // When
        Integer actual = MainApp.solveWithMath(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInputOfBigNums() {
        // Given
        Integer[] input = {1159881, 1366082, 1489909, 1767619, 1963582};
        Integer expected = 54096104;

        // When
        Integer actual = MainApp.solveWithMath(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInputOfThirtyNums() {
        // Given
        Integer[] input = {28, 32, 64, 82, 63, 2, 59, 80, 83, 93, 56, 94, 87, 79,
                16, 11, 68, 18, 99, 8, 17, 65, 89, 52, 25, 91, 49, 13, 43, 24};
        Integer expected = 276864;

        // When
        Integer actual = MainApp.solveWithMath(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInputOfAllNegativesAndOddLength(){
        // Given
        Integer[] input = {-954, -272, -202, -739, -703, -792, -249, -669, -462, -718, -724};
        Integer expected = -163074;

        // When
        Integer actual = MainApp.solveWithMath(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
