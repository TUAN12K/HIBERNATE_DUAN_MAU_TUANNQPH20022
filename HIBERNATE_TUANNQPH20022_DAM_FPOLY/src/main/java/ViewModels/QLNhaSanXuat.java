package ViewModels;

import java.util.UUID;

public class QLNhaSanXuat {

    private UUID Id;

    private String ma;

    private String ten;

    public QLNhaSanXuat() {
    }

    public QLNhaSanXuat(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public QLNhaSanXuat(UUID Id, String ma, String ten) {
        this.Id = Id;
        this.ma = ma;
        this.ten = ten;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID Id) {
        this.Id = Id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
