package tests;

import com.problems.AddTwoNumbers;
import data.structures.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTests {
    @Test
    void addTwoNumbers_WithNullList_ShouldThrowException() {
        //arrange
        var list1 = new ListNode(0);
        ListNode list2 = null;

        //assert
        assertThrows(IllegalArgumentException.class,
                () -> new AddTwoNumbers().addTwoNumbers(list1, list2));
    }

    @Test
    void addTwoNumbers_WithZeroList_ShouldSumToZero() {
        //arrange
        var list1 = new ListNode(0);
        var list2 = new ListNode(0);

        // act
        var sumList = new AddTwoNumbers().addTwoNumbers(list1, list2);

        //assert
        assertEquals(0, sumList.value);
        assertNull(sumList.next);
    }

    @Test
    void addTwoNumbers_WithTwoLists_ShouldSumCorrectly() {
        //arrange
        var list1 = new ListNode(new int[]{4,5}); //54
        var list2 = new ListNode(new int[]{6,4}); //46

        // act
        var sumList = new AddTwoNumbers().addTwoNumbers(list1, list2);

        //assert
        assertEquals(0, sumList.value);
        assertEquals(0, sumList.next.value);
        assertEquals(1, sumList.next.next.value);
    }
}
