@RestController
@RequestMapping("/shoppingcart")
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

public class ContohPercabanganSwitch {

   public static void main(String args[]) {

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
