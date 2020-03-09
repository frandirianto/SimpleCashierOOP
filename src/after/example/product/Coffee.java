package after.example.product;

import after.example.process.Cashier;

public class Coffee extends Product{
	
    public Coffee(){
    	setHarga(5000);
    }

	@Override
	public void OrderProduct() {
		// TODO Auto-generated method stub
		System.out.print("Input Number of Coffee : ");
		int numberOfCoffee = Cashier.ScanInteger(); 
		setPesan(getPesan() + numberOfCoffee); 
		setTemppesan(getPesan());
		setPembelian(getHarga() * getPesan());
		setPrice(getPrice() * getPembelian());
	}
}
