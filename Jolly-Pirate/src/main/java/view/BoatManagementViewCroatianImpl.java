package view;

public class BoatManagementViewCroatianImpl implements BoatManagementView {

    private final BoatManagementInputValidator boatManagementInputValidator;

    public BoatManagementViewCroatianImpl() {
        boatManagementInputValidator = new BoatManagementInputValidatorCroatianImpl();
    }

    @Override
    public void displayOptions() {
        System.out.println("\tOdaberite jednu od sljedećih opcija:\n" +
                "\ta) Obriši brod\n" +
                "\tb) Promijeni informacije broda\n" +
                "\tc) Dodaj brod\n" +
                "\td) Idi natrag");
    }

    @Override
    public void displayPromptBoatLength() {
        System.out.print("\tUnesi dužinu broda: ");
    }

    @Override
    public void displayOfferBoatType() {
        System.out.println("\tOdaberi jedan od sljedećih tipova broda:\n" +
                "\ta) Sportski\n" +
                "\tb) Kruzer\n" +
                "\tc) Motor-plov");
    }

    @Override
    public void displayPromptBoatId() {
        System.out.print("\tUnesi id broda: ");
    }

    @Override
    public void displayBoatCreated() {
        System.out.println("\tBrod je uspješno kreiran.");
    }

    @Override
    public void displayBoatDeleted() {
        System.out.println("\tBrod je uspješno obrisan.");
    }

    @Override
    public void displayBoatEdited() {
        System.out.println("\tBrod je uspješno ažuriran.");
    }

    @Override
    public void displayNoBoats() {
        System.out.println("\tTrenutno nema registriranih brodova u klubu!");
    }

    @Override
    public BoatManagementInputValidator getBoatManagementInputValidator() {
        return boatManagementInputValidator;
    }
}
