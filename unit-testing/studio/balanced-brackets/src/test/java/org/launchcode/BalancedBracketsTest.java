package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oddBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void nestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void firstBracketBeingACloseBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsContainWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launch]"));
    }

    @Test
    public void bracketsContainEmptySpaceReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[  ]"));
    }

    @Test
    public void bracketsContainNumbersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[646]"));
    }

    @Test
    public void bracketsEndingWithAnOpenReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void bracketsInFrontOfOtherCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch Code"));
    }

    @Test
    public void bracketsWithinCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void singleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
}