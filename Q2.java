import java.util.Scanner;
public class Q2 {

  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int num1, num2;
    System.out.println("Enter a number.");
    num1 = in.nextInt();
    System.out.println("Enter another number.");
    num2 = in.nextInt();
    add(num1, num2);
    multiply(num1, num2);
  }
  public static void add(int num1, int num2){
    int sum = num1 + num2;
        System.out.println("added: " + sum);

  }
  public static void multiply(int num1, int num2) {
    int product = num1 * num2;
        System.out.println("multiplied: " + product);
  }

}
