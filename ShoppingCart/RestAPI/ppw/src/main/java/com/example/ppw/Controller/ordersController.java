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

/** 
 * The HelloWorldApp class implements an application that
 * simply displays "Hello World!" to the standard output.
 */
