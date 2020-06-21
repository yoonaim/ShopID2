//fungsi untuk menambah belanja
package com.example.ppw.controller;

import com.example.ppw.model.orders;
import com.example.ppw.repository.ordersRepo;
import com.example.ppw.repository.testNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

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
public class ContohIfElse {

    public static void main(String[] args) {
        int nilai = 10;
        String pesan="", jumlah="";

        if (nilai>2) {
            jumlah = "Lebih besar dari 2";
            if(nilai%2 == 0){
                pesan = "Bilangan Genap";
            }else{
                pesan = "Bilangan Ganjil";
            }
            System.out.println(jumlah+" dan "+pesan);
        }else{
            jumlah = "Lebih kecil dari 2";
            System.out.println(jumlah);
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
class CetakAngka{
/*contoh membuat variabel dan scanner
 contoh komentar*/
    public static void main(String[] argumen){

        for(int i=0; i <= 10; i++){
            System.out.print( i + " " );
        }

    }

}
}
