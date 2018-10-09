package coml.example.admin.ontap;

public class SinhVien {
    private String anh;
    private String ten;
    private String cbox;

    public SinhVien(String anh, String ten,String cbox) {
        this.anh = anh;
        this.ten = ten;
        this.cbox = cbox;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCbox() {
        return cbox;
    }

    public void setCbox(String cbox) {
        this.cbox = cbox;
    }
}
