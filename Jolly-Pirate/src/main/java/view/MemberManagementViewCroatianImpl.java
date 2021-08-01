package view;

import model.Member;

public class MemberManagementViewCroatianImpl implements MemberManagementView {

    private final MemberManagementInputValidator memberManagementInputValidator;

    public MemberManagementViewCroatianImpl() {
        memberManagementInputValidator = new MemberManagementInputValidatorCroatianImpl();
    }

    @Override
    public void displayMemberManagementOptions() {
        System.out.println("\ta) Obriši člana\n" +
                "\tb) Ažuriraj člana\n" +
                "\tc) Dodaj člana\n" +
                "\td) Pogledaj informacije o članu\n" +
                "\te) Idi natrag");
    }

    @Override
    public void displayPromptName() {
        System.out.print("\tUnesi ime: ");
    }

    @Override
    public void displayPromptPersonalNumber() {
        System.out.print("\tUnesi osobni broj člana: ");
    }

    @Override
    public void displayPromptMemberId() {
        System.out.print("\tUnesi id broj člana:");
    }

    @Override
    public void displayMemberCreated(String name) {
        System.out.println("\tČlan " + name + " je uspješno kreiran.\n");
    }

    @Override
    public void displayMemberDeleted(String name) {
        System.out.println("\tČlan " + name + " je uspješno obrisan.\n");
    }

    @Override
    public void displayMemberEdited() {
        System.out.println("\tČlan je uspješno ažuriran.\n");
    }


    @Override
    public void displayMember(Member m) {
        System.out.println("\tOsobni broj člana: " + m.getPersonalNumber()+"\n"+
                "\tIme člana: " + m.getName()+"\n"+
                "\tId broj člana: " + m.getMemberId()+"\n");
    }

    @Override
    public void displayNoMembers() {
        System.out.println("\tTrenutno nema članova registriranih u klubu!");
    }

    @Override
    public MemberManagementInputValidator getMemberManagementInputValidator() {
        return memberManagementInputValidator;
    }
}
