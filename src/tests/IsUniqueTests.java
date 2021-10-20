package tests;

import com.problems.IsUnique;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsUniqueTests {
    @Test
    void isUnique_WithEmptyString_ShouldReturnTrue() {
        // arrange
        var input = "";
        var isUnique = new IsUnique();
        // act
        var arrayMethod = isUnique.isUniqueArray(input);
        var setMethod = isUnique.isUniqueSet(input);
        var naiveMethod = isUnique.isUniqueNoExtraDataStructure(input);

        // assert
        assertTrue(arrayMethod);
        assertTrue(setMethod);
        assertTrue(naiveMethod);
    }

    @Test
    void isUnique_WithUniqueCharacters_ShouldReturnTrue() {
        // arrange
        var input = "qwertyuioasdfghjkzxcvbnm,123456";
        var isUnique = new IsUnique();
        // act
        var arrayMethod = isUnique.isUniqueArray(input);
        var setMethod = isUnique.isUniqueSet(input);
        var naiveMethod = isUnique.isUniqueNoExtraDataStructure(input);

        // assert
        assertTrue(arrayMethod);
        assertTrue(setMethod);
        assertTrue(naiveMethod);
    }

    @Test
    void isUnique_WithNonUniqueCharacters_ShouldReturnFalse() {
        // arrange
        var input = "qwertyuioasdfghjkzxcvbnm,123456q";
        var isUnique = new IsUnique();
        // act
        var arrayMethod = isUnique.isUniqueArray(input);
        var setMethod = isUnique.isUniqueSet(input);
        var naiveMethod = isUnique.isUniqueNoExtraDataStructure(input);

        // assert
        assertFalse(arrayMethod);
        assertFalse(setMethod);
        assertFalse(naiveMethod);
    }
}
