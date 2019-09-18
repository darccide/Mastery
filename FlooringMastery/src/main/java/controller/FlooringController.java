package controller;

import view.FlooringView;
import view.MainMenuOption;

public class FlooringController {

    private final FlooringView view;

    public FlooringController(FlooringView view) {
        this.view = view;
    }

    public void run() {

        MainMenuOption pick;

        pick = view.selectFromMenu();

        if (pick != MainMenuOption.QUIT) {
            view.printMenuFrameBottom();

            while (pick != MainMenuOption.QUIT) {
                switch (pick) {
                    case DISPLAY_ORDERS:
                        // DISPLAY ORDERS
                        break;
                    case ADD_ORDER:
                        // ADD ORDERS
                        break;
                    case EDIT_ORDER:
                        // EDIT ORDERS
                        break;
                    case REMOVE_ORDER:
                        // REMOVE ORDERS"
                        break;
                    case QUIT:
                        // Exit the loop
                        break;
                }
            }
        }
        view.salutation();
    }
}
