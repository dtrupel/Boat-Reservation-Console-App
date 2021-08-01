package view;

public class MainMenuViewCroatianImpl implements MainMenuView {
    private final MainMenuInputValidator mainMenuInputValidator;

    public MainMenuViewCroatianImpl() {
        mainMenuInputValidator = new MainMenuInputValidatorCroatianImpl();
    }

    @Override
    public void displayWelcomeMessage() {
        System.out.println("\tDobrodošli u aplikaciju Jolly-Pirate-Yacht kluba!");
    }

    @Override
    public void displayMenuOptions() {
        System.out.println("\tOdaberite jednu od sljedećih opcija:\n" +
                "\ta) Upravljanje članovima\n"+
                "\tb) Upravljanje brodovima\n"+
                "\tc) Promijeni jezik\n"+
                "\td) Izlistaj članove (kraća verzija)\n"+
                "\te) Izlistaj članove (duža verzija)\n"+
                "\tf) Izađi");
    }

    public MainMenuInputValidator getMainMenuInputValidator() {
        return mainMenuInputValidator;
    }
}
