package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task4.fixString;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask4 {
    @Test
    void casualInputTest() {
        final String INPUT = "123456";
        final String OUTPUT = "214365";
        assertThat(OUTPUT.equals(fixString(INPUT)));
    }

    @Test
    void variableInput() {
        final String INPUT = "hTsii  s aimex dpus rtni.g";
        final String OUTPUT = "This is a mixed up string.";
        assertThat(OUTPUT.equals(fixString(INPUT)));
    }
}
