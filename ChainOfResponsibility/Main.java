public class Main {
    public static void main(String[] args) {
        Validator validatorChain = getValidatorChain();
        boolean isNumberPositiveAndEven;

        isNumberPositiveAndEven = validatorChain.isValid(5);
        System.out.println("is number 5 positive and even? : " + isNumberPositiveAndEven);

        isNumberPositiveAndEven = validatorChain.isValid(-2);
        System.out.println("is number -2 positive and even? : " + isNumberPositiveAndEven);

        isNumberPositiveAndEven = validatorChain.isValid(6);
        System.out.println("is number 6 positive and even? : " + isNumberPositiveAndEven);

        isNumberPositiveAndEven = validatorChain.isValid(44);
        System.out.println("is number 44 positive and even? : " + isNumberPositiveAndEven);
    }

    private static Validator getValidatorChain() {
        Validator isPositiveValidator = new IsPositiveNumberValidator(null);
        return new IsEvenNumberValidator(isPositiveValidator);
    }
}
