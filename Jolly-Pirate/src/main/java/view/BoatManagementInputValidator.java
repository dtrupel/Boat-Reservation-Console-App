package view;

public interface BoatManagementInputValidator {

    boolean isChoiceAddBoat(String choice);
    boolean isChoiceEditBoat(String choice);
    boolean isChoiceDeleteBoat(String choice);

    boolean isChoiceMotorsailer(String choice);
    boolean isChoiceCruiser(String choice);
    boolean isChoiceSportfish(String choice);

    boolean isChoiceValid(String choice);
    boolean isChoiceGoBack(String choice);
}
