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
public class TaskList {

    Task current, pertama, terakhir;
    int size = 0;

    Task GetTask() {
        return pertama;
    }

    boolean TambahTask(String nama, String Deskripsi, double durasi) {
        Task tambah = new Task(nama, Deskripsi, durasi);
        try {
            if (pertama == null) {
                pertama = terakhir = tambah;
            } else {
                terakhir.next = tambah;
                terakhir = tambah;
            }
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    void DequeueTask() {
        pertama = pertama.next;
    }

    boolean HapusTaskTertentu(String nama) {
        Task temp = pertama;

        if (temp.nama.equals(nama)) {
            if (temp.next == null) {
                temp = null;
            } else {
                pertama = temp.next;
                temp = null;
            }
            size--;
            return true;
        } else {
            while (temp != null) {
                if (temp.next.nama.equals(nama)) {
                    temp.next = temp.next.next;
                    size--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
}
