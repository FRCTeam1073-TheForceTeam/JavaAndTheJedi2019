package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    
    @Test public void onePalindromeTest() {
        Palindrome classUnderTest = new Palindrome();
        assertTrue(IsPalindrome("racecar"));//tests one case that should come out as true
        assertFalse(IsPalindrome("jedi"));//tests one case that should come out as false
    }
}