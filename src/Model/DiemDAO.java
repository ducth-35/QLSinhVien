/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Other
 */
public class DiemDAO {

    List<Diem> list = new ArrayList<>();

    public int add(Diem d) {
        list.add(d);
        return 1;
    }

    public List<Diem> getAllDiem() {
        return list;
    }

    public Diem getOneDiemByMaSV(String masv) {
        for (Diem d : list) {
            if (d.getSv().getMaSV().equalsIgnoreCase(masv)) {
                return d;
            }
        }
        return null;
    }

    public int updateDiem(Diem dNew) {
        for (Diem d : list) {
            if (d.getSv().getMaSV().equalsIgnoreCase(dNew.getSv().getMaSV())) {
                d.setTienganh((dNew.getTienganh()));
            }
            d.setTinhoc((dNew.getTinhoc()));
            d.setGdtc(dNew.getGdtc());
            return 1;
        }
        return -1;
    }

    public int delDiem(String masv) {
        Diem d = getOneDiemByMaSV(masv);
        if (d != null) {
            list.remove(d);
            return 1;
        }
        return -1;
    }
    public Diem getAllPosition(int pos){
     return list.get(pos);
    }
}
