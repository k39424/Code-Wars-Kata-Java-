// Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String output = "";
    for (int i = 0; i <= numbers.length - 1; i++) {
      output += appendSymbol(i) + numbers[i];
    }
    
    return output;
  }
  
  public static String appendSymbol(int index) {
    String symbol = "";
    
    switch(index) {
      case 0:
        symbol = "(";
        break;
      case 3:
        symbol = ") ";
        break;
      case 6:
        symbol = "-";
        break;
    }
    
    return symbol;
  }
}