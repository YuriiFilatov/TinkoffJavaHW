package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task2.countDigits;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask2 {
    @Test
    void casualNumber() {
        final int INPUT = 123;
        final int OUTPUT = 3;
        assertThat(countDigits(INPUT) == OUTPUT);
    }

    @Test
    void zeroNumber() {
        final int INPUT = 0;
        final int OUTPUT = 1;
        assertThat(countDigits(INPUT) == OUTPUT);
    }

    @Test
    void tenNumber() {
        final int INPUT = 10;
        final int OUTPUT = 2;
        assertThat(countDigits(INPUT) == OUTPUT);
    }

    @Test
    void digitNumber() {
        final int INPUT = 1;
        final int OUTPUT = 1;
        assertThat(countDigits(INPUT) == OUTPUT);
    }

    @Test
    void bigNumber() {
        final int INPUT = 1000000000;
        final int OUTPUT = 10;
        assertThat(countDigits(INPUT) == OUTPUT);
    }
}
