package cashregister;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CashRegisterTest {

    private final MockPrinter mockPrinter = new MockPrinter();
    private final CashRegister register = new CashRegister(mockPrinter);

    @Test
    public void cashRegisterProcessShouldCallPrinterPrintMethod() {
        Item[] items = {new Item("My Item", 1.0)};
        Purchase purchase = new Purchase(items);

        register.process(purchase);

        assertEquals(purchase.asString(), mockPrinter.getLastPrinted());
    }

    @Test
    public void cashRegisterProcessShouldPrintTheLatestPurchase() {
        Item[] items = {
                new Item("My Item", 1.0),
                new Item("My Item2", 2.0)
        };
        Purchase purchase = new Purchase(items);

        register.process(purchase);

        assertEquals(purchase.asString(), mockPrinter.getLastPrinted());
    }

    @Test
    public void cashRegisterProcessShouldCallProcess() {
        Item[] items = {
                new Item("My Item", 1.0)
        };
        Purchase purchase = new Purchase(items);

        register.process(purchase);


        String lastPrinted = mockPrinter.getLastPrinted();

        assertTrue(lastPrinted.contains("My Item"));
        assertTrue(lastPrinted.contains("1.0"));
    }

    @Test
    public void cashRegisterProcessShouldPrintAllPurchaseItems() {
        Item[] items = {
                new Item("My Item1", 1.0),
                new Item("My Item2", 2.0)
        };
        Purchase purchase = new Purchase(items);

        register.process(purchase);


        String lastPrinted = mockPrinter.getLastPrinted();

        assertTrue(lastPrinted.contains("My Item1"));
        assertTrue(lastPrinted.contains("1.0"));
        assertTrue(lastPrinted.contains("My Item2"));
        assertTrue(lastPrinted.contains("2.0"));
    }

    @Test
    public void cashRegisterProcessShouldPrintAllItemsOnRightLines() {
        Item[] items = {
                new Item("My Item1", 1.0),
                new Item("My Item2", 2.0)
        };
        Purchase purchase = new Purchase(items);

        register.process(purchase);


        List<String> lastPrinted = mockPrinter.getLastPrintedLines();

        assertTrue(lastPrinted.get(0).contains("My Item1"));
        assertTrue(lastPrinted.get(0).contains("1.0"));

        assertTrue(lastPrinted.get(1).contains("My Item2"));
        assertTrue(lastPrinted.get(1).contains("2.0"));
    }
}
