package view;

public class ChangeViewCroatianImpl implements ChangeView {

    private final ChangeViewInputValidator changeViewInputValidator;

    public ChangeViewCroatianImpl() {
        changeViewInputValidator = new ChangeViewInputValidatorCroatianImpl();
    }

    @Override
    public void displayChangeView() {
        System.out.println("\ta) Hrvatski jezik\n" +
                "\tb) Engleski jezik");
    }

    @Override
    public ChangeViewInputValidator getChangeViewInputValidator() {
        return changeViewInputValidator;
    }
}
