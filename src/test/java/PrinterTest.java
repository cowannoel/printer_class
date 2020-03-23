import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaperLeft() {
        assertEquals(100, printer.getPaperLeft());
    }

    @Test
    public void printDecreasingPaper() {
        printer.print(20, 4);
        assertEquals(20, printer.getPaperLeft());
    }


}
