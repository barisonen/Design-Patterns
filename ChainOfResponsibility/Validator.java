public abstract class Validator {

    public Validator nextValidator;

    public Validator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public abstract boolean isValid(int num);
}