// 13020210071
// Bs.febriayu fadhlikayani.ms
// selasa,03,2023

import java.util.Scanner;


public class Konveksiwaktu
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan detik: ");
        int detik = sc .nextInt();

    //Menghitung detik sekarang
	int ds = detik % 3600 % 60;
    //Menghitung total menit
	int tm = detik / 60 ; 
    //Menghitung menit sekarang
	int ms = detik % 3600 / 60; 
    //Menghitung total jam
    	int tj = detik / 3600;
    //Menghitung jam sekarang
	int js = tj % 24;
        
       System.out.println("Detik sekarang = " + ds + "detik");
       System.out.println("Total Menit = " + tm + "menit");
       System.out.println("Menit sekarang = " + ms +"menit");
       System.out.println("Total jam = " + tj + "jam");
	 System.out.println("Jam sekarang = " + js +"jam");

       //Tampil waktu
       System.out.println("waktu("+js +":"+ ms+":" + ds +")");
       
       
       
    }
}