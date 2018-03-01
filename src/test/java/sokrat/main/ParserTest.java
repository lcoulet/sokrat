package sokrat.main;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testSimpleParse() throws IOException, ParserExcception {
        Parser p = new Parser(new StringReader("3 4 2 3 2 10\n" +
                "0 0 1 3 2 9\n" +
                "1 2 1 0 0 9\n" +
                "2 0 2 2 0 9\n"));
        Simulator s = p.getSimulator();
        assertEquals(10,s.getDuration());
        assertEquals(3,s.getNbRows());
        assertEquals(4,s.getNbColumns());
        assertEquals(3,s.getRides().size());
        assertEquals(2,s.getBonus());

    }

}