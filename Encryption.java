import java.util.Scanner;

public class Solution {
  public static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

  public static String encrypt(String message, int shiftKey) {
    message = message.toLowerCase();
    String cipherText = "";
    for (int ii = 0; ii < message.length(); ii++) {
      int charPosition = ALPHA.indexOf(message.charAt(ii));
      int keyVal = (shiftKey + charPosition) % 26;
      char replaceVal = ALPHA.charAt(keyVal);
      cipherText += replaceVal;
    }
    return cipherText;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message = "";
    int key = 0;
    System.out.print("Enter the String for Encryption:");
    message = sc.nextLine();

    System.out.println("\n\nEnter Shift Key:");
    key = sc.nextInt();
    System.out.println("\nEncrypted message: " + encrypt(message, key));
  }
}
