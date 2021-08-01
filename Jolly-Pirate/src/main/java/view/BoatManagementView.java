package view;

public interface BoatManagementView {

    void displayOptions();
    void displayPromptBoatLength();
    void displayOfferBoatType();
    void displayPromptBoatId();
    void displayBoatCreated();
    void displayBoatDeleted();
    void displayBoatEdited();
    void displayNoBoats();
    BoatManagementInputValidator getBoatManagementInputValidator();

}
