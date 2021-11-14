package dangHoaiBao_12345678;

import java.util.Date;

public class SachGiaoKhoa extends Sach {
	private boolean trangThai;

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public double getThanhTien() {
		double tt;
		if (isTrangThai()) {
			tt= getSoLuong()*getDonGia();
			
		} else {
			tt= getSoLuong()*getDonGia()/2;
		}
		return tt ;
	}
	// constructor
	public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB, boolean trangThai) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		this.trangThai = trangThai;
	}

	public SachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String tt="";
		if (isTrangThai()) {
			tt="Sách mới";
		} else {
			tt="Sách cũ";
		}
		String s="";
		s+=s.format("%12s|%-15s|", tt, ft.format(getThanhTien()));
		return super.toString()+s;
	}
	

}
