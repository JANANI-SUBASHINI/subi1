# subi1
import java.io.*;
import java.util.Scanner;
public class Main
 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String input = sc.nextLine();
    String r = "";
    char a = input.charAt(0);
    r = r + Character.toUpperCase(a);
    for (int i = 1; i < input.length(); i++) {
      char b = input.charAt(i);
      char c = input.charAt(i - 1);
      if (c == ' ') {
        r = r + Character.toUpperCase(b);
      } else {
        r = r + b;
      }
    }
    System.out.println(r);
  }
}
