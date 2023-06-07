# Chain of Responsibility

Run **Main.java** & check the logs <br/>

**Base Validator Class:** Validator <br/>

**Validators:** IsEvenNumberValidator, IsPositiveNumberValidator

In this scenario the number is validated if its a positive **AND** even number.

Each validator validates the number with its condition and calls the next validator.
