package program;

import controller.FlooringController;
import view.ConsoleIO;
import view.FlooringView;

public class App {

    public static void main(String[] args) {

        ConsoleIO io = new ConsoleIO();
        FlooringView view = new FlooringView(io);

        FlooringController controller = new FlooringController(view);

        controller.run();
    }
}
