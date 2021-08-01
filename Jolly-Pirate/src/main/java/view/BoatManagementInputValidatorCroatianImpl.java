package view;

public class BoatManagementInputValidatorCroatianImpl implements BoatManagementInputValidator {
    @Override
    public boolean isChoiceAddBoat(String choice) {
        return choice.equals("c");
    }

    @Override
    public boolean isChoiceEditBoat(String choice) {
        return choice.equals("b");
    }

    @Override
    public boolean isChoiceDeleteBoat(String choice) {
        return choice.equals("a");
    }

    @Override
    public boolean isChoiceMotorsailer(String choice) {
        return choice.equals("c");
    }

    @Override
    public boolean isChoiceCruiser(String choice) {
        return choice.equals("b");
    }

    @Override
    public boolean isChoiceSportfish(String choice) {
        return choice.equals("a");
    }

    @Override
    public boolean isChoiceValid(String choice) {
        return choice.equals("a") ||
                choice.equals("b") ||
                choice.equals("c");
    }

    @Override
    public boolean isChoiceGoBack(String choice) {
        return choice.equals("d");
    }
}
