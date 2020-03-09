package after.example.product;

public abstract class Product {
    
	private int pesan;
	private int harga;
	private int tempPesan;
	private int price;
	private int pembelian;
	private int bayar;
	private int sisa;
    
	public int getPesan() {
		return pesan;
	}
	public void setPesan(int pesan) {
		this.pesan = pesan;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public int getTemppesan() {
		return tempPesan;
	}
	public void setTemppesan(int temppesan) {
		this.tempPesan = temppesan;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPembelian() {
		return pembelian;
	}
	public void setPembelian(int pembelian) {
		this.pembelian = pembelian;
	}
	public int getBayar() {
		return bayar;
	}
	public void setBayar(int bayar) {
		this.bayar = bayar;
	}
	public int getSisa() {
		return sisa;
	}
	public void setSisa(int sisa) {
		this.sisa = sisa;
	}

	public abstract void OrderProduct();
}
