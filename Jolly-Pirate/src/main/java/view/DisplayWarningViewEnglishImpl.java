package view;

public class DisplayWarningViewEnglishImpl implements DisplayWarningView {

    @Override
    public void displayInvalidMemberId() {
        System.out.print("\tPlease enter a valid member id (6 digit number): ");
    }

    @Override
    public void displayInvalidBoatId() {
        System.out.print("\tPlease enter a valid boat id (5 digit number): ");
    }
    @Override
    public void displayInvalidName() {
        System.out.print("\tPlease enter a name consisting of letters and whitespaces: ");
    }

    @Override
    public void displayInvalidPersonalNumber() {
        System.out.print("\tPlease enter a personal number consisting of 10 digits: ");
    }

    @Override
    public void displayInvalidBoatLength() {
        System.out.print("\tPlease enter a number from 1 to 15: ");
    }

    @Override
    public void displayInvalidBoatType() {
        System.out.print("\tPlease enter 1, 2 or 3: ");
    }
}
