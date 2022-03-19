package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,islem,toplam,fark,carpim,bolum;
        Scanner scan = new Scanner(System.in);

        System.out.print("sayı 1: ");
        n1 = scan.nextInt();
        System.out.print("sayı 2 ");
        n2 = scan.nextInt();

        System.out.println("Yapmak istediğiniz işlem için seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        islem = scan.nextInt();

        switch (islem){
            case 1:
                toplam = n1 + n2;
                System.out.println( n1 + " + " + n2 + " = " + toplam);
                break;
            case 2:
                fark = n1 - n2;
                System.out.println( n1 + " - " + n2 + " = " + fark);
                break;
            case 3:
                carpim = n1 * n2;
                System.out.println( n1 + " * " + n2 + " = " + carpim);
                break;
            case 4:
                if( n2==0 ){
                    System.out.println("Sayı sıfıra bölünmez!");
                }
                else{
                    bolum = n1 / n2;
                    System.out.println( n1 + " / " + n2 + " = " + bolum);
                }
                break;
            default:
                System.out.print("Geçersiz bir işlem girdiniz!");
                break;
        }
    }
}

