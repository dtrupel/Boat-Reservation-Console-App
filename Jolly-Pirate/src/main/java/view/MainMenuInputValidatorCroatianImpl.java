package view;

public class MainMenuInputValidatorCroatianImpl implements MainMenuInputValidator {
    @Override
    public boolean isChoiceDisplayCompact(String choice) {
        return choice.equals("d");
    }

    @Override
    public boolean isChoiceDisplayVerbose(String choice) {
        return choice.equals("e");
    }

    @Override
    public boolean isChoiceMemberManagement(String choice) {
        return choice.equals("a");
    }

    @Override
    public boolean isChoiceBoatManagement(String choice) {
        return choice.equals("b");
    }

    @Override
    public boolean isChoiceChangeLanguage(String choice) {
        return choice.equals("c");
    }

    @Override
    public boolean isChoiceExit(String choice) {
        return choice.equals("f");
    }
}
