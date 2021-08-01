package view;

public class MainMenuViewEnglishImpl implements MainMenuView{

    private final MainMenuInputValidator mainMenuInputValidator;

    public MainMenuViewEnglishImpl() {
        mainMenuInputValidator = new MainMenuInputValidatorEnglishImpl();
    }

    @Override
    public void displayWelcomeMessage() {
        System.out.println("\tWelcome to the Jolly Pirate Yacht Club app!");
    }

    @Override
    public void displayMenuOptions() {
        System.out.println("\tSelect one of the following options:\n" +
                "\t1) List members (compact version)\n"+
                "\t2) List members (verbose version)\n"+
                "\t3) Member management\n"+
                "\t4) Boat management\n"+
                "\t5) Change language\n"+
                "\t6) Exit");
    }

    public MainMenuInputValidator getMainMenuInputValidator() {
        return mainMenuInputValidator;
    }
}
