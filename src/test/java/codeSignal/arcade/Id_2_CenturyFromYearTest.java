package codeSignal.arcade;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Id_2_CenturyFromYearTest {
    @Test
    public void testCenturyFromYear() {
        Id_2_CenturyFromYear targetClass = new Id_2_CenturyFromYear();
        assertThat(targetClass.solution(1905), is(20));
        assertThat(targetClass.solution(1700), is(17));
        assertThat(targetClass.solution(1988), is(20));
        assertThat(targetClass.solution(2000), is(20));
        assertThat(targetClass.solution(2001), is(21));
        assertThat(targetClass.solution(200), is(2));
        assertThat(targetClass.solution(374), is(4));
        assertThat(targetClass.solution(45), is(1));
        assertThat(targetClass.solution(8), is(1));
    }
}
