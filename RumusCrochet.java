/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

/**
 *
 * @author AULIA
 */
package com.mycompany.Crochetproject1;

public class RumusCrochet {

    String namaStitch;
    String singkatan;
    String arti;
    String deskripsi;

    public RumusCrochet(String namaStitch, String singkatan,
                        String arti, String deskripsi) {

        this.namaStitch = namaStitch;
        this.singkatan = singkatan;
        this.arti = arti;
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