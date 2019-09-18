package view;

public enum MainMenuOption {

    DISPLAY_ORDERS(1, "Display Orders   "),
    ADD_ORDER(2, "Add an Order     "),
    EDIT_ORDER(3, "Edit an Order    "),
    REMOVE_ORDER(4, "Remove an Order  "),
    QUIT(5, "Quit             ");

    private final int choice;
    private final String selection;

    private MainMenuOption(int choice, String selection) {
        this.choice = choice;
        this.selection = selection;
    }

    public int getChoice() {
        return choice;
    }

    public String getSelection() {
        return selection;
    }

    public static MainMenuOption fromChoice(int choice) {
        for (MainMenuOption mmo : MainMenuOption.values()) {
            if (mmo.getChoice() == choice) {
                return mmo;
            }
        }
        return QUIT;
    }
}
