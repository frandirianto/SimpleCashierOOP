package before.myapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pilih;
        int harga_lv1 = 10000;
        int harga_lv2 = 12000;
        int harga_lv3 = 14000;
        int harga_lv4 = 16000;
        int harga_lv5 = 18000;
        int jumlahMie1, jumlahMie2, jumlahMie3, jumlahMie4, jumlahMie5;
        int temp = 0;

        System.out.println("=========== MENU MIE SETAN ===========");
        System.out.println("1. Mie Setan LV 1 \t = Rp. 10000");
        System.out.println("2. Mie Setan LV 2 \t = Rp. 12000");
        System.out.println("3. Mie Setan LV 3 \t = Rp. 14000");
        System.out.println("4. Mie Setan LV 4 \t = Rp. 16000");
        System.out.println("5. Mie Setan LV 5 \t = Rp. 18000");
        System.out.println("6. Bayar ");
        System.out.println("0. Keluar ");

        do {    //do looping cashier menu if user don't choose exit
            System.out.print("Masukkan pilihana anda: ");
            pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Berapa banyak? ");
                    jumlahMie1 = scan.nextInt();
                    jumlahMie1 *= harga_lv1;
                    temp += jumlahMie1;
                    System.out.println("Total " + jumlahMie1);
                    break;
                case 2:
                    System.out.println("Berapa banyak? ");
                    jumlahMie2 = scan.nextInt();
                    jumlahMie2 *= harga_lv2;
                    temp += jumlahMie2;
                    System.out.println("Total " + jumlahMie2);
                    break;
                case 3:
                    System.out.println("Berapa banyak?");
                    jumlahMie3 = scan.nextInt();
                    jumlahMie3 *= harga_lv3;
                    temp += jumlahMie3;
                    System.out.println("Total " + jumlahMie3);
                    break;
                case 4:
                    System.out.println("Berapa banyak?");
                    jumlahMie4 = scan.nextInt();
                    jumlahMie4 *= harga_lv4;
                    temp += jumlahMie4;
                    System.out.println("Total " + jumlahMie4);
                    break;
                case 5:
                    System.out.println("Berapa banyak?");
                    jumlahMie5 = scan.nextInt();
                    jumlahMie5 *= harga_lv5;
                    temp += jumlahMie5;
                    System.out.println("Total " + jumlahMie5);
                    break;
                case 6:
                    System.out.println("Total: " + temp);
                    System.out.println("Masukkan jumlah uang yang akan dibayar: ");
                    int bayar = scan.nextInt();
                    if (bayar > temp) {
                        System.out.println("Kembalian anda " + (bayar - temp));
                    } else if (bayar == temp) {
                        System.out.println("Uang anda pas");
                    } else {
                        System.out.println("Uang anda kurang " + (temp - bayar));
                    }

                    pilih = 0;
                    break;
                default:
                    break;
            }

        } while (pilih != 0);
    }

}

















