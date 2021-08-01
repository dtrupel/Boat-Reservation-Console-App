package view;

public class MainMenuInputValidatorEnglishImpl implements MainMenuInputValidator{

    @Override
    public boolean isChoiceDisplayCompact(String choice) {
        return choice.equals("1");
    }

    @Override
    public boolean isChoiceDisplayVerbose(String choice) {
        return choice.equals("2");
    }

    @Override
    public boolean isChoiceMemberManagement(String choice) {
        return choice.equals("3");
    }

    @Override
    public boolean isChoiceBoatManagement(String choice) {
        return choice.equals("4");
    }

    @Override
    public boolean isChoiceChangeLanguage(String choice) {
        return choice.equals("5");
    }

    @Override
    public boolean isChoiceExit(String choice) {
        return choice.equals("6");
    }
}
