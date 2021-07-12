import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void printer(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(2,5);
        assertEquals(90, printer.getPaper());
    }

    @Test
    public void cantPrintIfNotEnoughCopies(){
        assertEquals("Can't Print", printer.print(200, 5));
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void tonerDecreasesOnPrint(){
        printer.print(2, 5);
        assertEquals(90, printer.getToner());
    }
}
