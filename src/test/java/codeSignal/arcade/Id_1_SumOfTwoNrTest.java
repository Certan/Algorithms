package codeSignal.arcade;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Id_1_SumOfTwoNrTest {
    @Test
    public void testSumOfTwoNr() {
        Id_1_SumOfTwoNr targetClass = new Id_1_SumOfTwoNr();
        assertThat (targetClass.solution(3,6), is(9));
        assertThat (targetClass.solution(0,1000), is(1000));
        assertThat (targetClass.solution(2,-39), is(-37));
        assertThat (targetClass.solution(99,100), is(199));
        assertThat (targetClass.solution(-100,100), is(0));
        assertThat (targetClass.solution(-1000,-1000), is(-2000));
    }
}
