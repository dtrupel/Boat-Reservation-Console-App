package view;

public class EnterPropertyValidatorEnglishImpl extends EnterPropertyValidatorImpl {

    @Override
    public boolean isValidBoatLength(String input) {
        if(input.isEmpty())
            return false;
        for(Character c : input.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }
        return Long.parseLong(input) >= 1 && Long.parseLong(input) <= 15;
    }

    @Override
    public boolean isValidBoatType(String input) {
        return input.equals("1") ||
                input.equals("2") ||
                input.equals("3");
    }
}
