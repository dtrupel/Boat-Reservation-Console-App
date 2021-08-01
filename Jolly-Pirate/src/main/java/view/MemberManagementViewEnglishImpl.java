package view;

import model.Member;

public class MemberManagementViewEnglishImpl implements MemberManagementView {

    private final MemberManagementInputValidator memberManagementInputValidator;

    public MemberManagementViewEnglishImpl() {
        memberManagementInputValidator = new MemberManagementInputValidatorEnglishImpl();
    }

    @Override
    public void displayMemberManagementOptions() {
        System.out.println("\t1) Create a member\n" +
                "\t2) Edit member's information\n" +
                "\t3) Delete a member\n" +
                "\t4) View member's information\n" +
                "\t5) Go back");
    }

    @Override
    public void displayPromptName() {
        System.out.print("\tEnter name: ");
    }

    @Override
    public void displayPromptPersonalNumber() {
        System.out.print("\tEnter personal number: ");
    }

    @Override
    public void displayPromptMemberId() {
        System.out.print("\tEnter member id: ");
    }

    @Override
    public void displayMemberCreated(String name) {
        System.out.println("\tMember " + name + " was successfully created.\n");
    }

    @Override
    public void displayMemberDeleted(String name) {
        System.out.println("\tMember " + name + " was successfully deleted.\n");
    }

    @Override
    public void displayMemberEdited() {
        System.out.println("\tMember was successfully edited.\n");
    }


    @Override
    public void displayMember(Member m) {
        System.out.println("\tName: " + m.getName()+"\n"+
                "\tPersonal number: " + m.getPersonalNumber()+"\n"+
                "\tMember id: " + m.getMemberId()+"\n");
    }

    @Override
    public void displayNoMembers() {
        System.out.println("\tThere is currently no members registered in the club!");
    }

    @Override
    public MemberManagementInputValidator getMemberManagementInputValidator() {
        return memberManagementInputValidator;
    }
}
