/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Other
 */
public class SinhvienDAO {
    public static List<Sinhvien> list = new ArrayList<>();
    
    public int add(Sinhvien sv){
        list.add(sv);
        return 1;
    }
    public List<Sinhvien> getAllSinhVien(){
        return list;
    }
    public int delSinhVienByID( String masv ) {
        for(Sinhvien sv : list){
            if ( sv.getMaSV().equalsIgnoreCase(masv) ) {
                list.remove(sv);
                return 1; 
            }
        }
        return -1;
    }
    public Sinhvien getSinhVienByID(String id){
        for (Sinhvien sv : list){
            if(sv.getMaSV().equalsIgnoreCase(id)){
                return sv;
            }
        }
        return  null;
    }
    
    public Boolean hasSinhVienByID(String id){
        for (Sinhvien sv : list){
            if(sv.getMaSV().equalsIgnoreCase(id)){
                return true;
            }
        }
        return  false;
    }
    public int updateSinhVienByID(Sinhvien svNew){
        for(Sinhvien sv: list){
            if(sv.getMaSV().equalsIgnoreCase(svNew.getMaSV())){
                sv.setDiaChi(svNew.getDiaChi());
                sv.setGioiTinh(svNew.isGioiTinh());
                sv.setHinhAnh(svNew.getHinhAnh());
                sv.setNgaySinh(svNew.getNgaySinh());
                sv.setEmail(svNew.getEmail());
                sv.setSđt(svNew.getSđt());
                sv.setTenSV(svNew.getTenSV());
                return  1;
            }
        }
        return  -1;
    }
}
