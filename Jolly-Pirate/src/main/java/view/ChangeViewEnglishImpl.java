package view;

public class ChangeViewEnglishImpl implements ChangeView{

    private final ChangeViewInputValidator changeViewInputValidator;

    public ChangeViewEnglishImpl() {
        changeViewInputValidator = new ChangeViewInputValidatorEnglishImpl();
    }

    @Override
    public void displayChangeView() {
        System.out.println("\t1) English view\n" +
                "\t2) Croatian view");
    }

    @Override
    public ChangeViewInputValidator getChangeViewInputValidator() {
        return changeViewInputValidator;
    }
}
