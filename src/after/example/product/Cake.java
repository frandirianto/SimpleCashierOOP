package after.example.product;

import after.example.process.Cashier;

public class Cake extends Product{
    
    public Cake(){
    	setHarga(6000);
    	setSisa(25);
    }

	@Override
	public void OrderProduct() {
		// TODO Auto-generated method stub
		System.out.print("Berapa banyak cake yang ingin dibeli : ");
		int cake = Cashier.ScanInteger();
		if (cake > getSisa()) { 
			System.out.println("Maaf, persediaan cake tidak cukup"); 
		} else { 
			setSisa(getSisa() - cake);
			setPesan(getPesan() + cake);
			setTemppesan(getTemppesan() + getPesan());
			setPembelian(getHarga() * getPesan());
			setPrice(getPrice() * getPembelian());

		}
	}

} 
