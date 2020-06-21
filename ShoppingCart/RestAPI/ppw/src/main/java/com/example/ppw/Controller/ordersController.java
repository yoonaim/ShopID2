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
       
      }
      System.out.println("Your grade is " + grade);
   }
}
