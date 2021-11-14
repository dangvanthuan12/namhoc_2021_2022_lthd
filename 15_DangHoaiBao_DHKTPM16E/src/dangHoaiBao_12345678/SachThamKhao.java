package dangHoaiBao_12345678;

import java.util.Date;

public class SachThamKhao extends Sach{
	
	private double thue;
	
	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	

	public SachThamKhao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SachThamKhao(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB, double t) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		this.thue=t;
	}

	@Override
	public double getThanhTien() {
		return getDonGia()*getSoLuong()+getThue();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
