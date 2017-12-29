package test;

import main.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    public void testStack(){
        Stack test = new Stack();
        assertTrue(test.isEmpty());
        test.push(1);
        test.push(2);
        test.push(3);
        assertFalse(test.isEmpty());
        assertEquals(3, test.peek());
        assertEquals(3, test.pop());
        assertEquals(2, test.peek());
    }
}
