import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LogTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @org.junit.jupiter.api.Test
    void errorMessage() {
        Log l = new Log();
        l.errorMessage("Pellentesque egestas magna ac elit porta condimentum. Pellentesque id nulla faucibus, ultrices ligula pellentesque, suscipit nisl. Etiam non venenatis diam, eu tristique dolor. Mauris ligula lectus, ultrices at tempus at, molestie in arcu. Proin sollicitudin bibendum tristique. Duis arcu purus, vehicula ac dictum ut, pretium ut libero. Nullam vehicula libero mi, ut euismod metus egestas at. Donec tristique semper quam ut tempus.");
        Assertions.assertEquals("[0;31mERROR:\u001B[0m\n" +
                "\u001B[0;31m\tPellentesque egestas magna ac elit porta condimentum. Pellentesque id nulla faucibus, ultrices ligul\u001B[0m\n" +
                "\u001B[0;31m\ta pellentesque, suscipit nisl. Etiam non venenatis diam, eu tristique dolor. Mauris ligula lectus, u\u001B[0m\n" +
                "\u001B[0;31m\tltrices at tempus at, molestie in arcu. Proin sollicitudin bibendum tristique. Duis arcu purus, vehi\u001B[0m\n" +
                "\u001B[0;31m\tcula ac dictum ut, pretium ut libero. Nullam vehicula libero mi, ut euismod metus egestas at. Donec\u001B[0m\n" +
                "\u001B[0;31m\ttristique semper quam ut tempus.\u001B[0m", outputStreamCaptor.toString().trim());
    }

    @org.junit.jupiter.api.Test
    void successMessage() {
        Log l = new Log();
        l.successMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien libero, facilisis quis ex at, ultricies congue erat. Proin hendrerit leo magna, quis pellentesque magna faucibus a. Etiam eu ligula pharetra libero dapibus ultricies sollicitudin ac lectus. Praesent est sem, tincidunt sed lobortis at, efficitur a mi. Nulla nec facilisis dolor. Proin sit amet consequat est. Curabitur aliquam sodales cursus. Etiam tincidunt varius nulla, eu malesuada enim imperdiet non.");
        Assertions.assertEquals("[0;32mSUCCESS:\u001B[0m\n" +
                "\u001B[0;32m\tLorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien libero, facilisis quis ex at,\u001B[0m\n" +
                "\u001B[0;32m\tultricies congue erat. Proin hendrerit leo magna, quis pellentesque magna faucibus a. Etiam eu ligul\u001B[0m\n" +
                "\u001B[0;32m\ta pharetra libero dapibus ultricies sollicitudin ac lectus. Praesent est sem, tincidunt sed lobortis\u001B[0m\n" +
                "\u001B[0;32m\tat, efficitur a mi. Nulla nec facilisis dolor. Proin sit amet consequat est. Curabitur aliquam sodal\u001B[0m\n" +
                "\u001B[0;32m\tes cursus. Etiam tincidunt varius nulla, eu malesuada enim imperdiet non.\u001B[0m", outputStreamCaptor.toString().trim());
    }

    @org.junit.jupiter.api.Test
    void warningMessage() {
        Log l = new Log();
        l.warningMessage("Aenean quis hendrerit nulla. Quisque lobortis vitae ipsum nec convallis. Sed non diam eu justo finibus consectetur. Donec sed tempus est, eget congue metus. Vestibulum finibus a sapien nec viverra. Donec sagittis orci sit amet egestas laoreet. In pellentesque massa arcu, pharetra blandit lectus aliquam et. Phasellus scelerisque libero quis elit pulvinar luctus. Morbi tempus a dolor vel sollicitudin. Vivamus purus est, porta in placerat sit amet, vulputate a mauris. Duis tincidunt elit vitae elit blandit, et cursus neque rhoncus.");
        Assertions.assertEquals("[0;33mWARNING:\u001B[0m\n" +
                "\u001B[0;33m\tAenean quis hendrerit nulla. Quisque lobortis vitae ipsum nec convallis. Sed non diam eu justo finib\u001B[0m\n" +
                "\u001B[0;33m\tus consectetur. Donec sed tempus est, eget congue metus. Vestibulum finibus a sapien nec viverra. Do\u001B[0m\n" +
                "\u001B[0;33m\tnec sagittis orci sit amet egestas laoreet. In pellentesque massa arcu, pharetra blandit lectus aliq\u001B[0m\n" +
                "\u001B[0;33m\tuam et. Phasellus scelerisque libero quis elit pulvinar luctus. Morbi tempus a dolor vel sollicitudi\u001B[0m\n" +
                "\u001B[0;33m\tn. Vivamus purus est, porta in placerat sit amet, vulputate a mauris. Duis tincidunt elit vitae elit\u001B[0m\n" +
                "\u001B[0;33m\tblandit, et cursus neque rhoncus.\u001B[0m", outputStreamCaptor.toString().trim());
    }
}