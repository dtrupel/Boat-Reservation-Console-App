package view;

public class MemberManagementInputValidatorCroatianImpl implements MemberManagementInputValidator {
    @Override
    public boolean isChoiceAddMember(String choice) {
        return choice.equals("c");
    }

    @Override
    public boolean isChoiceEditMember(String choice) {
        return choice.equals("b");
    }

    @Override
    public boolean isChoiceDeleteMember(String choice) {
        return choice.equals("a");
    }

    @Override
    public boolean isChoiceViewMember(String choice) {
        return choice.equals("d");
    }

    @Override
    public boolean isChoiceGoBack(String choice) {
        return choice.equals("e");
    }
}
