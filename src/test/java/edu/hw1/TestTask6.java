package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task6.countK;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask6 {
    @Test
    void casualInputTest() {
        final int INPUT1 = 6621;
        final int INPUT2 = 6554;
        final int INPUT3 = 1234;

        final int OUTPUT1 = 5;
        final int OUTPUT2 = 4;
        final int OUTPUT3 = 3;

        assertThat(OUTPUT1 == countK(INPUT1));
        assertThat(OUTPUT2 == countK(INPUT2));
        assertThat(OUTPUT3 == countK(INPUT3));
    }
}
