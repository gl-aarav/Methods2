  import java.util.Scanner;
  public class Q3 {

    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      String Name;
      System.out.println("Enter your name.");
      Name = in.nextLine();
      letters(Name);
      System.out.println("\nGood Bye " + Name);

    }
    public static void letters(String Name) {
      for (int i=0; i<Name.length(); i++) {	
      System.out.println(Name.charAt(i));
      }
    }

  }
