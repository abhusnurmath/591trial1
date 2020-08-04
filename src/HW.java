import java.util.Scanner;

public class HW {
  
  public static void main(String[] args) {
    System.out.println("hello, Arvind");
    Scanner s = new Scanner(System.in);
    if (s.next() == "abcd") {
      int x = 5;
      System.out.println(x);
      System.out.println("Michelle pushed first and I pushed after");
    }
    s.close();
  }

}
