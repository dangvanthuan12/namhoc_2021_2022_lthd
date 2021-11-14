package dangHoaiBao_12345678;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSach {

	public static void main(String[] args) {
		String ngayS="12/12/2012";
		Date ngayNhap=null;
		SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngayNhap= fd.parse(ngayS);
		} catch (Exception e) {
			System.out.println("Lỗi ngày");
		}
		Sach sd= new SachGiaoKhoa();
		sd.tieuDe1();
		Sach s= new SachGiaoKhoa("12345678", ngayNhap,12000, 3, "Giáo dục Cần Thơ",true);
		System.out.println(s);
		Sach s2= new SachThamKhao("98754321", ngayNhap, 13000, 6, "Giáo dục TP.HCM", 2000);

	}

}
