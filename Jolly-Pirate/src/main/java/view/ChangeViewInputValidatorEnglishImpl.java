package view;

public class ChangeViewInputValidatorEnglishImpl implements ChangeViewInputValidator {

    @Override
    public boolean isChoiceEnglish(String choice) {
        return choice.equals("1");
    }

    @Override
    public boolean isChoiceCroatian(String choice) {
        return choice.equals("2");
    }
}
