package codeSignal.arcade;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Id_3_CheckPalindromeTest {
    @Test
    public void testPalindrome() {
        Id_3_CheckPalindrome targetClass = new Id_3_CheckPalindrome();
        assertThat(targetClass.solution("aabaa"), is(true));
        assertThat(targetClass.solution("abac"), is(false));
        assertThat(targetClass.solution("a"), is(true));
        assertThat(targetClass.solution("az"), is(false));
        assertThat(targetClass.solution("abacaba"), is(true));
        assertThat(targetClass.solution("z"), is(true));
        assertThat(targetClass.solution("aaabaaaa"), is(false));
        assertThat(targetClass.solution("zzzazzazz"), is(false));
        assertThat(targetClass.solution("hlbeeykoqqqqokyeeblh"), is(true));
        assertThat(targetClass.solution("hlbeeykoqqqokyeeblh"), is(true));
    }

}
