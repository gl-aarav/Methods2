import java.util.Scanner;
public class Q4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int days;
    System.out.println("How many days is your book overdue?");
    days = in.nextInt();
    calculate(days);


  }

  public static void calculate(int days) {
    if (days==0)
      System.out.println("You do not have to pay anything");
    else if (days > 10){
        System.out.println("You are overdue, your cost is : $" + 15*days);
    }

  }
}
