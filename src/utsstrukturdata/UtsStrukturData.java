/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsstrukturdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ardin
 */
public class UtsStrukturData {

    /**
     * @param args the command line arguments
     */
    static LinkedList<Mahasiswa> mList = new LinkedList<>();
    static List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public static void firstTask() {
        int[] randomNumber = new int[15];
        int[] ganjil = new int[15];
        int[] genap = new int[15];
        Random random = new Random();

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = random.nextInt();
        }
        for (int i = 0; i < randomNumber.length; i++) {
            int j = randomNumber[i];
            if (j % 2 == 0) {
                genap[i] = j;
            } else {
                ganjil[i] = j;
            }
        }
        System.out.println("Array Random Number -> " + Arrays.toString(randomNumber));
        System.out.print("\nAngka Genap -> ");
        for (int j = 0; j < genap.length; j++) {
            if (genap[j] != 0) {
                System.out.print(genap[j] + ",");
            }
        }
        System.out.println("");

        System.out.print("\nAngka Ganjil -> ");
        for (int k = 0; k < ganjil.length; k++) {
            if (ganjil[k] == 0) {
                System.out.print(ganjil[k] + ",");
            }
        }
        System.out.println("");
    }

    static void sort(int arr[]) {
        //selection
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void secondTask() {
        int[] angka = new int[10];
        Scanner valueArray = new Scanner(System.in);

        System.out.println("Masukan Isi Dari Array");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan Index ke-" + (i + 1) + " : ");
            angka[i] = valueArray.nextInt();
        }
//        bubbleSort(angka);
        sort(angka);
        System.out.println("Isi Arraay : " + Arrays.toString(angka));
    }

    static void bubbleSort(int array[]) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void thirdTask(boolean fourthTask) {
        mahasiswaList.add(new Mahasiswa(11111, "Ardi Naufan Hadian", "TIFRM22A", 181122));
        mahasiswaList.add(new Mahasiswa(11112, "Endang Sudirman", "TIFRM22B", 181122));
        mahasiswaList.add(new Mahasiswa(11113, "Enda Sudarsono", "TIFK22A", 181122));
        mahasiswaList.add(new Mahasiswa(11114, "Nandang Soekamti", "TIFK22B", 181122));
        mahasiswaList.add(new Mahasiswa(11115, "Nina Bobo", "TIFRM22C", 181122));

        if (!fourthTask) {
            mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
            System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
            mahasiswaList.remove(1);

            mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
            System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        } else {
            fourthTask();
        }
    }

    static void fourthTask() {
        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        
        mList.addAll(mahasiswaList);
        
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        mList.add(new Mahasiswa(id, name, kelas, tanggal));

        mList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        mList.removeIf(mahasiswa -> mahasiswa.getName().equalsIgnoreCase(nameRemove));
        mList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

    }

    public static void soal(){
        int noSoal = 0;
        Scanner masukanSoal = new Scanner(System.in);
        String soal = "1. Buat 15 random array integer dan print semua datanya tentukan ganjil dan genap setiap\n"
                + "angka random tersebut?\n"
                + "2. Buat array dengan isi 10 element dengan melakukan input dengan menggunakan scanner\n"
                + "lakukan sorting bubble/selection print data hasilnya (bubble absen genap, selection absen\n"
                + "ganjil)\n"
                + "3. Buat array list dengan class Mahasiswa (id int, name string, kelas string, tglMasuk int)\n"
                + "tambahkan minimal 5 data kedalamnya, tambahkan constructor, getter setter, dan toString\n"
                + "method, coba lakukan print all, lakukan remove, add, print all, menghitung size\n"
                + "4. Buat simple linkedlist menggunakan jdk bawaan JAVA menggunakan class mahasiswa nomor\n"
                + "3 dan lakukan scanner untuk input data kedalam linkedlistnya, lakukan add, remove, print\n"
                + "all kedalam element linkedlist";
        System.out.println(soal);
        System.out.print("Masukan No Soal Uts : ");
        noSoal = masukanSoal.nextInt();
        switch (noSoal) {
            case 1:
                firstTask();
                next();
                break;
            case 2:
                secondTask();
                next();
                break;
            case 3:
                thirdTask(false);
                next();
                break;
            case 4:
                thirdTask(true);
                next();
                break;
            default:
                soal();
        }
    }

    static void next(){
        Scanner lanjut = new Scanner(System.in);
        System.out.println("Lanjut Atau Tidak?");
        System.out.println("1. Yes\n" + "2. No");
        System.out.print("Masukan Pilihan Anda : ");
        int next = lanjut.nextInt();
        if (next == 1) {
            System.out.println("\n\n\n\n\n");
            soal();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args){
        soal();
    }

}
