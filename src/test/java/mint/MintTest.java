package mint;

import org.junit.Test;

public class MintTest {
    @Test
    public void showVersion() {
        System.out.println("showVersion");
        // Just show the version
        String[] args = {"-v"};
        Mint.main(args);
    }

    @Test
    public void startREPL() {
        System.out.println("startREPL");
        // Start the REPL
        String[] args = {""};
        Mint.main(args);
    }
}
