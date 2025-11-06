import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EditorTest {
    private static final InputStream defaultStdin = System.in;
    private static final PrintStream defaultStdout = System.out;

    @AfterAll
    public static void cleanUpIO() {
        System.setIn(defaultStdin);
        System.setOut(defaultStdout);
    }

    @Test
    public void newTest() throws UnsupportedEncodingException {
        String input = "open\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, StandardCharsets.UTF_8));

        Editor instance = new Editor("", "", "", "");
        instance.set();
        instance.edit();

        String output = out.toString(StandardCharsets.UTF_8);
        assertTrue(output.contains("open what?"));
    }

    @Test
    public void shouldExitOnQuitCommandEntered() throws UnsupportedEncodingException {
        String input = "quit\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, StandardCharsets.UTF_8));

        Editor instance = new Editor("", "", "", "");
        instance.set();
        instance.edit();

        String output = out.toString(StandardCharsets.UTF_8);
        assertTrue(output.contains("Thank you for using Fotoshop.  Good bye."));
    }
}