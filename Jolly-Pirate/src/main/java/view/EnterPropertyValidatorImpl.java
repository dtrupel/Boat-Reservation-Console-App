package view;

public class EnterPropertyValidatorImpl implements EnterPropertyValidator {

    @Override
    public boolean isValidMemberId(String input) {
        if(input.length() != 6)
            return false;
        for(char c : input.toCharArray())
            if(!Character.isDigit(c))
                return false;
        return true;
    }

    @Override
    public boolean isValidBoatId(String input) {
        if(input.length() != 5)
            return false;
        for(char c : input.toCharArray())
            if(!Character.isDigit(c))
                return false;
        return true;
    }

    @Override
    public boolean isValidName(String input) {
        if(input.isEmpty())
            return false;
        for(char c : input.toCharArray())
            if(!Character.isLetter(c) && !Character.isWhitespace(c))
                return false;
        return true;
    }

    @Override
    public boolean isValidPersonalNumber(String input) {
        if(input.length() != 10)
            return false;
        for(char c : input.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }
        return true;
    }

    @Override
    public boolean isValidBoatLength(String input) {
        return false;
    }

    @Override
    public boolean isValidBoatType(String input) {
        return false;
    }


}
