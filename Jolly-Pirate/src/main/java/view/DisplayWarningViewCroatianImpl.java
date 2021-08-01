package view;

public class DisplayWarningViewCroatianImpl implements DisplayWarningView {

    @Override
    public void displayInvalidMemberId() {
        System.out.print("\tMolim vas unesite valjani id broj člana (6 znamenki): ");
    }

    @Override
    public void displayInvalidBoatId() {
        System.out.print("\tMolim vas unesite valjani id broj broda (5 znamenki): ");
    }
    @Override
    public void displayInvalidName() {
        System.out.print("\tMolim vas unesite valjano ime: ");
    }

    @Override
    public void displayInvalidPersonalNumber() {
        System.out.print("\tMolim vas unesite 10-znamenkasti broj: ");
    }

    @Override
    public void displayInvalidBoatLength() {
        System.out.print("\tMolim vas unesite broj u rasponu 1-40: ");
    }

    @Override
    public void displayInvalidBoatType() {
        System.out.print("\tMolim vas unesite a, b ili c: ");
    }
}
