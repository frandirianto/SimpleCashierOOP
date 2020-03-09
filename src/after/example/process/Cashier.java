package after.example.process;

import java.util.Scanner;

import after.example.product.Cake;
import after.example.product.Cart;
import after.example.product.Coffee;
import after.example.product.Shake;

public class Cashier {

	private Coffee coffee = new Coffee();
	private Shake shake = new Shake();
	private Cake cake = new Cake();
	private Cart cart = new Cart();
	private static Scanner scan = new Scanner(System.in);
	
	public void OrderMenu(int number) {
		if (number == 1) {
			coffee.OrderProduct();

		} else if (number == 2) {
			shake.OrderProduct();

		} else if (number == 3) {
			cake.OrderProduct();
			
		} else if (number == 4) {
			
			int totalCoffee = coffee.getPesan() * coffee.getHarga();
			int totalShake = shake.getPesan() * shake.getHarga();
			int totalCake = cake.getPesan() * cake.getHarga();
			cart.setTotalPembelian(totalCoffee + totalShake + totalCake); 
			int bayar = 0;
			do
			{ 
				System.out.println("Total biayanya adalah Rp. " + cart.getTotalPembelian());
				System.out.print("Masukkan jumlah uang pembayaran : ");
				bayar = scan.nextInt();
				cart.setBayar(bayar);
			} while (cart.getBayar() < cart.getTotalPembelian());
			if (bayar == cart.getTotalPembelian()) {  
				System.out.println("Uang Pas.Terima kasih atas pembeliannya");
			} 
		} 
	}
	
	public void ChooseMenu(int number) {
		if (number == 1) {
			int choose = 0;
			do { 
				Menu.ShowMenu();
				choose = ScanInteger();
				OrderMenu(choose);
			} while (choose != 4); 

		} else if (number == 2) { 
			cake.setSisa(cake.getSisa() + 25);
			System.out.println("25cake sudah ditambah.Total cake di cafe sekarang " + cake.getSisa());
			
		} else if (number == 3) { 
			cart.setTotalPembelian1(coffee.getPrice() + shake.getPrice() + cake.getPrice());
			System.out.println("\nCake belum terjual : "+ cake.getSisa());
			System.out.println("Coffee \t: "+coffee.getTemppesan() +"\tRp. "+(coffee.getPrice())); 
			System.out.println("Shake  \t: "+shake.getTemppesan() +"\tRp. "+(shake.getPrice()));
			System.out.println("Cake   \t: "+cake.getTemppesan() +"\tRp. "+(cake.getPrice()));
			System.out.println("_______________________________");
			System.out.println("Total  \t: "+(coffee.getTemppesan() + shake.getTemppesan() + cake.getTemppesan()) +"\tRp. "+ cart.getTotalPembelian1());
		} else if (number == 4) { 
			int diubah = 0; 
			while (diubah != 4) { 
				System.out.println("\nUbah Harga :\n \t1.Kopi \t2.Shake \t3.Cake \t4.Selesai");
				System.out.print("Pilih nomor yang akan di ubah harganya : ");
				diubah = scan.nextInt();
				changeMenu4(diubah);
			}
		} 
	}
	
	public int changeMenu4(int diubah){
		int hargacoffeebaru = 0, hargashakebaru = 0, hargacakebaru = 0; 
		switch (diubah) {
		case 1:
			System.out.print("Harga kopi awal " + coffee.getHarga() +".Masukkan harga kopi baru : ");
			hargacoffeebaru = scan.nextInt(); 
			coffee.setHarga(hargacoffeebaru);
			break; 
		case 2:
			System.out.print("Harga Shake awal " + shake.getHarga() +".Masukkan harga Shake baru : ");
			hargashakebaru = scan.nextInt(); 
			shake.setHarga(hargashakebaru);
			break;
		case 3:
			System.out.print("Harga cake awal " + cake.getHarga() +".Masukkan harga cake baru : ");
			hargacakebaru = scan.nextInt(); 
			cake.setHarga(hargacakebaru);
			break; 
		default: 
			System.out.println("Masukkan menu yang ada !!");
			break; 
		}
		
		return diubah;
	}

	public static int ScanInteger() {
		int number = -1;
		try {
			number = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Input must number");
			number = -1;
		}
		scan.nextLine();
		return number;
	}
	
	public Cashier() {
		int choose;
		scan = new Scanner(System.in);
		do { 
			Menu.Title();
			choose = ScanInteger();
			ChooseMenu(choose);
		}while (choose != 5);
		System.out.println("Bye-bye !!");
	}
	 
}
