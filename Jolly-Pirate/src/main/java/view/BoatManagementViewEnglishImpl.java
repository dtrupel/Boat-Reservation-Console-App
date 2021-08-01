package view;

public class BoatManagementViewEnglishImpl implements BoatManagementView {
    private final BoatManagementInputValidator boatManagementInputValidator;

    public BoatManagementViewEnglishImpl() {
        boatManagementInputValidator = new BoatManagementInputValidatorEnglishImpl();
    }
    @Override
    public void displayOptions() {
        System.out.println("\tSelect one of the following boat types:\n" +
                "\t1) Add boat\n" +
                "\t2) Change boat info\n" +
                "\t3) Delete boat\n" +
                "\t4) Go back");
    }

    @Override
    public void displayPromptBoatLength() {
        System.out.print("\tEnter boat length: ");
    }

    @Override
    public void displayOfferBoatType() {
        System.out.println("\tSelect one of the following boat types:\n" +
                "\t1) Motorsailer\n" +
                "\t2) Cruiser\n" +
                "\t3) Sportfish");
    }

    @Override
    public void displayPromptBoatId() {
        System.out.print("\tEnter boat id: ");
    }

    @Override
    public void displayBoatCreated() {
        System.out.println("\tBoat was successfully created.");
    }

    @Override
    public void displayBoatDeleted() {
        System.out.println("\tBoat was successfully deleted.");
    }

    @Override
    public void displayBoatEdited() {
        System.out.println("\tBoat was successfully edited.");
    }

    @Override
    public void displayNoBoats() {
        System.out.println("\tThere is currently no boats registered in the club!");
    }

    @Override
    public BoatManagementInputValidator getBoatManagementInputValidator() {
        return boatManagementInputValidator;
    }
}
