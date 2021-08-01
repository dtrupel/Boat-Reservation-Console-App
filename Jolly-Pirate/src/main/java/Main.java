import controller.Console;
import model.Registry;

public class Main {

    public static void main(String[] args) {

        Console console = new Console();
        Registry registry = Registry.getInstance();
        console.run(registry);
    }
}
