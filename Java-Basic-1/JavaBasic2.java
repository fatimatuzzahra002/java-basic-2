import java.util.Scanner;

public class JavaBasic2 {
    public static void main(String [] args){ 
        Scanner scanner = new Scanner(System.in);
        int nilai;
        System.out.println("input Nilai yukk");
        nilai = scanner.nextInt(); 

        if (nilai >= 0 && nilai <= 20) {
            System.out.println(" Nilai yang cocok : E");
        } else if (nilai >= 21 && nilai <= 40) {
            System.out.println("Nilai yang cocok : D");
        } else if (nilai >= 41 && nilai <= 60) {
            System.out.println("Nilai yang cocok : C");
        } else if (nilai >= 61 && nilai <= 80) {
            System.out.println("Nilai yang cocok : B");
        } else if (nilai >= 81 && nilai <= 100) {
            System.out.println("Nilai yang cocok : A");
        } else if (nilai >= 100) {
            System.out.println("Nilai yang diinput melebihi batas");
        }

        
    }
}