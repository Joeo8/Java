public class Sample {
  public static void main(String[] args) {
    double average = findAverage(prepareValues());
    System.out.println("The average is " + average);
  }

  private static double findAverage(String[] input) {
    checkInput(input);
    double result = 0;
    for (String s : input) {
      result += validateNumber(extractNumber(removeQuotes(s)));
    }
    return result;
  }

  private static String[] prepareValues() {
    return new String[] {"'apple 1'", "orange 2", "'tomato 3'"};
  }

  private static int extractNumber(String s) {
    return Integer.parseInt(s.split(" ")[0]);
  }

  private static void checkInput(String[] input) {
    if (input == null || input.length == 0) {
      throw new IllegalArgumentException("Invalid input");
    }
  }

  private static String removeQuotes(String s) {
    if (s.startsWith("'") && s.endsWith("'") && s.length() > 1) {
      return s.substring(1, s.length() - 1);
    }
    return s;
  }

  private static int validateNumber(int number) {
    if (number < 0) throw new IllegalArgumentException("Invalid number: " + number);
    return number;
  }
}
