package codeSignal.arcade;

/**
 * Guaranteed constraints:
 * 1 ≤ year ≤ 2005
 */

public class Id_2_CenturyFromYear {
    public int solution(int year) {
        return (year + 99) / 100;
    }
}
