package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tanımlama Kısmı
	 int mat,fizik,turkce,kimya, muzik, DersNotu=0, DersSayısı=0;
     double avarage;

        Scanner inp=new Scanner(System.in);

        //Bilgileri Alma Kısmı
        System.out.print("Lütfen Matematik Notunuzu Giriniz: ");
        mat=inp.nextInt();
        System.out.print("Lütfen Fizik Notunuzu Giriniz: ");
        fizik=inp.nextInt();
        System.out.print("Lütfen Türkçe Notunuzu Giriniz: ");
        turkce=inp.nextInt();
        System.out.print("Lütfen Kimya Notunuzu Giriniz: ");
        kimya=inp.nextInt();
        System.out.print("Lütfen  Müzik Notunuzu Giriniz: ");
        muzik=inp.nextInt();

        //Kontrol Etme Kısmı
        if(mat>=0 && mat<=100){
            DersNotu+=mat;
            DersSayısı++;
        }
        if(fizik>=0 && fizik<=100){
             DersNotu+=fizik;
             DersSayısı++;
        }
        if(turkce>=0 && turkce<=100){
             DersNotu+=turkce;
             DersSayısı++;
        }
        if(kimya>=0 && kimya<=100){
             DersNotu+=kimya;
             DersSayısı++;
        }
        if(muzik>=0 && muzik<=100){
             DersNotu+=muzik;
             DersSayısı++;
        }
        // Ve sonuçlandırma Kısmı
        avarage=DersNotu/DersSayısı;
        if (avarage<55){
            System.out.println("Notlarınız geçmeye yetmedi , Seneye görüşürüz: " + avarage);
        }
        else System.out.println("Sınıfı Başarıyla Geçtiniz, Not Ortalamanız: " + avarage);


    }


}
