package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task7.rotateLeft;
import static edu.hw1.Task7.rotateRight;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask7 {
    @Test
    void casualLeftRotateTest() {
        final int INPUT1 = 1;
        final int SHUFFLE1 = 1;
        final int INPUT2 = 8;
        final int SHUFFLE2 = 2;
        final int INPUT3 = 9;
        final int SHUFFLE3 = 1;

        final int OUTPUT1 = 1;
        final int OUTPUT2 = 2;
        final int OUTPUT3 = 3;

        assertThat(OUTPUT1 == rotateLeft(INPUT1, SHUFFLE1));
        assertThat(OUTPUT2 == rotateLeft(INPUT2, SHUFFLE2));
        assertThat(OUTPUT3 == rotateLeft(INPUT3, SHUFFLE3));
    }

    @Test
    void casualRightRotateTest() {
        final int INPUT1 = 1;
        final int SHUFFLE1 = 1;
        final int INPUT2 = 8;
        final int SHUFFLE2 = 2;
        final int INPUT3 = 9;
        final int SHUFFLE3 = 1;

        final int OUTPUT1 = 1;
        final int OUTPUT2 = 2;
        final int OUTPUT3 = 12;

        assertThat(OUTPUT1 == rotateRight(INPUT1, SHUFFLE1));
        assertThat(OUTPUT2 == rotateRight(INPUT2, SHUFFLE2));
        assertThat(OUTPUT3 == rotateRight(INPUT3, SHUFFLE3));
    }
}
