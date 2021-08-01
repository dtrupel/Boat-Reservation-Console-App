package view;

public class ChangeViewInputValidatorCroatianImpl implements ChangeViewInputValidator {


    @Override
    public boolean isChoiceEnglish(String choice) {
        return choice.equals("b");
    }

    @Override
    public boolean isChoiceCroatian(String choice) {
        return choice.equals("a");
    }
}
