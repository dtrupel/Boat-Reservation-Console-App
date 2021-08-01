package view;

import model.*;

import java.util.List;
import java.util.Scanner;

public class InputHandlerImpl implements InputHandler {

    private static Scanner input;
    private final DisplayWarningView displayWarningView;
    private final EnterPropertyValidator enterPropertyValidator;

    public InputHandlerImpl(DisplayWarningView warningView, EnterPropertyValidator validator) {
        input = new Scanner(System.in);
        displayWarningView = warningView;
        enterPropertyValidator = validator;
    }

    @Override
    public String getInput() {
        return input.nextLine();
    }

    @Override
    public String getMemberIdInput(IdGenerator<Member> generator) {
        String userInput = input.nextLine();
        List<Member> list = Registry.getInstance().getMemberRegistry().getAll();
        while(true) {
            if(!enterPropertyValidator.isValidMemberId(userInput) ||
            generator.idExists(list, userInput)) {
                displayWarningView.displayInvalidMemberId();
                userInput = input.nextLine();
            }else
                break;
        }
        return userInput;
    }

    @Override
    public String getBoatIdInput(IdGenerator<Boat> generator) {
        String userInput = input.nextLine();
        List<Boat> list = Registry.getInstance().getBoatRegistry().getAll();
        while(true) {
            if(!enterPropertyValidator.isValidBoatId(userInput) ||
                    generator.idExists(list, userInput)) {
                displayWarningView.displayInvalidBoatId();
                userInput = input.nextLine();
            }else
                break;
        }
        return userInput;
    }

    @Override
    public String getNameInput() {
        String userInput = input.nextLine();
        while(!enterPropertyValidator.isValidName(userInput)) {
            displayWarningView.displayInvalidName();
            userInput = input.nextLine();
        }
        return userInput;
    }

    @Override
    public String getPersonalNumberInput() {
        String userInput = input.nextLine();
        while(!enterPropertyValidator.isValidPersonalNumber(userInput)) {
            displayWarningView.displayInvalidPersonalNumber();
            userInput = input.nextLine();
        }
        return userInput;
    }

    @Override
    public String getBoatLengthInput() {
        String userInput = input.nextLine();
        while(!enterPropertyValidator.isValidBoatLength(userInput)) {
            displayWarningView.displayInvalidBoatLength();
            userInput = input.nextLine();
        }
        return userInput;
    }

    @Override
    public String getBoatTypeInput() {
        String userInput = input.nextLine();
        while(!enterPropertyValidator.isValidBoatType(userInput)) {
            displayWarningView.displayInvalidBoatType();
            userInput = input.nextLine();
        }
        return userInput;
    }


}
