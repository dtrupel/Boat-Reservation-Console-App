package view;

public class MemberManagementInputValidatorEnglishImpl implements MemberManagementInputValidator{

    @Override
    public boolean isChoiceAddMember(String choice) {
        return choice.equals("1");
    }

    @Override
    public boolean isChoiceEditMember(String choice) {
        return choice.equals("2");
    }

    @Override
    public boolean isChoiceDeleteMember(String choice) {
        return choice.equals("3");
    }

    @Override
    public boolean isChoiceViewMember(String choice) {
        return choice.equals("4");
    }

    @Override
    public boolean isChoiceGoBack(String choice) {
        return choice.equals("5");
    }
}
