@RestController
@RequestMapping("/shoppingcart")

//class for kondisi
public class ContohKondisi {

    public static void main(String[] args) {
        boolean kondisi;

        kondisi= (1+1) == 2 && 2>1;

        if (kondisi){
            System.out.println("Jawaban anda benar...");
        }
        else {
            System.out.println("Jawaban anda benar salah...");
        }
    }
}

//percabangan yang akan dibuat
public class ContohPercabanganSwitch {

   public static void main(String args[]) {
      //berikut ini adalah deklarasi variabel 
      char grade = 'A';
        
      switch(grade) {
         case 'A' :
            System.out.println("Perfect!");
            // Statements
            break;
            // You can have any number of case statements.
         case 'B' :
            System.out.println("Excellent!");
            // Statements
            break;
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      
      System.out.println("Your grade is " + grade);
   }
}

//berikut ada class cetak angka
class CetakAngka{
   /*contoh membuat variabel dan scanner
    contoh komentar*/
       public static void main(String[] argumen){
   
           for(int i=0; i <= 10; i++){
               System.out.print( i + " " );
           }
   
       }
   
   }
//import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;
/** 
 * The HelloWorldApp class implements an application that
 * simply displays "Hello World!" to the standard output.
 */
