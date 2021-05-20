/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Other
 */
public class Diem {

    private int id;
    private Sinhvien sv;
    private double tienganh, tinhoc, gdtc;

    public Diem() {
    }

    public Diem(int id, Sinhvien sv, double tienganh, double tinhoc, double gdtc) {
        this.id = id;
        this.sv = sv;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sinhvien getSv() {
        return sv;
    }

    public void setSv(Sinhvien sv) {
        this.sv = sv;
    }

    public double getTienganh() {
        return tienganh;
    }

    public void setTienganh(double tienganh) {
        this.tienganh = tienganh;
    }

    public double getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(double tinhoc) {
        this.tinhoc = tinhoc;
    }

    public double getGdtc() {
        return gdtc;
    }

    public void setGdtc(double gdtc) {
        this.gdtc = gdtc;
    }

    public double getTBC() {
        return (getTienganh()+getGdtc()+getTinhoc())/3;
    }

    public String getXeploai() {
        String xl = "";
        double tbc = getTBC();
        if (tbc > 8) {
            xl = "Giỏi";
        } else if (tbc >= 7) {
            xl = "Khá";
        } else if ( tbc >= 5){
         xl = "Trung bình";
        } else {
          xl = "Yếu";
        }
        return xl;
    }
}
