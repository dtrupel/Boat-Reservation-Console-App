package view;

import model.Member;

public interface MemberManagementView {

    void displayMemberManagementOptions();
    void displayPromptName();
    void displayPromptPersonalNumber();
    void displayPromptMemberId();
    void displayMemberCreated(String name);
    void displayMemberDeleted(String name);
    void displayMemberEdited();
    void displayMember(Member m);
    void displayNoMembers();
    MemberManagementInputValidator getMemberManagementInputValidator();
}
