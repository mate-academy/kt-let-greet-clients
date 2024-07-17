# Personalized Greeting Generator

Implement the getGreetings() method in the GreetingService class. This method should accept a list of client names, which may contain null values. It should iterate through each item in the list and generate a personalized greeting message for non-null names. To handle `null` values gracefully, use the Kotlin `let` function to process only the non-null names.

Here's the expected behavior of `getGreetings()`:

- If the name is not null, add a greeting message `Hello, [name]!` to the list of greetings.
- If the name is null, do not add any message to the list.

The final output of the method should be a list of personalized greetings for all valid client names.

Ensure that you use the Kotlin `let` function to handle nullable values.
