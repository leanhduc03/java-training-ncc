package enums; 

public class EnumEx {
    public static void main(String[] args) {

        TrangThai trangThai = TrangThai.DANG_XU_LY;
        System.out.println("Trạng thái hiện tại: " + trangThai);
        
        //Enum trong switch
        switch (trangThai) {
            case CHO_XU_LY:
                System.out.println("Đơn hàng đang chờ xử lý");
                break;
            case DANG_XU_LY:
                System.out.println("Đơn hàng đang được xử lý");
                break;
            case DA_GIAO_HANG:
                System.out.println("Đơn hàng đã giao thành công");
                break;
            case DA_HUY:
                System.out.println("Đơn hàng đã bị hủy");
                break;
        }
        
        //Enum có thuộc tính và phương thức
        MauSac mauSac = MauSac.XANH_LA;
        System.out.println("Mô tả: " + mauSac.getMoTa());
        
        //Duyệt tất cả giá trị của enum
        System.out.println("\nTất cả trạng thái đơn hàng:");
        for (TrangThai tt : TrangThai.values()) {
            System.out.println("- " + tt);
        }
    }
}

// Enum đơn giản
enum TrangThai {
    CHO_XU_LY,
    DANG_XU_LY, 
    DA_GIAO_HANG, 
    DA_HUY
}

// Enum với thuộc tính và phương thức
enum MauSac {
    DO( "Màu đỏ"),
    XANH_LA( "Màu xanh lá"),
    XANH_DUONG( "Màu xanh dương");
    
    private final String moTa;
    
    MauSac( String moTa) {
        this.moTa = moTa;
    }
    public String getMoTa() {
        return moTa;
    }
}
