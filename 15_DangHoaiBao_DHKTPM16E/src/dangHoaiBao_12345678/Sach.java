package dangHoaiBao_12345678;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class  Sach {
	protected String maSach;
	protected Date ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXB;
	public abstract double getThanhTien();
	// Đóng gói
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	// Tạo contructor
	public Sach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB) {
	
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXB = nhaXB;
	}
	public Sach() {}
	public static void tieuDe1() {
		System.out.println("\t\t\t\tCHƯƠNG TRÌNH QUẢN LÝ SÁCH");
		for (int i = 0; i < 106; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-12s|%-12s|%-10s|%-25s|%12s|%15s|\n", 
		"Mã Sách","Ngày nhập", "Đơn giá", "Số lượng","Nhà xuất bản","Trạng thái","Thành tiền");
		for (int i = 0; i <106; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	public static void tieuDe2() {
		System.out.println("\t\t\t\tCHƯƠNG TRÌNH QUẢN LÝ SÁCH");
		for (int i = 0; i < 92; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-12s|%-12s|%-10s|%-25s|%12s|\n", "Mã Sách","Ngày nhập", "Đơn giá", "Số lượng","Nhà xuất bản","Thuế");
		for (int i = 0; i <92; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
	DecimalFormat ft= new DecimalFormat("###,###,00 VND");
	@Override
	public String toString() {
		
		String s="";
		s+=s.format("|%-12s|%-12s|%-12s|%-10s|%-25s|",
				getMaSach(),fd.format(getNgayNhap().getTime()),
				ft.format(getDonGia()), getSoLuong(), getNhaXB());
		return s;
	}
}
