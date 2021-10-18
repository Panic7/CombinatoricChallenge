package Tests;

import Main.PentagonalNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PentagonalNumbersTest {
    @Test
    public void returnResultCalculatePentagonal()
    {
        PentagonalNumbers pn = new PentagonalNumbers();
        pn.setNum(5);
        assertEquals(51, pn.CombinatoricsChallenge(pn.getNum()));
        pn.setNum(2);
        assertEquals(6, pn.CombinatoricsChallenge(pn.getNum()));
    }
    @Test
    public void incorrectInputData()
    {
        PentagonalNumbers pn = new PentagonalNumbers();
        pn.setNum(-1);
        assertNull(pn.CombinatoricsChallenge(pn.getNum()));
    }
}