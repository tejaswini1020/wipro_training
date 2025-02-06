/*
Create an interface UserService with a default method getWelcomeMessage(), which returns "Welcome, Guest!" if no name is provided.
Implement a method getUser(String name) that returns an Optional<String> representing the user's name. 
In the implementation, if the name is present, return a welcome message with the user's name; otherwise, return the default message.
 
Hint: Use Optional.ofNullable() and default methods in interfaces
*/

import java.util.Optional;
interface UserService {
default String getWelcomeMessage() {
return "Welcome, Guest!";
}

    Optional<String> getUser(String name);
}

// Implement the UserService interface
class UserServiceImpl implements UserService {
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        String Message = userService.getUser("John")
            .map(name -> "Welcome, " + name + "!") // If name is present, return a welcome message
            .orElse(userService.getWelcomeMessage()); // Otherwise, return default message
        System.out.println(Message); // Output: Welcome, John!


        String MSG2 = userService.getUser(null)
            .map(name -> "Welcome, " + name + "!") // Will not be executed if name is null
            .orElse(userService.getWelcomeMessage()); // Default message
        System.out.println(MSG2); // Output: Welcome, Guest!
    }
}

