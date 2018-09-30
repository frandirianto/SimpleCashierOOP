package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan_Char = new Scanner(System.in); //menangkap inputan bertipe charakter /string
        Scanner scan = new Scanner(System.in);      //menangkap inputan bertipe integer
        int cakeawal = 25, makecake = 0, sisacake = 0;
        makecake = cakeawal;
        int coffee = 0, cake = 0, shake = 0;
        int totalcof = 0, totalca = 0, totalsh = 0;
        int pesancof = 0, pesansh = 0, pesanca = 0;
        int hargacof = 0, hargash = 0, hargaca = 0;
        int hargacoffee = 5000, hargashake = 7000, hargacake = 6000;
        int totalbayar, totalpembelian = 0, bayar, sisa, totalpembelian1 = 0;
        String pilih;
        int temppesancof = 0, temppesansh = 0, temppesanca = 0;
        int pricecoffee = 0, priceshake = 0, pricecake = 0; //menyimpan total pembelian setiap makanan agar setelah diubah harga laporan sesuai pembelian
        int pembcof = 0, pembsh = 0, pembca = 0; //menampung total pembelian setiap makanan

        do { //perulangan do digunakan untuk mengulang menu kasir yang ada selama user tidak memilih keluar
            System.out.println(" ==================================================================");
            System.out.println(" =========================THE GEEK CAFE ==========================");
            System.out.println(" ==================================================================");
            System.out.println("Menu : ");
            System.out.println("\t\t a.Pemesanan");
            System.out.println("\t\t b.Buat Cake");
            System.out.println("\t\t c.Tampilkan Laporan Penjualan");
            System.out.println("\t\t d.Ubah");
            System.out.println("\t\t e.Keluar\n");
            System.out.print(" – Please select this menu above ? ");
            pilih = scan_Char.nextLine();

            if (pilih.equals("a") || pilih.equals("A")) {
                pesancof = 0;
                pesansh = 0;
                pesanca = 0;
                int pilihan = 0;
                do { //perulangan yang digunakan untuk mengulang menu pemesanan selama user tidak memilih untuk selesai
                    System.out.print("Menu Pemesanan : ");
                    System.out.println(" 1. Coffee");
                    System.out.println("\t\t 2. Shake");
                    System.out.println("\t\t 3. Cake");
                    System.out.println("\t\t 4. Completed select");
                    System.out.print("Please select this menu above ? ");
                    pilihan = scan.nextInt();
                    if (pilihan == 1) {
                        System.out.print("Berapa banyak coffee yang ingin dibeli : ");
                        coffee = scan.nextInt(); //pembelian kopi disimpan di coffee
                        pesancof += coffee; //dan dari coffee disimpan di pesancof untuk pembelian berikutnya ditambah
                        temppesancof += pesancof; //penyimpnan setiap pembelian coffee
                        pembcof = hargacoffee * pesancof;
                        pricecoffee = pricecoffee + pembcof;
//totalcof=totalcof+pesancof;
                    } else if (pilihan == 2) {
                        System.out.print("Berapa banyak shake yang ingin dibeli : ");
                        shake = scan.nextInt(); //pembelian shake disimpan di shake
                        pesansh = pesansh + shake; //dan dari shake disimpan di pesansh untuk pembelian berikutnya ditambah
                        temppesansh += pesansh; //penyimpnan setiap pembelian shake
                        pembsh = hargashake * pesansh;
                        priceshake = priceshake + pembsh;
//totalsh=totalsh+pesansh;
                    } else if (pilihan == 3) {
                        System.out.print("Berapa banyak cake yang ingin dibeli : ");
                        cake = scan.nextInt(); //pembelian cake disimpan di cake
                        if (cake > cakeawal) { //pengecekan cake yang dibeli jika melebihi persedian
                            System.out.println("Maaf, persediaan cake tidak cukup"); // akan dikerjakan
                        } else { //jika memenuhi kondisi ini makan akan dkerjakan
                            cakeawal = cakeawal - cake; //cakeawal akan dikuarangi jumlah pembelian cake
                            pesanca = pesanca + cake; //  dan dari cake disimpan di pesancake untuk pembelian berikutnya ditambah
                            temppesanca += pesanca; //penyimpnan setiap pembelian cake
                            pembca = hargacake * pesanca;
                            pricecake = pricecake + pembca;
//totalca=totalca+pesanca;
                        }
                    } else if (pilihan == 4) {
                        hargacof = hargacoffee; //penginisialisasian harga coffee awal disimpan di hargacof agar setelah hargacoffee dibuah harga akan mengubah hargacof
                        hargash = hargashake; //idem
                        hargaca = hargacake; //idem
                        totalpembelian = ((pesancof * hargacof) + (pesansh * hargash) + (pesanca * hargacake)); //totalpembelian menghitung jumlah makanan yg dibeli(yang disimpan di pesancof/pesansh/pesanca) dengan dikalikan harganya

                        do
                        { //perulangan yang digunakan untuk mengulang menu pembayaran selama uang yang dibayar kurang dari total pembelian maka akan mengulang
                            System.out.println("Total biayanya adalah Rp. " + totalpembelian);
                            System.out.print("Masukkan jumlah uang pembayaran : ");
                            bayar = scan.nextInt(); //menangkap inputan user dan disimpan di bayar
                            sisa = bayar - totalpembelian; //untuk kembalian
                        } while (bayar < totalpembelian);
                        if (sisa == 0) {  //jika uang yang dibayar pas makan akan dikerjakan
                            System.out.println("Uang Pas.Terima kasih atas pembeliannya");
                        } else {  //jika uang yang dibayar lebih makan akan dikerjakan
                            System.out.println("Pengembalian " + sisa);
                        }
                    } else { //kondisi yang akan dikerjakan jika user menginputkan selain pilihan yang ada di menu pemesanan
                        System.out.println("Maaf, pilihan yang anda masukkan salah");
                    }

                } while (pilihan != 4); //selama tidak memilih selesai makan akan mengulang menu pemesanan

            } else if (pilih.equals("b") || pilih.equals("B")) { //akan dikerjakan jika pilihan user memilih b (menu buat cake)
                cakeawal = cakeawal + 25; //cake awal akan ditambahkan 25 bauh cake
                System.out.println("25cake sudah ditambah.Total cake di cafe sekarang " + cakeawal);
            } else if (pilih.equals("c") || pilih.equals("C")) { //akan dikerjakan jika pilihan user memilih c (menu laporan penjualan)
//hargacof=hargacoffee;
//hargash=hargashake;
//hargaca=hargacake;
                totalpembelian1 = (pricecoffee) + (priceshake) + (pricecake); //total pembelian dari seluruh pembelian yang diinputkan oleh user
//agar pencetakan laporan mencetak semua pembelian/transaksi yang ada
                sisacake = cakeawal; //penginisialisaian sisa cake yang tidak terjual sama dengan cake yang disimpan di cakeawal yang cakeawal sudah dikurangi dengan cake(penyimpanan cake yang dibeli)
                System.out.println("\nCake belum terjual : "+sisacake);
                System.out.println("Coffee \t: "+temppesancof +"\tRp. "+(pricecoffee))
                ; //menampilkan jumlah coffee yang dibeli dan total pembelian
                System.out.println("Shake  \t: "+temppesansh +"\tRp. "+(priceshake))
                ;    //menampilkan jumlah shake yang dibeli dan total pembelian
                System.out.println("Cake   \t: "+temppesanca +"\tRp. "+(pricecake))
                ; //menampilkan jumlah cake yang dibeli dan total pembelian
                System.out.println("_______________________________");
                System.out.println("Total  \t: "+(temppesancof + temppesansh + temppesanca) +"\tRp. "+totalpembelian1)
                ; //total smw pembelian
            } else if (pilih.equals("d") || pilih.equals("D")) { //akan dikerjakan jika pilihan user memilih d (menu mengubah harga)
                int diubah = 0; //tipe data int dengan variabel diubah untuk penyimpanan inputan user yang akan diubah
                int hargacoffeebaru = 0, hargashakebaru = 0, hargacakebaru = 0; //penyimpanan harga baru
                while (diubah != 4) { //selama user tidak memilih 4(selesai) dari menu dibawah makan akan dikerjakan berulang-ulang
                    System.out.println("\nUbah Harga :\n \t1.Kopi \t2.Shake \t3.Cake \t4.Selesai");
                    System.out.print("Pilih nomor yang akan di ubah harganya : ");
                    diubah = scan.nextInt();
                    switch (diubah) {
                        case 1:
                            System.out.print("Harga kopi awal " + hargacoffee +".Masukkan harga kopi baru : ");
                            hargacoffeebaru = scan.nextInt(); //penyimpanan inputan user di hargacoffeebaru
                            hargacoffee = hargacoffeebaru;
                            break; //case1 akan berhenti
                        case 2:
                            System.out.print("Harga Shake awal " + hargashake +".Masukkan harga Shake baru : ");
                            hargashakebaru = scan.nextInt(); //penyimpanan inputan user di hargashakebaru
                            hargashake = hargashakebaru;
                            break; //case2 akan berhenti
                        case 3:
                            System.out.print("Harga cake awal " + hargacake +".Masukkan harga cake baru : ");
                            hargacakebaru = scan.nextInt(); //penyimpanan inputan user di hargacakebaru
                            hargacake = hargacakebaru;
                            break; //case3 akan berhenti
                        default: //dikerjakan jika user menginputankan tidak sesuai menu yang ada
                            System.out.println("Masukkan menu yang ada !!");
                            break; //default akan berhenti
                    }

                }
            } else if (pilih.equals("e") || pilih.equals("E")) { //akan dikerjakan jika pilihan user memilih e dan program akan berhenti
                System.out.println("Bye bye");
                break;
            }

        }
        while (!pilih.equals("e") || !pilih.equals("E")); //pengecekan kondisi selama pilihan user dari menu awal tidak sama dengan e makan akan diulang
    }
}
