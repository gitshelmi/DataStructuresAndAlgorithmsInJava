package tests;

import com.problems.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTests {
    @Test
    void twoSum_WithProperValues_ShouldReturnCorrectIndices() {
        //arrange
        var input = new int[]{2, 7, 11, 15};
        var target = 9;
        var expectedOutput = new int[]{0, 1};

        //act
        var actualOutput = new TwoSum().twoSum(input, target);

        //assert
        assertTrue(actualOutput.length == 2);
        assertTrue(actualOutput[0] == expectedOutput[0] && actualOutput[1] == expectedOutput[1]);
    }

    @Test
    void twoSum_WithFewInputs_ShouldReturnNull() {
        //arrange
        var input = new int[]{2};
        var target = 9;

        //act
        var actualOutput = new TwoSum().twoSum(input, target);

        //assert
        assertEquals(actualOutput, null);
    }

    @Test
    void twoSum_WithNoValidAnswer_ShouldReturn00() {
        //arrange
        var input = new int[]{2, 3, 4};
        var target = 100;

        //act
        var actualOutput = new TwoSum().twoSum(input, target);

        //assert
        assertTrue(actualOutput.length == 2);
        assertTrue(actualOutput[0] == 0 && actualOutput[1] == 0);
    }
}
