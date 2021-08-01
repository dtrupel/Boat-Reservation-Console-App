package view;

public interface MemberManagementInputValidator {

    boolean isChoiceAddMember(String choice);
    boolean isChoiceEditMember(String choice);
    boolean isChoiceDeleteMember(String choice);
    boolean isChoiceViewMember(String choice);
    boolean isChoiceGoBack(String choice);

}
