package view;

public class EnterPropertyValidatorCroatianImpl extends EnterPropertyValidatorImpl {

    @Override
    public boolean isValidBoatLength(String input) {
        if(input.isEmpty())
            return false;
        for(Character c : input.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }
        return Long.parseLong(input) >= 1 && Long.parseLong(input) <= 40;
    }

    @Override
    public boolean isValidBoatType(String input) {
        return input.equals("a") ||
                input.equals("b") ||
                input.equals("c");
    }
}
