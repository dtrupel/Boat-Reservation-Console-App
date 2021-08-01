package controller;

import model.*;

public class MemberManagementController extends ManagementController<Member> {

    public MemberManagementController(Registry registry, IdGenerator<Member> generator) {
        super(registry,generator);
    }

    public boolean manage() {
        memberManagementView.displayMemberManagementOptions();
        String choice = inputHandler.getInput();
        if(memberManagementView.getMemberManagementInputValidator().isChoiceAddMember(choice))
            add();
        if(memberManagementView.getMemberManagementInputValidator().isChoiceDeleteMember(choice))
            delete();
        if(memberManagementView.getMemberManagementInputValidator().isChoiceViewMember(choice))
            viewMember();
        if(memberManagementView.getMemberManagementInputValidator().isChoiceEditMember(choice))
            edit();

        return !memberManagementView.getMemberManagementInputValidator().isChoiceGoBack(choice);
    }

    protected void add() {
        Member member = createMember();
        registry.getMemberRegistry()
                .add(member);
        memberManagementView.displayMemberCreated(member.getName());
    }

    private Member createMember() {
        memberManagementView.displayPromptName();
        String name = inputHandler.getNameInput();
        memberManagementView.displayPromptPersonalNumber();
        String personalNumber = inputHandler.getPersonalNumberInput();
        String memberId = idGenerator.generateId(registry.getMemberRegistry().getAll());
        return new Member(name,personalNumber,memberId);
    }

    protected void delete() {
        if(registry.getMemberRegistry().isEmpty()) {
            memberManagementView.displayNoMembers();
            return;
        }
        deleteAndConfirm(decideMember());
    }

    private void deleteAndConfirm(Member member) {
        for (Boat boat : member.getList())
            registry.getBoatRegistry().delete(boat);
        registry.getMemberRegistry().delete(member);
        memberManagementView.displayMemberDeleted(member.getName());
    }

    protected void edit() {
        if(registry.getMemberRegistry().isEmpty()) {
            memberManagementView.displayNoMembers();
            return;
        }
        Member member = decideMember();
        editAndConfirm(member);
    }

    private void editAndConfirm(Member member) {
        memberManagementView.displayPromptName();
        String name = inputHandler.getNameInput();
        memberManagementView.displayPromptPersonalNumber();
        String personalNumber = inputHandler.getPersonalNumberInput();
        member.setName(name);
        member.setPersonalNumber(personalNumber);
        memberManagementView.displayMemberEdited();
    }

    private void viewMember() {
        if(registry.getMemberRegistry().isEmpty()) {
            memberManagementView.displayNoMembers();
            return;
        }
        memberManagementView.displayMember(decideMember());
    }
}
