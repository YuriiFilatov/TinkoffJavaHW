package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task3.isNestable;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask3 {
@Test
    void fullNestable() {
        final int[] FIRST_ARR = {1, 2, 3, 4};
        final int[] SECOND_ARR = {0, 5};
        assertThat(isNestable(FIRST_ARR, SECOND_ARR));
    }

    @Test
    void minLesser() {
        final int[] FIRST_ARR = {-1, 2, 3, 4};
        final int[] SECOND_ARR = {0, 5};
        assertThat(!isNestable(FIRST_ARR, SECOND_ARR));
    }

    @Test
    void maxGreater() {
        final int[] FIRST_ARR = {1, 2, 3, 6};
        final int[] SECOND_ARR = {0, 5};
        assertThat(!isNestable(FIRST_ARR, SECOND_ARR));
    }

    @Test
    void maxGreaterAndMinLesser() {
        final int[] FIRST_ARR = {-1, 2, 3, 6};
        final int[] SECOND_ARR = {0, 5};
        assertThat(!isNestable(FIRST_ARR, SECOND_ARR));
    }
}
