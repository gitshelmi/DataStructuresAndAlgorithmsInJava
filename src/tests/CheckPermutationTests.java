package tests;

import com.problems.CheckPermutation;
import com.problems.IsUnique;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPermutationTests {
    @Test
    void checkPermutation_WithDifferentLengths_ShouldReturnFalse() {
        // arrange
        var input1 = "abcd";
        var input2 = "abc";
        var checkPermutation = new CheckPermutation();

        // act
        var arrayMethod = checkPermutation.checkPermutationArray(input1, input2);
        var mapMethod = checkPermutation.checkPermutationHashMsp(input1, input2);

        // assert
        assertFalse(arrayMethod);
        assertFalse(mapMethod);
    }

    @Test
    void checkPermutation_WithEmptyString_ShouldReturnTrue() {
        // arrange
        var input1 = "";
        var input2 = "";
        var checkPermutation = new CheckPermutation();

        // act
        var arrayMethod = checkPermutation.checkPermutationArray(input1, input2);
        var mapMethod = checkPermutation.checkPermutationHashMsp(input1, input2);

        // assert
        assertTrue(arrayMethod);
        assertTrue(mapMethod);
    }

    @Test
    void checkPermutation_WithPermutingString_ShouldReturnTrue() {
        // arrange
        var input1 = "shahab";
        var input2 = "habsha";
        var checkPermutation = new CheckPermutation();

        // act
        var arrayMethod = checkPermutation.checkPermutationArray(input1, input2);
        var mapMethod = checkPermutation.checkPermutationHashMsp(input1, input2);

        // assert
        assertTrue(arrayMethod);
        assertTrue(mapMethod);
    }
}
