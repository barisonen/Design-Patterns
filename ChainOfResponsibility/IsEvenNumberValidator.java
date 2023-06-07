public class IsEvenNumberValidator extends Validator {

    public IsEvenNumberValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean isValid(int num) {
        boolean result = num % 2 == 0;

        if (nextValidator != null) {
            return result && nextValidator.isValid(num);
        } else {
            return result;
        }
    }
}
