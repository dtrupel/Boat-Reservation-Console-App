package view;

public interface EnterPropertyValidator {

    boolean isValidMemberId(String input);
    boolean isValidBoatId(String input);
    boolean isValidName(String input);
    boolean isValidPersonalNumber(String input);
    boolean isValidBoatLength(String input);
    boolean isValidBoatType(String input);
}
