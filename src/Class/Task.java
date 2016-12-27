/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Irfandi
 */
public class Task {
    String nama, deskripsi;
    double durasi;
    Task next;

    public Task(String nama, String deskripsi, double durasi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
    }
    
    
}
