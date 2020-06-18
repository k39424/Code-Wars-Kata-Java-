// Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

public class CreatePhoneNumber6kyu {
  public static String createPhoneNumber(int[] numbers) {
    String phoneString = new String("(xxx) xxx-xxxx");
    for (int i : numbers) {
        phoneString = phoneString.replaceFirst("x", Integer.toString(i));
    }
    return phoneString;  
  }
  
}