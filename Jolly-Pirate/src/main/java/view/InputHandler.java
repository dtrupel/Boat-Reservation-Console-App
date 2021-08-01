package view;

import model.Boat;
import model.IdGenerator;
import model.Member;

public interface InputHandler {

    String getInput();
    String getMemberIdInput(IdGenerator<Member> generator);
    String getBoatIdInput(IdGenerator<Boat> generator);
    String getNameInput();
    String getPersonalNumberInput();
    String getBoatLengthInput();
    String getBoatTypeInput();
}
