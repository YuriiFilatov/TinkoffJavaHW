package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task1.minutesToSeconds;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask1 {
    @Test
    void testWithCasualString() {
        final String INPUT = "10:00";
        final int OUTPUT = 600;
        assertThat(minutesToSeconds(INPUT) == OUTPUT);
    }

    @Test
    void testOverloadMinutesString() {
        final String INPUT = "10:60";
        final int OUTPUT = -1;
        assertThat(minutesToSeconds(INPUT) == OUTPUT);
    }

    @Test
    void testWithMoreThan24Minutes() {
        final String INPUT = "60:15";
        final int OUTPUT = 3615;
        assertThat(minutesToSeconds(INPUT) == OUTPUT);
    }

    @Test
    void stringWrongFormat() {
        final String INPUT = "60:1";
        final int OUTPUT = -1;
        assertThat(minutesToSeconds(INPUT) == OUTPUT);
    }

    @Test
    void stringWrongFormatWithoutDots() {
        final String INPUT = "601";
        final int OUTPUT = -1;
        assertThat(minutesToSeconds(INPUT) == OUTPUT);
    }
}
