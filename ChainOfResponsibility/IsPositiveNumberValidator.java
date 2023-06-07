public class IsPositiveNumberValidator extends Validator{

    public IsPositiveNumberValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean isValid(int num) {
        boolean result =  num > 0;

        if (nextValidator != null) {
            return result && nextValidator.isValid(num);
        }
        else {
            return result;
        }
    }
}
