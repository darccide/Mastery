package view;

public class FlooringView {

    private final ConsoleIO io;

    public FlooringView(ConsoleIO io) {
        this.io = io;
    }

    public MainMenuOption selectFromMenu() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        printMenuFrameTop();

        greeting();

        for (MainMenuOption mmo : MainMenuOption.values()) {
            io.print(String.format("*        %s. %s      *",
                    mmo.getChoice(), mmo.getSelection()));
            min = Math.min(mmo.getChoice(), min);
            max = Math.max(mmo.getChoice(), max);
        }

        printMenuFrameBottom();

        int choice = io.readInt(String
                .format("Select [%s-%s]:", min, max), min, max);
        return MainMenuOption.fromChoice(choice);
    }

    public boolean confirm(String message) {
        return io.readBoolean(String.format("%s [y/n]:", message));
    }

    public void greeting() {
        printTitle("Flooring Program");
    }

    public void salutation() {
        printClosing("THANK YOU AND HAVE A GREAT DAY :)");
    }

    public void printTitle(String message) {
        io.print(String.format("*       <<%s>>       *", message));
    }

    public void printClosing(String message) {
        io.print(String.format("%s", message));
    }

    public void printMenuFrameTop() {
        io.print("************************************");
        io.print("*                                  *");
    }

    public void printMenuFrameBottom() {
        io.print("*                                  *");
        io.print("************************************");
    }
}
