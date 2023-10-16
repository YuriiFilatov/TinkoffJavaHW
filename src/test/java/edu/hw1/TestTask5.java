package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task5.isPalindromeDescendant;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask5 {
    @Test
    void casualInputTest() {
        final int INPUT1 = 11211230;
        final int INPUT2 = 13001120;
        final int INPUT3 = 23336014;

        assertThat(isPalindromeDescendant(INPUT1));
        assertThat(isPalindromeDescendant(INPUT2));
        assertThat(isPalindromeDescendant(INPUT3));
    }
}
