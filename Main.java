import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//        System.out.println("i = " + i);
//        }


//        < Prints whether the value is positive, negative, or 0 >
        Scanner S = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int number = S.nextInt();
//        if (number >=1){
//            System.out.println("The number is positive");
//        } else if (number == 0 ) {
//            System.out.println("The number equals 0");
//        } else {
//            System.out.println("The number is negative ");



//         < 3 numbers from the user, then prints the largest number >
        System.out.println("Enter first number");
        int a = S.nextInt();

        System.out.println("Enter second number");
        int b = S.nextInt();

        System.out.println("Enter third number");
        int c = S.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the largest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number");

        } else {
            System.out.println(b + "is the largest number ");

        }
    }}