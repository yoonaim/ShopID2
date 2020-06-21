</pre>
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
 package javaapplication1;
 
/**
 *
 * @author toni
 */
 public class JavaApplication1 {
 public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  String nama;
  String alamat;
  System.out.print("Masukan nama anda : " );
  nama=input.nextLine();
  System.out.print("Masukkan Alamat anda : " );
  alamat=input.nextLine();
  System.out.println("Anda Memiliki nama "+ nama +" yang beralamat "+alamat );
 }
 }
