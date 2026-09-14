/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  */

/**
*

* @author AULIA
  */
  package com.mycompany.crochetproject1;


  public class RumusCrochet {


private String namaStitch;
private String singkatan;
private String arti;
private String deskripsi;

public RumusCrochet(String namaStitch, String singkatan,
                    String arti, String deskripsi) {

    this.namaStitch = namaStitch;
    this.singkatan = singkatan;
    this.arti = arti;
    this.deskripsi = deskripsi;
}

public String getNamaStitch(){
    return namaStitch;
}
public String getSingkatan(){
    return singkatan;
}
public String getArti(){
    return arti;
}
public String getDeskripsi(){
    return deskripsi;
}

public void setNamaStitch(String namaStitch){
    this.namaStitch = namaStitch;
}
public void setSingkatan(String singkatan){
    if(singkatan == null || singkatan.isEmpty()){
        System.out.println("Singkatan tidak boleh kosong!");
    }else{
        this.singkatan = singkatan;
    }
}

public void setArti(String arti){
    this.arti = arti;
}
public void setDeskripsi(String deskripsi){
    this.deskripsi = deskripsi;
}
public void tampilkanInfo() {

    System.out.println("================================");
    System.out.println("CROCHET STITCH GUIDE");
    System.out.println("================================");
    System.out.println("Nama Stitch : " + namaStitch);
    System.out.println("Singkatan   : " + singkatan);
    System.out.println("Arti        : " + arti);
    System.out.println("Deskripsi   : " + deskripsi);
    System.out.println();
}

}
