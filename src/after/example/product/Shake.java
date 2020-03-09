package after.example.product;

import after.example.process.Cashier;

public class Shake extends Product{
    public Shake(){
    	setHarga(7000);
    }

	@Override
	public void OrderProduct() {
		// TODO Auto-generated method stub
		System.out.print("Berapa banyak shake yang ingin dibeli : ");
		int shake = Cashier.ScanInteger();
		setPesan(getPesan() + shake);
		setTemppesan(getPesan());
		setPembelian(getHarga() * getPesan());
		setPrice(getPrice() + getPembelian());
	}
}
