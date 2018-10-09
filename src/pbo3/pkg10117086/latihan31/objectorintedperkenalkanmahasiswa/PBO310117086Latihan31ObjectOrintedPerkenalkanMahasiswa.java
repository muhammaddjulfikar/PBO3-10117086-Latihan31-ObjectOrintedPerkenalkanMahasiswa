/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan31.objectorintedperkenalkanmahasiswa;

/**
 *
 * @author Lenovo
 */
public class PBO310117086Latihan31ObjectOrintedPerkenalkanMahasiswa {

    /**
     * @param args the command line arguments
     * NAMA : RD Muhammad Djulfikar BU 
     * KELAS : IF3 
     * NIM : 10117086
     * DESKRIPSI PROGRAM :
     */
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setNim("10110269");
        mhs1.setNama("Rizki Adam");
        mhs1.perkenalkanDiri();

        mahasiswa mhs2 = new mahasiswa();
        mhs2.setNim("10110270");
        mhs2.setNama("Indra Tiola");
        mhs2.perkenalkanDiri();

        mahasiswa mhs3 = new mahasiswa();
        mhs3.setNim("10110271");
        mhs3.setNama("Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        mahasiswa mhs4 = new mahasiswa();
        mhs4.setNim("10110272");
        mhs4.setNama("Muhammad Nur Awaluddin");
        mhs4.perkenalkanDiri();
    }

}
