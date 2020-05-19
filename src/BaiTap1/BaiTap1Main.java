/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author phamthu
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HoaDon hoaDonHeader = new HoaDon.HoaDonHeader()
                                .addMaHoaDon("001")
                                .addNgayBan("20/1/2019")
                                .addTenKhachHang("phạm thị thu")
                                .buiderHoaDonHeader();
        System.out.println(hoaDonHeader.toString());
        HoaDon hoaDonHeader1 = new HoaDon.HoaDonHeader()
                                .addMaHoaDon("002")
                                .addNgayBan("20/1/2018")
                                .addTenKhachHang("nguyễn thanh hà")
                                .buiderHoaDonHeader();
        System.out.println(hoaDonHeader1.toString());
        HoaDon cthd = new HoaDon.CTHD()
                        .addSanPham("son môi")
                        .addSoLuong(2)
                        .addDonGia(150)
                        .addChietKhau(10)
                        .buiderCTHD();
        System.out.println(cthd.toString());
        
    }
    
}
