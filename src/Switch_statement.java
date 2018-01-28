import java.util.Scanner;
public class Switch_statement {
  public static void main(String[] args){

    Scanner userIn = new Scanner(System.in);

    System.out.println("Enter a number between 1 and 10: ");
    int userNum = userIn.nextInt();

    if(userNum >= 1 && userNum <= 10) {
      switch (userNum) {
        case 1:
          System.out.println("The number " + userNum + " is uno in Spanish.");
          break;

        case 2:
          System.out.println("The number " + userNum + " is dos in Spanish.");
          break;

        case 3:
          System.out.println("The number " + userNum + " is tres in Spanish.");
          break;

        case 4:
          System.out.println("The number " + userNum + " is cuatro in Spanish.");
          break;

        case 5:
          System.out.println("The number " + userNum + " is cinco in Spanish.");
          break;

        case 6:
          System.out.println("The number " + userNum + " is seis in Spanish.");
          break;

        case 7:
          System.out.println("The number " + userNum + " is siete in Spanish.");
          break;

        case 8:
          System.out.println("The number " + userNum + " is ocho in Spanish.");
          break;

        case 9:
          System.out.println("The number " + userNum + " is nueve in Spanish.");
          break;

        case 10:
          System.out.println("The number " + userNum + " is diez in Spanish.");
          break;

      }
    }
    else
      System.out.println("The number you entered is outside the valid range!");
  }
}
