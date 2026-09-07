/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author AULIA
 */
public class crochetproject1 {
public static void main(String[] args) {
        RumusCrochet ch = new RumusCrochet(
                "Chain",
                "CH",
                "Rantai",
                "Tusuk dasar untuk membuat rantai pada crochet."
        );

        RumusCrochet sc = new RumusCrochet(
                "Single Crochet",
                "SC",
                "Tusuk Tunggal",
                "Tusuk dasar yang menghasilkan rajutan cukup rapat."
        );

        RumusCrochet hdc = new RumusCrochet(
                "Half Double Crochet",
                "HDC",
                "Setengah Tusuk Ganda",
                "Tusuk dengan tinggi di antara SC dan DC."
        );

        RumusCrochet dc = new RumusCrochet(
                "Double Crochet",
                "DC",
                "Tusuk Ganda",
                "Tusuk yang lebih tinggi dibandingkan SC dan HDC."
        );

        RumusCrochet slst = new RumusCrochet(
                "Slip Stitch",
                "SL ST",
                "Tusuk Selip",
                "Tusuk yang digunakan untuk menyambung atau berpindah posisi."
        );

        ch.tampilkanInfo();
        sc.tampilkanInfo();
        hdc.tampilkanInfo();
        dc.tampilkanInfo();
        slst.tampilkanInfo();
    }  
}
