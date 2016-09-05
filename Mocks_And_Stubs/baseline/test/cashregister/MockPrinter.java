package cashregister;

import java.util.Arrays;
import java.util.List;

public class MockPrinter extends Printer {
    private String lastPrinted;

    @Override
    public void print(String printThis) {
        this.lastPrinted = printThis;
    }


    public String getLastPrinted() {
        return lastPrinted;
    }

    public List<String> getLastPrintedLines() {
        return Arrays.asList(lastPrinted.split("\\n"));
    }

}
