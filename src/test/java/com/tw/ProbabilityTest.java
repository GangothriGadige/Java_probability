package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ProbabilityTest {
    @Test
    void shouldCheckEqualityWhenProbabilityOfHeadsIsComparedWithProbabilityOfTails() {
        Probability probabilityOfHeads = new Probability(0.5);
        Probability probabilityOfTails = new Probability(0.5);

        assertThat(probabilityOfHeads, is(equalTo(probabilityOfTails)));
    }

}
