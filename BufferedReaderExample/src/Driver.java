import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

    public static void main(String[] args) {

        try {
            CLI cli = new CLI();
            cli.readDatabase(new BufferedReader(new InputStreamReader(System.in)));
            cli.processArgs(args);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
