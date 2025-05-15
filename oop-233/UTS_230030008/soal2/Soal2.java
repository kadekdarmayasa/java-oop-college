package soal2;

import java.util.ArrayList;

public class Soal2 {
    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        // Menambahkan 10 objek buku ke dalam daftar
        daftarBuku.add(new Buku(
            "The Software Architect Elevator: Beyond the Ivory Tower", 
            "Gregor Hohpe", 
            "O'Reilly Media", 
            2022
        ));
        daftarBuku.add(new Buku(
            "Accelerate: The Science of Lean Software and DevOps: Building and Scaling High Performing Technology Organizations", 
            "Nicole Forsgren, Jez Humble, Gene Kim", 
            "IT Revolution Press", 
            2018 
        ));
        daftarBuku.add(new Buku(
            "Team Topologies: Organizing Business and Technology Teams for Fast Flows", 
            "Matthew Skelton, Manuel Pais", 
            "IT Revolution Press", 
            2019 
        ));
        daftarBuku.add(new Buku(
            "Continuous Delivery: Reliable Software Releases through Build, Test, and Deployment Automation", 
            "Jez Humble, David Farley", 
            "Addison-Wesley Professional", 
            2010  
        ));
        daftarBuku.add(new Buku(
            "Inspired: How to Create Tech Products Customers Love", 
            "Marty Cagan", 
            "SVPG Press", 
            2018   
        ));
        daftarBuku.add(new Buku(
            "Escaping the Build Trap: How Effective Product Management Creates Real Value", 
            "Melissa Perri", 
            "O'Reilly Media", 
            2018   
        ));
        daftarBuku.add(new Buku(
            "Sapiens: A Brief History of Humankind", 
            "Yuval Noah Harari", 
            "Harper", 
            2014    
        ));
        daftarBuku.add(new Buku(
            "Educated: A Memoir", 
            "Tara Westover", 
            "W. W. Norton & Company", 
            2018    
        ));
        daftarBuku.add(new Buku(
            "Where the Crawdads Sing", 
            "Delia Owens", 
            "G.P. Putnam's Sons", 
            2018    
        ));
        daftarBuku.add(new Buku(
            "Becoming", 
            "Michelle Obama", 
            "Crown", 
            2021    
        ));

        // Menampilkan informasi buku yang terbit setelah tahun 2020
        for(Buku buku: daftarBuku) {
            if(buku.tahunTerbit > 2020) {
                buku.info();
                System.out.println();
            }
        }
    }
}
