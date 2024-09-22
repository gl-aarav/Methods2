import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String fav_word;
    int fav_num;
    System.out.println("What is your favorite word?");
    fav_word = in.nextLine();
    System.out.println("What is your favorite number?");
    fav_num = in.nextInt();
    Print_Word_And_Name(fav_word, fav_num);

  }
  public static void Print_Word_And_Name(String word, int num) {
    for (int i=1; i<=num; i++)
    System.out.println(word);
  }

}
