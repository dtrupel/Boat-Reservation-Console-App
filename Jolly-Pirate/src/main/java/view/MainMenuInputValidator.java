package view;

public interface MainMenuInputValidator {

    boolean isChoiceDisplayCompact(String choice);
    boolean isChoiceDisplayVerbose(String choice);
    boolean isChoiceMemberManagement(String choice);
    boolean isChoiceBoatManagement(String choice);
    boolean isChoiceChangeLanguage(String choice);
    boolean isChoiceExit(String choice);

}
