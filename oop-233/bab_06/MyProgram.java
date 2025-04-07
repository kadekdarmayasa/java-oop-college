package bab_06;

public class MyProgram {
    public static void main(String[] args) {
        // Memeriksa apakah ada argumen
        if (args.length > 0) {
            switch (args[0]) {
                case "version":
                    // Tampilkan versi program
                    System.out.println("v 1.0.0");
                    break;
                case "help":
                    // Tampilkan bantuan program
                    System.out.println("Berikut adalah list bantuan penggunaan program:");
                    System.out.println("MyProgram version \t untuk menampilkan versi program");
                    System.out.println("MyProgram help \t\t untuk menampilkan bantuan");
                    System.out.println(
                        "MyProgram hay \t\t untuk menampilkan pesan hello STIKOM Bali");
                    System.out.println(
                        "MyProgram hay [nama] \t untuk menampilkan pesan hello [nama]");
                    break;
                case "hay":
                    // Tampilkan pesan hello
                    if (args.length > 1) {
                        System.out.println("Hello " + args[1]);
                    } else {
                        System.out.println("Hello STIKOM Bali");
                    }
                    break;
                default:
                    // Tampilkan ketika argumen tidak dikenali
                    System.out.print("Argumen tidak dikenali. ");
                    System.out.println("Silahkan ketik 'MyProgram help' untuk menampilkan bantuan");
            }
        } else {
            System.out.println("Tidak ada argumen yang diberikan");
        }
    }
}
