package view;

public class BoatManagementInputValidatorEnglishImpl implements BoatManagementInputValidator {

    @Override
    public boolean isChoiceAddBoat(String choice) {
        return choice.equals("1");
    }

    @Override
    public boolean isChoiceEditBoat(String choice) {
        return choice.equals("2");
    }

    @Override
    public boolean isChoiceDeleteBoat(String choice) {
        return choice.equals("3");
    }

    @Override
    public boolean isChoiceMotorsailer(String choice) {
        return choice.equals("1");
    }

    @Override
    public boolean isChoiceCruiser(String choice) {
        return choice.equals("2");
    }

    @Override
    public boolean isChoiceSportfish(String choice) {
        return choice.equals("3");
    }

    @Override
    public boolean isChoiceValid(String choice) {
        return choice.equals("1") ||
                choice.equals("2") ||
                choice.equals("3");
    }

    @Override
    public boolean isChoiceGoBack(String choice) {
        return choice.equals("4");
    }


}
